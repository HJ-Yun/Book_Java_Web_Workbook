package org.zerock.book_javawebworkbook.calc;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "/CalcController", urlPatterns = "/calc/makeResult")
public class CalcController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CalcController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");

        System.out.printf(" num1 : %s",num1);
        System.out.printf(" num2 : %s",num2);

        response.sendRedirect("/index");
    }
}