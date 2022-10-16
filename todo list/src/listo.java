//import java.io.*;
import java.util.*;
import java.util.ArrayList;
//import java.util.List;
public class listo {
	
	public static ArrayList<String> add(ArrayList<String> todolist) {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter item to add : ");
		if(x.hasNextLine()==true) {
			String elem = x.nextLine();
			todolist.add(elem);
		}
		//x.close();
		return todolist;
	}
	
	public static void view(ArrayList<String> todolist) {
		System.out.println("To-do List");
		int s=todolist.size();
		for (int i=0; i<s; i++) {
			int p=i+1;
			System.out.println(p+". "+ todolist.get(i));
		}
		
	}
	
	public static ArrayList<String> delete (ArrayList<String> todolist) {
		Scanner q = new Scanner(System.in);
		System.out.println("Enter item number to delete : ");
		int a = q.nextInt();
		todolist.remove(a-1);
		//q.close();
		return todolist;
	}
	public static int menu() {
		Scanner y = new Scanner(System.in);
		System.out.println("\t"+" To-do List"+"\n");
		System.out.println("1. Add to list");
		System.out.println("2. Delete item from list");
		System.out.println("3. View List");
		System.out.println("4. Exit");
		System.out.println();
		System.out.print("Enter option number : ");
		int choice=-1;
		if(y.hasNextInt()==true) {
			choice = y.nextInt();
			
		}
		else
			choice = 4;
		return choice;
		
	}
	
	public static void main(String[] args) {
		ArrayList<String> todolist = new ArrayList<String>();
		Scanner q = new Scanner(System.in);
		
		while (true) {
			int input = menu();
			
			if (input==1) {
				add(todolist);
			}
		
			if (input==2){
				delete(todolist);
				
			}
			if (input==3) {
				view(todolist);
		
			}
			if (input==4) {
				System.out.println("EXIT");
				break;
			}
			
		}

		
		
	}
}
