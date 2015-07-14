import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.oreilly.servlet.*;
import java.sql.*;

public class Temp249 extends HttpServlet                         // Uploading Servlet
{
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
	res.setContentType("text/html");
	try
	    {
		MultipartRequest mpr = new MultipartRequest(req, "/media/rishabh/Server/Apache/webapps/Music/Uploaded", 50*1024*1024);
	    }
	catch(Exception e)
	    {
	    }
    }
}
