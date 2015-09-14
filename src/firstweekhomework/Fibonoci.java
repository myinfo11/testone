package firstweekhomework;

public class Fibonoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int past=0,present=1,future=0;
		
		while (future<=100){
			
		    System.out.print(" "+future);
		    past=present;
		    present=future;
		    future = past + present;
			
		}
	
		
		
	}

}
