import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="MyServlet2")
public class MyServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        float operando1 = Float.parseFloat(request.getParameter("operando1"));
        float operando2 = Float.parseFloat(request.getParameter("operando2"));
        String operacion = request.getParameter("operacion");
        double sol = 0;
        if ("SUMA".equals(operacion)) {
            sol = operando1 + operando2;

        }
        if ("RESTA".equals(operacion)) {
            sol = operando1 - operando2;

        }
        if ("MULTIPLICACION".equals(operacion)) {
            sol = operando1 * operando2;

        }
        if ("DIVISION".equals(operacion)) {
            sol = operando1 / operando2;

        }
        request.setAttribute("result", sol);
        request.getRequestDispatcher("CalculadoraV2print.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int fibo1 = 1;
        int fibo2 = 1;
        int j = 0;
        int numero = Integer.parseInt(request.getParameter("sucesiones"));
        List<Integer> fibo= new ArrayList<Integer>();
        fibo.add(fibo1);
        for (int i = 2; i <= numero; i++) {
            fibo.add(fibo2);
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        request.setAttribute("fibo", fibo);
        request.getRequestDispatcher("FibonacciV2.jsp").forward(request, response);
    }
}