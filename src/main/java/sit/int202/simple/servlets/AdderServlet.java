package sit.int202.simple.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AdderServlet", value = "/Adder")
public class AdderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request,response);
    }
    private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String x = request.getParameter("x");
        String y = request.getParameter("y");
        Double result = Double.valueOf(x) + Double.valueOf(y);
        request.setAttribute("x",x );
        request.setAttribute("y",y );
        request.setAttribute("result",result );
//        request.getRequestDispatcher("/adder.jsp").forward(request,response);
        getServletContext().getRequestDispatcher("/adder.jsp").forward(request,response);
    }
}
