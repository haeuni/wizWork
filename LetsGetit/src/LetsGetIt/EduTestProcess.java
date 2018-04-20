package LetsGetIt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EduTestProcess {	
	
		int result;
	
		public EduTestProcess(int num) {	
			
			for (int i = 1; i < 10; i++) {				 
				if (num > 1) {	           
					result = num * (i);
					System.out.println(num+ "*" + (i) + "=" + num * (i));
				}
				else{
					System.out.println("입력 에러!!");	
				}	
			}						
		}

		public int getGugudanResult() {
			
			return result;
		}		
}
