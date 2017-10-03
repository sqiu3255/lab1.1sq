
public class ControlStructures {

	public static void main(String[] args) {
	
			
	for (int x = 1; x <= 500 ; x++) 
		
	{

		if ((x % 3 == 0) && (x % 7 == 0 ) && (x % 10 == 0)) {
			System.out.println("foobarbaz");
		}
		else if ((x % 3 == 0) && (x % 7 == 0)) {
			System.out.println("foobar");
		} 
		else if ((x % 3 == 0) && (x % 10 == 0)) {
			System.out.println("foobaz");
		}
		else if ((x % 7 == 0) && (x % 10 == 0)) {
			System.out.println("barbaz");
		} 
		else if (x % 3 == 0) {
			System.out.println("foo");
		}
		else if (x % 7 == 0) {
			System.out.println("bar");
		}
		else if (x % 10 == 0) {
			System.out.println("baz");
		} 
		else {
			System.out.println(x);
		}
		
	} 
	
	for (int i = 2 ; i <= 50 ; i++) {
	
	for (int y = 2 ; y < i ; y++)	
	if (i % y == 0) {
		System.out.println("NOT PRIME");
		} 
	else {
		System.out.print(i + " ");
	}
	}

	
	
	
	
	
	
	
	
	
 }
 }	
	
	
	

