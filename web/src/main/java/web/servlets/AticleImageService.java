package web.servlets;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.killok.dao.model.entities.Article;
import ua.killok.dao.model.interfaces.LibEntity;

@WebServlet(urlPatterns="/AticleImageService")
public class AticleImageService extends HttpServlet{
	
	LibEntity le ;

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("image/jpeg");
		OutputStream out = resp.getOutputStream();
		try {
			int ix = Integer.valueOf(req.getParameter("index"));
			@SuppressWarnings("unchecked")
			List<LibEntity> jpg = (List<LibEntity>) req.getSession(false).getAttribute("currentlist");
			
			for(LibEntity l:jpg)if(((Article)l).getId()==ix)le=l;
			
			resp.setContentLength(((Article)le).getPicture().length);
			out.write(((Article)le).getPicture());
		}finally {
			out.close();
		}
		
		
	}
	
	
}