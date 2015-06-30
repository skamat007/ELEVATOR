package Elevator;

import java.io.*;
public class Floor_button {
	int i;
	Floor_button() throws NumberFormatException, IOException{
		Elevator_door ed;
		Floor f=new Floor();
		if(f.floor==0)
		{
			System.out.println("Enter 1 to go UP");
		}
			else 
		{
			System.out.println("Enter 1 to go UP");
			System.out.println("Enter 2 to go Down");
		}
		BufferedReader din=new BufferedReader(new InputStreamReader(System.in));
		i=Integer.parseInt(din.readLine());
		int m;
		switch(i){
		case 1 :ed=new Elevator_door();
		ed.Door_close();
		m=f.floor+1; 
		f.floor=m;
		up(m);
		f.message();
		ed.Door_open();
		
		break;
		case 2 :ed=new Elevator_door();
		ed.Door_close();
		m=f.floor-1;;
		f.floor=m;
		down(m);
		f.message();
		ed.Door_open();
		break;
		default:System.out.println("Wrong Option selected");
		break;
		}
				
	}
			
	
void up(int k){
	System.out.println("Elevator is Heading Up");
	System.out.println("Elevator is @ floor"+k);
}
	
void down(int k){
	System.out.println("Elevator is Heading Up");
	System.out.println("Elevator is @ floor"+k);
}	
	

}

