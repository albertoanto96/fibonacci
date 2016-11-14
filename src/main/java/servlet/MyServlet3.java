package servlet;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="MyServlet3")
public class MyServlet3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        float operando1 = Float.parseFloat(request.getParameter("operando1"));
        float operando2 = Float.parseFloat(request.getParameter("operando2"));
        String operacion = request.getParameter("operacion").toString();
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
    PrintWriter out = response.getWriter();
        out.println(sol);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int fibo1 = 1;
        int fibo2 = 1;
        String numero = (request.getParameter("sucesiones"));
        int numero2= Integer.parseInt(numero);
        numero2=-(numero2+1);
        List<Integer> fibo= new ArrayList<Integer>();
        fibo.add(fibo1);
        for (int i = 2; i <= numero2; i++) {
            fibo.add(fibo2);
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        String json=new Gson().toJson(fibo);
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println(json);

    }
}