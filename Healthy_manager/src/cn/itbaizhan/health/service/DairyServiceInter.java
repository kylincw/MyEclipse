package cn.itbaizhan.health.service;

import cn.itbaizhan.health.po.Dairy;
import cn.itbaizhan.health.po.Teacher;

public interface DairyServiceInter {

	public boolean add(Dairy dairy)throws Exception;

	public Dairy find(Teacher teacher,String day)throws Exception;
}
