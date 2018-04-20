package LetsGetIt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//2018_04_18 
//[과제3] 구구단

//@WebServlet("/EduTestGugudan")
public class EduTestGugudan extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {	
		
		doPost(request, response);
	}
		
	//post요청을 처리하기 위한 메소드 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    	
    	int dan1, dan2, dan3;
    	int result1, result2, result3;
    	
    	//인코딩
    	request.setCharacterEncoding("euc-kr");    	 
    	//클라이언트 응답시 전달될 컨텐츠에 대한 mime type과 캐릭터셋을 지정
    	response.setContentType("text/html; charset=UTF-8");    	
    	//클라이언트 응답위해 출력스트림 확보
    	PrintWriter out = response.getWriter();
    	
    	//입력받은 값(단)은 String 형으로 넘겨받기
    	String inputDan1 = request.getParameter("dan1");
		String inputDan2 = request.getParameter("dan2");
		String inputDan3 = request.getParameter("dan3");
	
		//넘어온 값을 int형으로 형 변환하기
		dan1 = Integer.parseInt(inputDan1);
		dan2 = Integer.parseInt(inputDan2);
		dan3 = Integer.parseInt(inputDan3);	  	
		
		//값을 list에 담기
		List<Integer> listdan = new ArrayList<Integer>();
		listdan.add(dan1);
		listdan.add(dan2);
		listdan.add(dan3);				
		
		//구구단 결과 값을 받을 getGugudanResult() 메소드 생성하여 결과 값을 List로 받기
		EduTestProcess eduProcess1 = new EduTestProcess(dan1);
		EduTestProcess eduProcess2 = new EduTestProcess(dan2);
		EduTestProcess eduProcess3 = new EduTestProcess(dan3);
		
		result1 = eduProcess1.getGugudanResult();			
		result2 = eduProcess2.getGugudanResult();
		result3 = eduProcess3.getGugudanResult();
		
		//담긴 list를 요청
		request.setAttribute("result1", result1);
		RequestDispatcher dispatcher = request.getRequestDispatcher("eduTestGugudanProcess.jsp");
		dispatcher.forward(request, response); //두개를 보내준다.
    }
}
