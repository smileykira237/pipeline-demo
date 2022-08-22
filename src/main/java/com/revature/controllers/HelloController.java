package com.revature.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		String URI = request.getRequestURI();
		System.out.println(URI);
		
		PrintWriter print = response.getWriter();
		print.print("<h1>Hello from your doGet method!</h1>");
		response.setStatus(218);
		response.setHeader("content-type", "text/html");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		String URI = request.getRequestURI();
		System.out.println(URI);
		
		PrintWriter print = response.getWriter();
		print.print("<h1>Hello from your doPost method!</h1>");
		response.setStatus(218);
		response.setHeader("content-type", "text/html");
		
	}
}
