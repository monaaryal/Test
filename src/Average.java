


public class Average {

/* 	file.name:Average.java
	the object is to find the average of all test scores
	
	Evaluation
	Grade greater than 70 is considered passing
	Display pass or fail

*/

	public static void main (String[] args){
		/* float exam1 = 96.10f;
		float exam2 = 95f;
		float exam3 = 100f;
		*/
		float exams[] = {100f,95f,75f,100f,90f};
		
		float average = (exams[0] +exams[1] + exams[2] + exams[3] +exams[4] ) /exams.length;
		String status = "";
		
		if (average> 70 ){
			status = "passing";
		}
		else {
			status = "failling";
			}
			
		
	System.out.println("The average is " + average );
	 System.out.println("status is " + status);

	}




	}