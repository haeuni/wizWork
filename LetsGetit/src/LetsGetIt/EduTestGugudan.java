package LetsGetIt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//2018_04_18 
//[과제3] 구구단

@WebServlet("/EduTestGugudan")
//1. EduTestGugudan Class파일 생성
public class EduTestGugudan extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {	
		
		doPost(request, response);
	}
		
	//post요청을 처리하기 위한 메소드 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	int gop= 1, result;
    	
    	//클라이언트 응답시 전달될 컨텐츠에 대한 mime type과 캐릭터셋을 지정
    	response.setContentType("text/html; charset=UTF-8");
    	
    	//클라이언트 응답위해 출력스트림 확보
    	PrintWriter out = response.getWriter();
    	
    	//4. 입력받은 값은 String 형으로 넘겨받기
    	String inputDan1 = request.getParameter("dan1");
		String inputDan2 = request.getParameter("dan2");
		String inputDan3 = request.getParameter("dan3");
		
		//5. 넘어온 값을 int형으로 형 변환하기
		int dan1 = Integer.parseInt(inputDan1);
		int dan2 = Integer.parseInt(inputDan2);
		int dan3 = Integer.parseInt(inputDan3);
    	
		//6. EduTestProcess 인스턴스 생성(구구단 로직처리)
		EduTestProcess eduprocess = new EduTestProcess(dan1, dan2, dan3);
		result = eduprocess.getGugudanResult(dan1, dan2, dan3);
		
    	
		//각 입력폼 값이 들어 있는 변수들을 각각의 저장소에 담는다.
		request.setAttribute("dan1", dan1);
		request.setAttribute("dan2", dan2);
		request.setAttribute("dan3", dan3);
				
		RequestDispatcher dadan = request.getRequestDispatcher("/eduTestGugudanProcess.jsp");
		dadan.forward(request, response); //두개를 보내준다.
    }
}
