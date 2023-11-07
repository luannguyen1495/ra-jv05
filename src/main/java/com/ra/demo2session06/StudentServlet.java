package com.ra.demo2session06;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "studentServlet",value = "/student")
public class StudentServlet extends HttpServlet {

    private final List<Student> students = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        students.add(new Student("B01","Cong Phuong",18,true));
        students.add(new Student("B02","Tien Linh",18,true));
        students.add(new Student("B03","Tien Ho",18,false));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("students",students);
        req.getRequestDispatcher("student.jsp").forward(req,resp);
    }
}
