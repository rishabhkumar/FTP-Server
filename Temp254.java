import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class Temp254 extends HttpServlet                 // Suggestions Updation Servlet
{
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
	res.setContentType("text/html");
	String title = req.getParameter("title");
	try
	    {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/emp1", "root", "resenttome");
		Statement s = c.createStatement();
		s.executeUpdate("insert into songs_record(title) values('" + title + "')");
	    }
	catch(Exception e)
	    {
	    }
    }
}
