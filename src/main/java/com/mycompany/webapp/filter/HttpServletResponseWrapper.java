package com.mycompany.webapp.filter;

import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxrs.impl.HttpServletResponseFilter;

public class HttpServletResponseWrapper extends javax.servlet.http.HttpServletResponseWrapper {

	public HttpServletResponseWrapper(HttpServletResponse response) {
		super(response);
		// TODO Auto-generated constructor stub
		HttpServletResponseFilter filter = new HttpServletResponseFilter(response, null);
		
	}
	
	
}