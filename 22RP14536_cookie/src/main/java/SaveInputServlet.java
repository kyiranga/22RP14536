import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/22RP14527_cookie")
public class SaveInputServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        String userInput = request.getParameter("userInput");
       

        Cookie userInputCookie = new Cookie("userInput", userInput);
        userInputCookie.setMaxAge(24 * 60 * 60); 
        response.addCookie(userInputCookie);

        request.setAttribute("userInput", userInput);
        request.getRequestDispatcher("/correct.html").forward(request, response);
    }
}
   