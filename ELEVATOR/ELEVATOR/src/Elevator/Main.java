package Elevator;
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
	String res="y";
	BufferedReader din=new BufferedReader(new InputStreamReader(System.in));
	do{
	Elevator e=new Elevator();
	Elevator_door Ed=new Elevator_door();
	Ed.Door_close();
	Floor_button fb=new Floor_button();
	Ed.Door_close();
	System.out.println("Press Y to go to another floor ");
	res=din.readLine();
	}
	while(res.equalsIgnoreCase("Y"));
	}

}
