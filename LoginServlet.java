package com.example;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("txtName");
        String pwd = request.getParameter("txtPwd");

        response.setContentType("text/html");

        if (USERNAME.equals(name) && PASSWORD.equals(pwd)) {
            response.getWriter().println("<h2>Welcome, " + name + "!</h2>");
        } else {
            response.getWriter().println("<h2>Invalid username or password</h2>");
        }
    }
}

