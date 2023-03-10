package model;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/people")
public class PersonIndexServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Person p1 = new Person("Fred Smith", 24);
        Person p2 = new Person("Sally Smith", 34);
        Person p3 = new Person("Andy Smith", 14);

        List<Person> people = new ArrayList<>(Arrays.asList(
                p1,
                p2,
                p3

        ));
        request.setAttribute("people", people);
        request.getRequestDispatcher("people.jsp").forward(request, response);
        response.sendRedirect("/hello");

    }
}