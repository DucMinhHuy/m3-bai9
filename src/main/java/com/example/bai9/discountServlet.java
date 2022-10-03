package com.example.bai9;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="servlet",value = "/money")
public class discountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

    }
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        String description=request.getParameter("productDescription");
        float price=Float.parseFloat(request.getParameter("listPrice"));
        float percent=Float.parseFloat(request.getParameter("discountPercent"));
        float discountAmount= (float) (price*percent*0.01);
        float discountPrice= price-discountAmount;
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1>mo ta san pham:"+description+"</h1>");
        writer.println("<h1>gia niem yet:"+price+"</h1>");
        writer.println("<h1>ti le chiet khau:"+percent+"</h1>");
        writer.println("<h1>luong chiet khau:"+discountAmount+"</h1>");
        writer.println("<h1>gia sau khi chiet khau:"+discountPrice+"</h1>");
        writer.println("</html>");
    }
}
