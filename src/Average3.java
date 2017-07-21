



public class Average3{

/* 	file.name:Average.java
	the object is to find the avarage of all test scores
	
	Evaluation
	Grade greater than 70 is considered passing
	Display pass or fail
	
	change the program to add 1 more grade of a 100f

*/


public static void main (String[] args){
	/*float exam1 = 96.10f;
	float exam2 = 95f;
	float exam3 = 100f;
	float exam4	= 100f;
	++ means adding
	*///loops(for loop)
	
	
	float exams[] = {100f,95f,75f,100f,90f,55f};
	
	
	float total= 0;
	for(int i = 0; i<exams.length; i ++){
		total = total + exams[i];
	}
	
	float average = total / exams.length;	
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