package com.filter;

/**
 * @filename SetCharacterEncodingFilter.java
 * @memo 通过WEB中文字符过滤操作类，摘自网络
 */

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class SetCharacterEncodingFilter implements Filter {
    
    protected String encoding = null;
    protected FilterConfig filterConfig = null;
    //protected boolean ignore = true;
    
    public void destroy() {
        this.encoding = null;
        this.filterConfig = null;
    }
   
    class Request extends HttpServletRequestWrapper {
        public Request(HttpServletRequest request) {
            super(request);
        }
       
        public String toChi(String input) {
            try {
               
              byte[] bytes = input. getBytes("ISO-8859-1");
              return new String(bytes, encoding);
            }
            catch (Exception ex) {
            }
            return null;
        }
       
        private HttpServletRequest getHttpServletRequest_r()
        {
            return (HttpServletRequest)super. getRequest();
        }
       
        public String getParameter_r(String name)
        {
            return toChi( getHttpServletRequest_r(). getParameter(name));
        }
       
        public String[] getParameterValues_r(String name)
        {
              String values[] = getHttpServletRequest_r(). getParameterValues(name);
              if (values != null) {
                for (int i = 0; i < values.length; i++) {
                  values[i] = toChi(values[i]);
                }
              }
              return values;
        }
    }
    
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain)
        throws IOException, ServletException {

       // if (ignore || (request. getCharacterEncoding_r() == null)) {
       //     String encoding = selectEncoding(request);
           
       // }
        HttpServletRequest httpreq = (HttpServletRequest)request;
        if(httpreq. getMethod().equals("POST")) {
            request.setCharacterEncoding(encoding);
        } else {
            request = new Request(httpreq);
        }
    // Pass control on to the next filter
        chain.doFilter(request, response);
    }

   
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		this.encoding = filterConfig.getInitParameter("encoding");

	}
}