package sit.int202.simple.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet(name = "TestRequestParameterServlet", value = "/TestRequestParameter")
public class TestRequestParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/favorite_subjects.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paramValues[] = request.getParameterValues("fav_subjects");
        if(paramValues==null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,"Missing fav_subjects");
            return;
        }
        request.getRequestDispatcher("/favorite_subjects.jsp").forward(request, response);
        Map<String, String[]> paramMap = request.getParameterMap();
        System.out.println("Name: "+ paramMap.get("name")[0]);
        System.out.println("Favorite Subjects[0]: "+ paramMap.get("fav_subjects")[0]);
        System.out.println("Favorite Subjects[1]: "+ paramMap.get("fav_subjects")[1]);

//        Enumeration<String> params = request.getParameterNames();
//        while (params.hasMoreElements()) {
//            String paramName = params.nextElement();
//            String paramValue = request.getParameter(paramName);
//            System.out.println(paramName + " = " + paramValue);
//        }
//        System.out.println("---");
//        String paramValues[] = request.getParameterValues("fav_subjects");
//        System.out.println("Favorite Subjects:");
//        for (String value : paramValues) {
//            System.out.println("\t"+ value);
//        }
//        System.out.println("---------------");
    }
}
