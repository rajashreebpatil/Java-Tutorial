  
	/*	Exercise 6: You have to create a custom calculator with following operations:
		1. + -> Addition
		2. - -> Subtraction
		3. * -> Multiplication
		4. / -> Division
		which throws the following exceptions:
		1. Invalid input Exception ex: 8 & 9
		2. Cannot divide by 0 Exception
		3. Max Input Exception if any of the inputs is greater than 100000
		4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 700*/

	
   class InvalidInputExcption extends Exception {
	   @Override
	   public String toString() {
		   return "cannot add 8 & 9";
				   }
	   @Override
	   public String getMessage() {
		   return  " I am getMessage();
	   }
	   
	   }


class CustomCalculator{
		double add(double a, double b) throws InvalidInputException {
			if(a==8 || b==9) {
				throw new InvalidInputException();
			}
			return a+b;
		}
		 double substract(double a , double b) {
		return a-b;
		 }
		 double multiply(double a, double b) {
			 return a*b;
		 }
		double divide( double a, double b) {
			return a/b;
		}
		
		public class V87_Exercise_Custom_Calculator {
		public static void main(String[] args) throws InvalidInputException,{
		
		
		CustomCalculator c= new CustomCalculator();
		c.add(8, 9);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
