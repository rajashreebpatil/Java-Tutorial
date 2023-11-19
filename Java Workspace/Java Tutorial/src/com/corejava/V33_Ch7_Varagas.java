
public class V33_Ch7_Varagas {

	//	1. ADDITION OFF NUMBERS
		
//		 static int sum(int a,int b) {
//			int c=a+b;
//			return c;
//		}
//		 static int sum(int a,int b,int c,int d) {
//				return a+b+c+d;
//		}
//		public static void main(String[] args) {
//			System.out.println("Welcome to varagas tutorail");
//			System.out.println("the sum of 4and 5 :" +sum(4,5));
//			System.out.println("the sum of number:"+ sum(2,3,4,5));
//			
//		output =
//		Welcome to varagas tutorail
//		the sum of 4and 5 :9
//		the sum of number:14
			
		
//			2. ADDITION BY USING VARAGAS
			
		static int sum(int...arr) {                    // AVAILABLE AS int []arr;
	     int result=0;
	     
	     for(int a:arr) {
	    	 result+=a;
	     }
	     return result;
			}
		
		public static void main(String[] args) {
			System.out.println("welcome to varagas");
			System.out.println("the sum of no "+ sum(2,4,5,6));
		}
		
		output=
		welcome to varagas
		the sum of no 17
			
			
			
}	

		
	

