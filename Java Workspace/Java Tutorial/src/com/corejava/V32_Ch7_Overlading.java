
public class V32_Ch7_Overlading {
	 
	//1.
//	static void tellJoke(){
//		System.out.println("I invented a new word!\n"+ "pilagarism");
//	}
//	
//	public static void main(String[]args) {
//		tellJoke( );
//	}
//	
//	OUTPUT I invented a new word!
//	pilagarism


	   //  2. CASE 1- CHANGING THE INTEGER - IN CASE OF INTEGER VALUE OR OBJECT IS PASSING
	
//	static void change(int a) {
//	//	a=98;
//	}
//	 
//	public static void main(String[]args) {
//		
//		int []marks= {52,52,65,85,85};
//		int x =45;
//		change(x);
//		
//		System.out.println("the value after changw " +x);
//		
//		output =the value after changw 45
				
			
	
	// 2. CHANGING THE ARRAY  - IN CASE OF ARRAY ONLY REFERENCE MEANS LOCATIO IS PASSING
	
//	
//				static void change(int []arr) {
//				arr[0]=98;
//			}
//			 
//			public static void main(String[]args) {
//				
//			int [] marks= {52,52,65,85,85};
//				
//				change(marks);
//				
//				System.out.println("the value after changw " + marks[0]);
				
				//output =the value after changw 98		
				
				
	// METHOD OVERLOADING
				
		static void foo() {
			System.out.println("Good morning bro!");
		}
		
		static void foo(int a) {
			System.out.println("Good morning "+a +"bro");
		}
						
		static void foo(int a, int b){
		    System.out.println("Good morning "+a +"bro");
		    System.out.println("Good morning "+ b+"bro");
		}	
			
		public static void main(String[] args) {
			foo();
			foo(3000);
			foo(3000,4000);
			
			output=
					Good morning bro!
					Good morning 3000bro
					Good morning 3000bro
					Good morning 4000bro
			
		}
	}

