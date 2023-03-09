import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;



//todo Create a page view counter (in COunter SErvlet Class)
//todo #3 Create a page that displays a number that goes up by one every time the /count page is viewed.


//todo Bonus
//
//#4 todo Allow the user to pass a parameter in the query string to reset the counter.

@WebServlet("/count")
public class CounterServlet extends HttpServlet {

    public static int count = 0;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String reset = request.getParameter("reset");
        if(reset != null){
            count = 0;
        }
        response.getWriter().println(count);
        count++;

    }

}
