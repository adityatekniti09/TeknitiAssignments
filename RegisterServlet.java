import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Register extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("userName");  
String p=request.getParameter("userPass");  
String e=request.getParameter("userEmail");  
String c=request.getParameter("userCountry");  
String g=request.getParameter("gender");  
          
out.print("userName:"+n);  
out.print("emailid:"+e);  
out.print("country:"+c);  
out.print("gender:"+g);  
      
out.close();  
}  
  
}  