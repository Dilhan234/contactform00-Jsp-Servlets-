

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        // Perform server-side validation (you can add more validation logic)
        if (name.isEmpty() || email.isEmpty() || message.isEmpty()) {
            response.sendRedirect("index.html"); 
        } else {
           

            // Redirect to a "Thank You" page
            response.sendRedirect("contact.jsp");
        }
    }
}