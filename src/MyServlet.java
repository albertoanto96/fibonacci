import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InterruptedIOException;

@WebServlet(name="MyServlet")
    public class MyServlet extends HttpServlet{
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

            int operando1= Integer.parseInt(request.getParameter("operando1"));
            int operando2=Integer.parseInt(request.getParameter("operando2"));
            ServletOutputStream out =response.getOutputStream();
            int sol=0;
            if("SUMA".equals(request.getParameter("operacion"))){
                sol=operando1+operando2;
                out.print("<html><body><h1>"+sol+"</h1></body></html>");
            }
            if("RESTA".equals(request.getParameter("operacion"))){
                sol=operando1-operando2;
                out.print("<html><body><h1>"+sol+"</h1></body></html>");
            }
            if("MULTIPLICACION".equals(request.getParameter("operacion"))){
                sol=operando1*operando2;
                out.print("<html><body><h1>"+sol+"</h1></body></html>");
            }
            if("DIVISION".equals(request.getParameter("operacion"))){
                sol=operando1/operando2;
                out.print("<html><body><h1>"+sol+"</h1></body></html>");
            }

        }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.getOutputStream().println("<html><body><h1>SERVLET</h1></body></html>");
        }
    }

