package pkg;
import java.util.Scanner;
import java.util.Random;

// public variable
public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	
	
	
	
	//constructor
	public Spiderman(){
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	
	public Spiderman(String a){
		actor = a;
		age = 0;
		villain = "unknown";
	}
	public Spiderman(int a){
		actor = "unknown";
		age = a;
		villain = "unknown";
	}
	public Spiderman(String act, int a){
		actor = act;
		age = a;
		villain = "unknown";
	}
	public Spiderman(int a, String act){
		actor = act;
		age = a;
		villain = "unknown";
	}
	public Spiderman(String act, int a, String vil){
		actor = act;
		age = a;
		villain = vil;
	}
	
	
	
	//methods
	public String getActor(){
		return actor;
	}
	public String getVillain(){
		return villain;
	}
	public int getAge(){
		return age;
	}
	
	
	
	public void setActor(String actor){
		this.actor = a;
	}
	public void setAge(int age){
		this.age = a;
	}
	public void setVillain(String villain){
		this.villain = v;
	}
	
	
	
	
	
	

	// --------------------------------------- 
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
