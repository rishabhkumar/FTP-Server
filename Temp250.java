import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Temp250 extends HttpServlet              //Surf Servlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
	res.setContentType("audio/mpeg");
	String fileName = req.getParameter("name");
	ServletOutputStream stream = null;
	BufferedInputStream buf = null;
	try
	    {
		stream = res.getOutputStream();
		String s1 = getServletContext().getRealPath("/Uploaded/" + fileName);
		File file = new File(s1);
		res.setContentLength((int)file.length());
		FileInputStream fin = new FileInputStream(file);
		buf = new BufferedInputStream(fin);
		int readBytes = 0;
		while((readBytes = buf.read()) != -1)
		    {
			stream.write(readBytes);
		    }
	    }
	catch(Exception e)
	    {
		
	    }
    }
}
