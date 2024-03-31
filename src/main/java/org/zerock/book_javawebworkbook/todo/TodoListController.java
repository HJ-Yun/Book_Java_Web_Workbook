package org.zerock.book_javawebworkbook.todo;

import org.zerock.book_javawebworkbook.todo.dto.TodoDTO;
import org.zerock.book_javawebworkbook.todo.service.TodoService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "/todoController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public TodoListController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Called TodoController in doGet()");

        List<TodoDTO> dtoList = TodoService.INSTANCE.getList();

        request.setAttribute("list", dtoList);

        request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}