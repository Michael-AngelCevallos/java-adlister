import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "guessServlet", value = "/guess")
public class guessServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Random random = new Random();
        int  rand = random.nextInt(3 - 1) + 1;
        System.out.println("random number is " + rand );
        String guess = request.getParameter("guess");

        System.out.print(guess);

        if(Integer.parseInt(guess) == rand){
            response.sendRedirect("/correct");
        }else{
            response.sendRedirect("/incorrect");
        }

    }

}
