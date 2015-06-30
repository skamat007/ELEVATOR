package Elevator;
import java.io.*;
import java.math.*;
public class Floor {
int floor;

Floor(){
	double i= (Math.random()*10);
	this.floor=(int)i;
while(this.floor>5)
{
	 i= (Math.random()*10);
	this.floor=(int)i;
	
}
	if(this.floor==0)
		System.out.println("you are @ ground floor " );	
	else
		System.out.println("you are @ floor "+this.floor);	
}

public void message(){
	System.out.println("Welcome To Floor"+this.floor);
	
	
}


}
