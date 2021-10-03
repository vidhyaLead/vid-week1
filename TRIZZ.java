package simplepgm;

public class TRIZZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num = 8;
	
	if (num%3 !=0 && num%5 !=0) {
		
		System.out.println("TRIZZ FIZZ");
		
	} else if(num%3 ==0)
	{
		System.out.println("TRIZZ the number is div by 3");
		
	}
	
	else if (num%5 == 0){
		
		System.out.println("FIZZ the num is div by 5");

	}
	

	}

}
