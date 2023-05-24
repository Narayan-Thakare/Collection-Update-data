package update;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Student {
	int roll;
	String name;
	String address;
	Student (int roll,String name,String address){
		this.roll=roll;
		this.name=name;
		this.address=address;
		}
	public int getRoll(){
		
		return roll;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String toString(){
		return roll+" "+name+" "+address;
	}

	public static void main(String[] args) {

		boolean loop =true;
		Scanner s=new Scanner (System.in);
		List<Student>c=new ArrayList<Student>();
		while(loop){
			
			
			System.out.println("1.Add Student");
			System.out.println("2.Show Student");
			System.out.println("3.Upadte Student");
			System.out.println("4.Exit");
			System.out.println("Enter the choice");
			int choice=Integer.parseInt(s.nextLine());
			  
			switch (choice){
			
			case 1:
				System.out.println("Enter the roll no.");
			    int	roll=Integer.parseInt(s.nextLine());
				System.out.println("Enter the name");
				String name=s.nextLine();
				System.out.println("Enter the address");
				String address=s.nextLine();
				c.add(new Student(roll,name,address));
				
				break;
			
			case 2:
			Iterator<Student>i=c.iterator();
			while(i.hasNext()){
				
				Student st=i.next();
				System.out.println(st);
				
			}
			
				
				break;
				
			case 3:
				boolean found =false;
				System.out.println("enter the roll no. to update");
				roll=Integer.parseInt(s.nextLine());
				ListIterator<Student>li=c.listIterator();
				
				while(li.hasNext()){
					
					Student st=li.next();
					if(st.roll==roll){
					System.out.println("enter the name");
					 name=s.nextLine();
					System.out.println("enter the address");
					 address=s.nextLine();
					li.set(new Student(roll,name,address));	
						found=true;
						
					}					
				}
				
				if(!found){
					System.out.println("Student is not found");
				}
					
					break;
				
			}
		}
		
	}

}
