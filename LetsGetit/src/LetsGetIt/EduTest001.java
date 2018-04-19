package LetsGetIt;

import java.io.IOException;
import java.util.Scanner;

// 2018_04_18 
// [과제1] 조건문과 반복문
public class EduTest001 {

	public static void main(String[] args) throws IOException {
		
		//Console창에서 값을 입력받기
		//Scanner클래스는 정수, 실수, 문자열을 읽어온다.
		//System.in --> 입력한 값을 바이트 단위로 읽는 것
        Scanner sc = new Scanner(System.in);
        
        int count=0, i, j, l, num;
        
        System.out.print("값을 입력하세요: ");
        
        //nextInt() : 정수형으로 값을 입력받아 정수형 변수 num에 넣기 
        num = sc.nextInt();
        
        sc.nextLine(); // 문자열 전체를 입력받기
        
        // 변수 num을 이용해 받은 값 만큼(중앙 별의 개수) 마름모 만들기
        for(i=1; i<=num; i=i+2)
        {	      
	      for(j=num; j>=i; j=j-2)
	      {
	         System.out.print(" ");	     
	      }
		  for(l=1; l<=i; l++)
		  {
		     System.out.print("*");
		  }
		  //한 차수가 끝나면, 개행.
	      System.out.println();	
        }
        
        //가운데 차수를 제외한 밑의 (역삼각형)
	    for(i=1; i<=num-2; i=i+2)
	    {	      
	      for (j=1; j<=i; j=j+2)
	      {
	          System.out.print(" ");
	      }	      
	      System.out.print(" ");
	  
	      for(l=num-2; l>=i; l--)
	      {
	    	  System.out.print("*");
	      }
	      //차수 끝나면, 개행
	      System.out.println();
	    }
    }     
 }

