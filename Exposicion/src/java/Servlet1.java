import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String hexadecimal = request.getParameter("colorenviado");
        if(hexadecimal.matches("^[0-9a-fA-F]+$")){
        Long plipli = Long.parseLong(hexadecimal,16);
        if(plipli > 16777215 || plipli < 0)
            response.getWriter().write("error");
        else response.getWriter().write(hexadecimal);
        }else response.getWriter().write("not a hex number");
    }
}
