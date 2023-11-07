package com.ra.demo2session06;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "demoServlet",value = "/demo-servlet")
public class DemoServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setAttribute("fullName","Hoang mat goc");
            request.getRequestDispatcher("demo.jsp").forward(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("Huy ");
    }
}
