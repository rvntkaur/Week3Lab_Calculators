package CalculatorServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kaurr
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        String age = request.getParameter("age");
        
         
        if (age == null || age.equals("")) {
        request.setAttribute("error","You must give your current age");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        
       return;
        
        }
            try 
                {
                int age_no = Integer.parseInt(age);
                age_no = age_no + 1;


                request.setAttribute("error","Your age next birthday will be " + age_no);
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);

                }
            catch (Exception e)
                {
                request.setAttribute("error","You must enter a number." );
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
                }
        
        } 
       
        
    }

 


