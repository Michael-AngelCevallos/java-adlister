import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



/** Finish up the Hello World Servlet */
//
//todo #1 Create a page that displays "Hello World!" when a user visits /hello


@WebServlet( name = "HelloWorldServlet", urlPatterns= "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.getWriter().println("<h1>hello</h1>");


//        response.getWriter().println("Hello World!");
//
//        PrintWriter pw = response.getWriter();
//
//        String name = request.getParameter("Mike");
//
//
//        //todo Make the page say "Hello, <name>!" if name is passed as part of the query string (e.g. /hello?name=codeup), otherwise default to "Hello, World!".
//        if(name == null){
//            pw.println("<h1>Hello World</h1>");
//        }else {
//            pw.println("Hello" + name);
//        }
//
//        //todo Create a page view counter (in Counter Servlet Class)
        //Create a page that displays a number that goes up by one every time the /count page is viewed.
    }
}
