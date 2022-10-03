package com.example.bai9;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        if("admin".equals(userName)&& "admin".equals(passWord)){
            writer.println("<h1>Welcome"+ userName +" to website</h1>");
        }else{
            writer.println("<h1>Login Error</h1>");
        }
        writer.println("</html");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}