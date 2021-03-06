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

            float operando1= Float.parseFloat(request.getParameter("operando1"));
            float operando2=Float.parseFloat(request.getParameter("operando2"));
            String operacion=request.getParameter("operacion");
            ServletOutputStream out =response.getOutputStream();
            double sol=0;
            if("SUMA".equals(operacion)){
                sol=operando1+operando2;
                out.print("<html><link href=\"style.css\" rel =\"stylesheet\"><body><h1>EL RESULTADO DE TU "+operacion+" ES: "+sol+"</h1></body></html>");
            }
            if("RESTA".equals(operacion)){
                sol=operando1-operando2;
                out.print("<html><link href=\"style.css\" rel =\"stylesheet\"><body><h1>EL RESULTADO DE TU "+operacion+" ES: "+sol+"</h1></body></html>");
            }
            if("MULTIPLICACION".equals(operacion)){
                sol=operando1*operando2;
                out.print("<html><link href=\"style.css\" rel =\"stylesheet\"><body><h1>EL RESULTADO DE TU "+operacion+" ES: "+sol+"</h1></body></html>");
            }
            if("DIVISION".equals(operacion)){
                sol=operando1/operando2;
                out.print("<html><link href=\"style.css\" rel =\"stylesheet\"><body><h1>EL RESULTADO DE TU "+operacion+" ES: "+sol+"</h1></body></html>");
            }

        }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            int fibo1=1;
            int fibo2=1;
            int numero=Integer.parseInt(request.getParameter("sucesiones"));
            response.getOutputStream().println("<html><link href=\"style.css\" rel =\"stylesheet\"><body><h1>Has solicitado "+numero+" sucesiones</h1></body></html>");
            response.getOutputStream().println("<html><link href=\"style.css\" rel =\"stylesheet\"><body><p>1:"+fibo1+"</p></body></html>");
            for(int i=2;i<=numero;i++){
                response.getOutputStream().println("<html><link href=\"style.css\" rel =\"stylesheet\"><body><p>"+i+": "+fibo2+"</p></body></html>");
                fibo2 = fibo1 + fibo2;
                fibo1 = fibo2 - fibo1;
            }
}
    }

