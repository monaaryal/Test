
public class Average1 {

	public static void main(String[] args) {
		float exam1 = 100f;
		float exam2 = 99f;
		float exam3 = 80f;
		
		float average = (exam1 + exam2 + exam3)/3;
		String status = "";
		
		 if (average>70){
			 status="Passed";
					  }
		 else {
			 status ="Failed";
		 }
		 
		 System.out.println("The average is " + average );
		 System.out.println("status is " + status);

	}
}
		 
				
		 

