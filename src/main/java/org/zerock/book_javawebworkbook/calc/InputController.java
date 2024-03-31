package org.zerock.book_javawebworkbook.calc;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "/InputController", urlPatterns = "/calc/input")
public class InputController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public InputController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("InputController...do get...");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/calc/input.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}