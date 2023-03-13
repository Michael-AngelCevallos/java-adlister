import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;



//todo Create a page view counter (in COunter SErvlet Class)
//todo #3 Create a page that displays a number that goes up by one every time the /count page is viewed.


//todo Bonus
//
//#4 todo Allow the user to pass a parameter in the query string to reset the counter.

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    private int counter = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        counter ++ ;
        response.getWriter().println("<h1>The count is " + counter + ".</h1>");
    }
}
