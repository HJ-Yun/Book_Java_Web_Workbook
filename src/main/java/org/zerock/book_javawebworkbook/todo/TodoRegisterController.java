package org.zerock.book_javawebworkbook.todo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "/TodoRegisterController", urlPatterns = "/todo/register")
public class TodoRegisterController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public TodoRegisterController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Called TodoRegisterController in doGet()");

        request.getRequestDispatcher("/WEB-INF/todo/register.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Called TodoRegisterController in doPost()");

        response.sendRedirect("/todo/list");
    }
}