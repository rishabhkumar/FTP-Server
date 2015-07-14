import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Temp253 extends HttpServlet                      // Download Button
{
    public void doGet(HttpServletRequest req1, HttpServletResponse res1) throws IOException, ServletException
    {
	ServletOutputStream stream1 = null;
	String filename = req1.getParameter("name");
	BufferedInputStream buf1 = null;
	try
	    {
		stream1 = res1.getOutputStream();
		res1.setContentType("audio/mpeg");
		String ss = getServletContext().getRealPath("/Uploaded/" + filename);
		File media = new File(ss);
		res1.addHeader("content-disposition", "attachment;filename=" + filename);
		res1.setContentLength((int)media.length());
		FileInputStream fin1 = new FileInputStream(media);
		buf1 = new BufferedInputStream(fin1);
		int readBytes1 = 0;
		while((readBytes1 = buf1.read()) != -1)
		    {
			stream1.write(readBytes1);
		    }
	    }
	catch(Exception e)
	    {
	    }
    }
}
