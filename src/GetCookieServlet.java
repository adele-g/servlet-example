import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetCookieServlet")
public class GetCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //<=%%>
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //<%%>
        //всё до этого не будет видно
        PrintWriter pw = response.getWriter();

        pw.println("<html>");

        Cookie[] cookies = request.getCookies();

        for (Cookie cookie : cookies)
            pw.println("<h1> Cookie name is  " + cookie.getName() + ", value is " +
                    cookie.getValue() + "</h1>");

        pw.println("</html>");
    }
}
