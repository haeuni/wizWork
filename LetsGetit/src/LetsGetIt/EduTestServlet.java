package LetsGetIt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 2018_04_18
// [문제2] 자료형과 스크립틀릿

//@WebServlet("/EduTestServlet")
public class EduTestServlet extends HttpServlet{
	
	//서블릿이 요청을 받으면 이벤트 처리 방식으로 자동으로 호출되는 메소드
    //HttpServlet에 정의된 메소드를 오버라이딩해서 개발자가 요청이 있을경우 어떤처리를 해야 하는지 명시해준다.
	//@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {	
		
		int sum = 0, holcnt = 0, gop=1;		
		
		//1~55의 합
		for(int i=1; i<=55; i++){			
			sum += i;	
		}
		System.out.println(sum);		
		
		//1~20의 곱
		for (int i = 1; i <= 10; i++) {
		      gop *= i;
		}
		System.out.println(gop);
	
		//1~100중에 홀수의 개수
		for(int i=1; i<=100; i++){
			if(i%2 != 0){
				holcnt += 1; 
			}		
		}
		System.out.println(holcnt);

		//List 선언
		List<Integer> numbers = new ArrayList<Integer>();
		
		//1부터 55까지 값을 담기
		for(int i=1; i<=55; i++){
		    numbers.add(i);   
		}
		
		for(int i=1; i<=numbers.size(); i++) {
			System.out.println(i);
		}

		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		//각각 문제 조건에 맞는 값을 저장
		map.put("sum", sum);
		map.put("gop", gop);
		map.put("holcnt", holcnt);
					
		//System.out.println(map.get("sum"));
		
		request.setAttribute("eduTestServlet", numbers);
		request.setAttribute("eduHash", map);
		RequestDispatcher dispatcher = request.getRequestDispatcher("eduTest.jsp");
		dispatcher.forward(request, response);
	
	}
}










