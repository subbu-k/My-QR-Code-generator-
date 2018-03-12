package com.Qrcode.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Qrcode.QRCode_Generator;

/**
 * Servlet implementation class QR_Controller
 */
@WebServlet("/QR_Controller")
public class QR_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QR_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Details=request.getParameter("details");
		
		QRCode_Generator obj1=new QRCode_Generator();
	
		
		int b = obj1.generateCode(Details);
		
			//System.out.println("number="+ b);
		if(b!=0)
			response.sendRedirect("Code.jsp?msg="+b);
			
			
		
			
	
	}

}
