package ActionClasses;


import Model.UserModel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Register" , value = "/Register")
public class Register  extends HttpServlet{    

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {                
         
        String name =req.getParameter("name");
         String pass = req.getParameter("pass");
         
         UserModel user = new UserModel();
         user.setName(name);
         user.setPassword(pass);
         
        HttpSession session= req.getSession();
        session.setAttribute("user", user.getName());
                               
        resp.sendRedirect("HomePage.jsp");
    }        
}
