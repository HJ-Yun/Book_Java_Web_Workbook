package org.zerock.book_javawebworkbook.todo;

import org.zerock.book_javawebworkbook.todo.dto.TodoDTO;
import org.zerock.book_javawebworkbook.todo.service.TodoService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "/TodoReadController", urlPatterns = "/todo/read")
public class TodoReadController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public TodoReadController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Called TodoReadController in doGet()");

        Long tno = Long.parseLong(request.getParameter("tno"));

        TodoDTO dto = TodoService.INSTANCE.get(tno);

        request.setAttribute("dto", dto);

        request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}