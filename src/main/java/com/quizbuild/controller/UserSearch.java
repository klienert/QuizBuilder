package com.quizbuild.controller;

import com.quizbuild.persistence.GenericDao;
import com.quizbuild.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/searchUser"}
)
public class UserSearch extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao dao = new GenericDao(User.class);

//        conditional for buttons
        if (req.getParameter("submit").equals("search")) {
            req.setAttribute("users", dao.getByPropertyEqual("lastName", (req.getParameter("searchTerm"))));
        } else {
            req.setAttribute("users", dao.getAll());
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}
