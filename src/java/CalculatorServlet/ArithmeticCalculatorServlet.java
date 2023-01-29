package CalculatorServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet 
{
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
      
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
               
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String op = request.getParameter("op");
               
        if ((first == null || first.equals("")) && (second == null || second.equals(""))){
            request.setAttribute("error", "Result: ---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
                return;
            
        }
        
        try {
            int firstt = Integer.parseInt(first);
            int secondd = Integer.parseInt(second);
            int final_answer = 0;

            request.setAttribute("first", first);
            request.setAttribute("second", second);

            if(op.equals("+")){
                final_answer = firstt + secondd;

                request.setAttribute("error", "Result: " + final_answer);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                return;
            }
            if(op.equals("-")){
                final_answer = firstt - secondd;

                request.setAttribute("error", "Result: " + final_answer);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                return;
            }

            if(op.equals("*")){
                final_answer = firstt * secondd;

                request.setAttribute("error", "Result: " + final_answer);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                return;
            }

            if(op.equals("%")){
                final_answer = firstt  % secondd;

                request.setAttribute("error", "Result: " + final_answer);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                return;
            }
        }
        catch (Exception e){
            
            request.setAttribute("error", "Result: Invalid");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
           
        }
    }
}
        

