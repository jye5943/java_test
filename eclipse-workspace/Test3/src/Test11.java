import java.util.Random;

public class Test11 {
public static void main(String[] args) {
	
	Random randNumber = new Random();
	
	int r1 = randNumber.nextInt(100) ; 
  r1= r1 % 6;
		 r1= r1 + 1;
		 
	if (r1==1) {
	 System.out.println("멍멍");
	 } else if (r1 == 2) {
	 System.out.println("야옹");
	 } else  {
	 System.out.println(r1);
	
	switch(r1){
		case 1 :
			System.out.println("멍멍");
			break; //break를 꼭 써줘야 함
		case 2 : 
			System.out.println("야옹");
			break;
		case 3 :
			System.out.println("3");
			break;
		case 4 :
			System.out.println("4");
			break;
		case 5  :
			System.out.println("5");
			break;
		default : 
				System.out.println("6");
	
	
	 }
	 }}
}



