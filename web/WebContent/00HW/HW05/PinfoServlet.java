package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PinfoServlet extends HttpServlet{
	
	public void init(ServletConfig config) throws ServletException{
		//System.out.println("init() ... 최초 한번만 실행되는 메소드");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		
		String[] allck = new String[]{"공지메일","광고메일","배송확인메일공지메일"};
		List<String> lstallck = new ArrayList<>(Arrays.asList(allck));
		
		String[] cklst = request.getParameterValues("mailck");
		List<String> lstcklst = new ArrayList<>(Arrays.asList(cklst));
		response.setContentType("text/html; charset=utf-8;");
		PrintWriter out = response.getWriter();
		
		
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>개인정보출력</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h2>개인정보출력</h2>");
		out.println("=============================================<br>");
		out.println("		이름 : " + name + "<br>");
		out.println("		아이디 : " + id + "<br>");
		out.println("		암호 : " + pwd + "<br>");
		out.println("		성별 : " + gender + "<br>");

		for(int v=0; v<lstallck.size(); v++) {
			if(lstcklst.contains(lstallck.get(v))) {//값이 있으면
				out.println(lstallck.get(v) + " : 받음<br>");
			}else {
				out.println(lstallck.get(v) + " : 받지않음<br>");
			}
		}

		out.println("		직업 : " + job + "<br>");
		out.println("=============================================<br>");

		out.println("	</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}

}
