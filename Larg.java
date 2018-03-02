package guvi;
import java.util.*;
public class Larg {

	public static void main(String[] args) {
		Scanner g=new Scanner(System.in);
	  int a,b,c;
	  System.out.println("enter the number");
	  a=g.nextInt();
	  b=g.nextInt();
	  c=g.nextInt();
	  
	  if(a>c)
	  {
		  if(a>b) {
			  System.out.println("the largest num is"+a);
		  }
		  else {
			  System.out.println("the largest num is"+b);
		  }
	  }
	  else if(c>b) {
		  System.out.println("the largest num is"+c);
		  
	  }
	  else {
		  System.out.println("the largest num is"+b);
	  }
	}

}
