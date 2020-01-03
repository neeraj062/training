package com.mycompany.app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class MyServlet extends HttpServlet {

    /**
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	
    	RequestDispatcher dispatcher = req.getRequestDispatcher("/second");
    	dispatcher.forward(req,resp);
        /*//PrintWriter writer = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
     
        PrintWriter writer=resp.getWriter();
		String html ="<h1>servlet  hello  " +username +" your password is " +password;
		writer.println(html);
        //writer.println("hello hyderabad");*/
    }
/*
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    }*/
}







