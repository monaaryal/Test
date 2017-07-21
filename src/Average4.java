public class Average4{

public static void main (String[] args){
	
	if (args.length== 0){
		System.out.println("please provide data");
		return;
	}
	float total=0;
	
	for(int i = 0; i < args.length; i ++ ){
		float exam = Float.parseFloat(args[i]);
		total = total + exam;
	}
	
	float average = total / args.length;	
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
