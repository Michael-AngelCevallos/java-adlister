package model;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet(name = "FightersServlet", value = "/fighters")
public class FightersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Fighter> fighters =  new FighterFactory().generateFighters();
        request.setAttribute("fighters", fighters);
        request.getRequestDispatcher("/fighters.jsp").forward(request, response);
    }


}
