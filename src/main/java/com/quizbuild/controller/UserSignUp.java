package com.quizbuild.controller;

import com.quizbuild.entity.User;
import com.quizbuild.persistence.GenericDao;
import com.quizbuild.util.DaoFactory;
import org.apache.logging.log4j.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (
        urlPatterns = {"/signUpUser"}
)

public class UserSignUp extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = new User();
        // set fields
        user.setUserName(req.getParameter("userName"));
        user.setEmail(req.getParameter("email"));
        user.setFirstName(req.getParameter("firstName"));
        user.setLastName(req.getParameter("lastName"));
        user.setPassword(req.getParameter("password"));
        logger.debug("Adding User: " + user);


        // probably do some type of verification...
        GenericDao dao = DaoFactory.createDao(User.class);
        dao.insert(user);

    }
    RequestDispatcher dispatcher = req.getRequestDispatcher("/signUpConfirmation.jsp");
        dispatcher.forward(req, resp);
}
