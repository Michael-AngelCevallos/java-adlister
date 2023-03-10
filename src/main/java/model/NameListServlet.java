package model;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@WebServlet("/names")
public class NameListServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> names = new ArrayList<>(Arrays.asList(
                "Mike",
                "John",
                "Alex",
                "Roman"
        ));
        request.setAttribute("names", names);
//send a response based on the names.jsp
        request.getRequestDispatcher("/names.jsp").forward(request, response);

    }
}