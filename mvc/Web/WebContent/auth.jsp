<%@page import="security.Security" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

       
       <%
         
       String username=request.getParameter("username");
       String userpassword=request.getParameter("userpassword");
       System.out.println(username+ userpassword);
       
       Security objsecurity= new Security();
       boolean result=objsecurity.isUserValid(username, userpassword);
       
       if(result)
       {
    	   session.setAttribute("nm",username);
       
    	    response.sendRedirect("dashboard.jsp");
       }
       else
    	   response.sendRedirect("error.html");
       
       %>
