package LetsGetIt;

public class EduTestProcess {

		int result = 0, gop=1;		
		
		public EduTestProcess(int num1, int num2, int num3) {
			
			if(num1 >1 && num1 <10){
				for(int i=1; i<=9; i++) {	
					
					gop = num1*i;
						
					//System.out.println(num1 + "X" + i + "=" + (gop));
				}					
			}
			if(num2 >1 && num2 <10){
				for(int i=1; i<=9; i++) {					
					
					gop = num2*i;
					
					//System.out.println(num2 + "X" + i + "=" + (gop));			
				}	
			}
			if(num3 >1 && num3 <10){
				for(int i=1; i<=9; i++) {					
					
					gop = num3*i;
					
					//System.out.println(num3 + "X" + i + "=" + (gop));			
				}	
			}
			
			//결과변수를 반환하는 메소드
			public int getGugudanResult() {
				return gop;
			}
		}

	}

