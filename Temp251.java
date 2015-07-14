import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;

public class Temp251 extends HttpServlet            // Auto-Suggest Servlet
{
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
	String responseString = new String();
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	String hint = req.getParameter("txtSearch");
	try
	    {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/emp1", "root", "resenttome");
		Statement s = c.createStatement();
		ResultSet rs1 = s.executeQuery("select distint(title) from songs_record where title like 'hint%'");
		while(rs1.next())
		    {
			responseString += rs1.getString(1);
			responseString += "\n";
		    }
		out.println(responseString);
	    }
	catch(Exception e)
	    {
		out.println(e);
	    }
    }
}
