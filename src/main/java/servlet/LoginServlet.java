package servlet;

import domain.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.log4j.Logger;
import service.UserService;
import service.impl.UserServiceImpl;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "login", value = "/login")

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final UserService userService = UserServiceImpl.getUserServiceImpl();
    private static final Logger LOGGER = Logger.getLogger(LoginServlet.class);


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = null;
        try {
            user = userService.getByUserEmail(email);
        } catch (SQLException e) {
            LOGGER.error(e);
        }

        if (user != null && user.getUserPassword().equals(password)) {
            request.setAttribute("userEmail", email);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

}
