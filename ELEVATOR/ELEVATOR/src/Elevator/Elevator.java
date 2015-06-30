package Elevator;
import java.io.*;


public class Elevator {
	int i;
	
	
	Elevator() throws NumberFormatException, IOException{	
	System.out.println("press 1 to call elevator up");
	System.out.println("press 2 to call elevator down");
	BufferedReader din=new BufferedReader(new InputStreamReader(System.in));
	i=Integer.parseInt(din.readLine());
	switch(i){
	case 1 : up();
	break;
	case 2 : down();
	break;
	default :System.out.println("Wrong Option");
	break;
	}
	}
	
	public void up()
	{
		 System.out.println("Elevator is coming up");
	}
	
	public void down()
	{
		 System.out.println("Elevator is coming down");
	}
		
}
