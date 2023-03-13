import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", value = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        if (request.getMethod().equals("POST")) {
            String crust = request.getParameter("crust");
            String sauce = request.getParameter("sauce");
            String size = request.getParameter("size").toLowerCase();
            if (crust.equals("hand-tossed") && sauce.equals("tomato") && size.equals("small")) {
                response.sendRedirect("/profile.jsp");
            } else {
                response.sendRedirect("/login.jsp");
            }
        }

        //Makes the new url end in /pizza-order, no need for jsp ending <-----------
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }


    /**Teachers Example (Below)*/

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
//    }
//
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        System.out.println(request.getParameter("crust-type"));
//        System.out.println(request.getParameter("sauce-type"));
//
//        String toppings = request.getParameter("toppings");
//
//        for(String topping : toppings){
//            System.out.print(topping);
//            System.out.print(" ");
//        }
//        System.out.println(" ");
//        System.out.println(request.getParameter("address");
//
//        response.sendRedirect("/login");
//}

}
