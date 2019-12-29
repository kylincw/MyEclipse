package cn.itbaizhan.health.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import javax.jms.BytesMessage;

public class FileOperation {

	/**
	 * getSavePath() + "\\"+ getUploadFileName()
	 * 文件copy到服务器
	 * @throws IOException
	 */
	public static void Dec_COPY_FILE(String filePath, String source) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fos = new FileOutputStream(filePath);// 建立文件输出流
			fis = new FileInputStream(source);// 建立文件上传流
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = fis.read(buffer)) > 0) {
				fos.write(buffer, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(fos, fis);
		}
	}

	/**
	 * 关闭FileOutputStream和FileInputStream
	 * 
	 * @param fos
	 * @param fis
	 */
	private static void close(FileOutputStream fos, FileInputStream fis) {
		if (fis != null) {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("FileInputStream关闭失败");
				e.printStackTrace();
			}
		}
		if (fos != null) {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("FileOutputStream关闭失败");
				e.printStackTrace();
			}
		}
	}

	/**
	 * 逆向读取文件
	 * 
	 * @param path
	 * @return
	 */
	public List<String> getFileReverse(String path) {
		try {
			// 下面是先写文件, 向文件尾追加, 若文件不存在则自动创建文件
			byte[] bytes = new byte[0];
			String rafread = "";
			System.out.println("读取文件:" + path);
			List<String> filelist = new ArrayList<String>();
			FileWriter fw = new FileWriter(path, true); // 用FileWriter打开文件
			PrintWriter pw = new PrintWriter(fw); // 用写指针加载文件
			String[] str = { "" }; // 要写入的字符串
			for (String index : str) {
				pw.println(index); // 每次都向文件尾追加
			}
			pw.close(); // 关闭
			fw.close(); // 关闭

			// 下面定位文件末行, 一行一行向上读取
			RandomAccessFile raf = new RandomAccessFile(path, "r"); // 该类可以定位文件,
			// 是java
			// IO类中唯一可以用来定位的
			long len = raf.length(); // 获得文件的长度,以便定位末尾
			if (len <= 3) { // 判断文件是否为空
				System.out.println("the flie is NULL!");
				return null;
			}
			long pos = len - 1; // 定位文件尾
			int xy = 0;
			String rd = "";
			while ((rafread = raf.readLine()) != null) {
				rd += rafread + "\n";
			}
			raf.seek(pos); // 最后还需要读取第一行
			rd += raf.readLine();
			System.out.println(rd);
			filelist.add(rd);
			raf.close(); // 关闭
			return filelist;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(0);
		return null;
	}

	public String getMyFile(String path) {
		try {
			// 下面是先写文件, 向文件尾追加, 若文件不存在则自动创建文件
			System.out.println("读取文件:" + path);

			// 下面定位文件末行, 一行一行向上读取
			RandomAccessFile raf = new RandomAccessFile(path, "r"); // 该类可以定位文件,
			// 是java
			// IO类中唯一可以用来定位的
			long len = raf.length(); // 获得文件的长度,以便定位末尾
			if (len == 0)
				return null;
			long pos = len - 1; // 定位文件尾
			String abc = null;
			while (pos > 0) { // 判断文件是否到达头
				abc = raf.readLine();
				break;

			}
			raf.seek(pos); // 最后还需要读取第一行
			raf.close(); // 关闭
			return abc;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(0);
		return null;
	}

	/**
	 * 顺序逐行写文件
	 * 
	 * @param path
	 * @param filecontent
	 * @return
	 */
	public String writeFileSequence(String path, List<String> filecontent) {
		String s = new String();
		String s1 = new String();
		try {
			File f = new File(path);
			if (!f.exists()) {
				f.createNewFile();// 不存在则创建
			} else {
				f.delete();
				f.createNewFile();
			}
			BufferedReader input = new BufferedReader(new FileReader(f));
			while ((s = input.readLine()) != null) {
				s1 += s;
			}
			input.close();
			for (int i = 0; i < filecontent.size(); i++) {
				if (filecontent.get(i) == null)
					continue;
				if (filecontent.get(i).trim().length() == 0)
					continue;
				s1 += filecontent.get(i);
			}
			BufferedWriter output = new BufferedWriter(new FileWriter(f));
			output.write(s1);
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s1;

	}

	/**
	 * 写文件
	 * 
	 * @param path
	 * @param filecontent
	 */
	public static void Dec_WRITE_FILE(String path, String filecontent) {
		try {
			File f = new File(path);
			if (!f.exists()) {
				f.createNewFile();// 不存在则创建
			} else {
				f.delete();
				f.createNewFile();
			}
			BufferedWriter output = new BufferedWriter(new FileWriter(f));
			output.write(filecontent);
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
