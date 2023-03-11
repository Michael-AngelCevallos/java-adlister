import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "viewcolor", value = "/viewcolor")
public class viewcolor extends HttpServlet {
    @Override

            public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException {
                response.setContentType("Text/Html");


                //Grabs the ID of color from the form in pickcolor.jsp <-----
                String c = request.getParameter("color");

                //PrintWriter takes in the users text input/ getWriter returns users input to program
                PrintWriter pw = response.getWriter();

                if(c.equals("red"))
                    pw.println("<body BGCOLOR=red>");
                if(c.equals("green"))
                    pw.println("<body BGCOLOR=green>");
                if(c.equals("green"))
                    pw.println("<body BGCOLOR=green>");
                if(c.equals("blue"))
                    pw.println("<body BGCOLOR=blue>");
                if(c.equals("yellow"))
                    pw.println("<body BGCOLOR=yellow>");
                if(c.equals("black"))
                    pw.println("<body BGCOLOR=black>");
                pw.println("<center><h2>Your selected color is: "+c+"</h2></center>");;
                pw.close();

            }
        }





