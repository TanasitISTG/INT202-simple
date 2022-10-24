package sit.int202.simple.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "TestScopeServlet", value = "/TestScope")
public class TestScopeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("rc", "This is request scope");

        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("ac", "This is application scope");

        HttpSession session = request.getSession();
        session.setAttribute("sc", "This is session scope");

        servletContext.getRequestDispatcher("/test_scope.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
