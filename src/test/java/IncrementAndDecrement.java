
public class IncrementAndDecrement {

	public static void main(String[] args) {
		int a , b, c;
		
//		a = 5; 
//		b = a;
//		
//		//Post Increment
//		b = a++; //First A value will be assigned to the value B directly without doing any operation. So, the B value will be whatever initial value A has. 
//				 // Then (a++) 1 will be added to the A. 
//		System.out.println(b);
//		System.out.println(a);
//		
//		//Pre Increment
//		b = ++a; // A aready has value 6 then adding 1 to the A. So, A value becomes 7; 
//		System.out.println(b);
		
		a = 9; 
		b = a;
		System.out.println("B Values : " + b); //9
		
		//Post decrement
		b = a--; 
		System.out.println("A Values : " + a);//8
		a = b; 
		System.out.println("B Values : " + b); //9
		System.out.println("A Values : " + a); //9
		
		//Pre decrement
		b = --a; 

		System.out.println("B Values : " + b); //8
		System.out.println("A Values : " + a); //8
		
		
		
		
		

	}

}
