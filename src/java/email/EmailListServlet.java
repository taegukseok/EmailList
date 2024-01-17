/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package email;

/**
 *
 * @author Taeguk
 */
import user.user;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
        1. Get what the user want to do (e.g. join?)
        2. If they want to be added to the list,
           retrieve the first name, last name, and email.
        3. (Optional) Store data for these user in a database
        4. Redirect the user to the thank you page.
        5. Set and handle the response
        */

        String action = request.getParameter("action");
        String url = "/index.html";

        if(action.equals("add")) {
            // get the user inforamtion
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            // store these information in the database
            user User = new user(firstName, lastName, email);

            // forward the request
            // redirect the user to thank you page
            request.setAttribute("user", User);
            url="/thanks.jsp";
        }

        // forward and redirect
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
