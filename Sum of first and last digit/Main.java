import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      
      int number=in.nextInt();
      int first,last;
      last=number%10;
    
      first=number;
      while(number>=10)
      {
       
        number=number/10;
        first=number;
      }
      
     
      int sum=first+last;
      System.out.println(sum);
      
                           
	    // Type your code here
	}
}