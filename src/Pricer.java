		import java.sql.DriverManager;
		import java.sql.Connection;
		import java.sql.SQLException;
import java.sql.Statement;
import java.io.BufferedReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;


        
public class Pricer {

	public static void main(String[] args) throws SQLException {
		VM[] vm;
		fileToDB Option1;
		fileToOutput Option2;
		DBToOutput Option3;
		vm = new VM[4];
		Option1= new fileToDB();
		Option2= new fileToOutput();
		Option3= new DBToOutput();
		int a=0;
		System.out.println("Hello!");
		LOL:while(a!=4) {
			System.out.println("");
			System.out.println("");
			System.out.println("1. Read from the various files and populate Database");
			System.out.println("2. Read from the various files and compute Price of operation of VM");
			System.out.println("3. Read from the Database and compute Price of operation of VM");
			System.out.println("4.Exit");
			System.out.print("Enter a value from 1-4:");
			Scanner scanner = new Scanner(System.in);
			try {
			a=scanner.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("Plz enter a NUMBER from 1-4");
				continue LOL;
	        }finally {
			}
			System.out.println("");
			if(a==1) {
				Option1.printFileToDB();
			}else if(a==2){
				Option2.printFileToOutput(vm);
			}else if(a==3) {
				Option3.printDBToOutput(vm);
			}else if(a==4){
				scanner.close();
				System.out.print("Exiting...");
			}else {
				System.out.println("Nice try, but "+ a +" is not from 1-4");
			}
		}
		System.out.println("...Done!");
		System.out.println("See You!");
	}

				

	/*public static void main(String args[]) {
		while(1<2) {
			if((a)==1) {
				System.out.println("YESSSs");
			}
		}
	}*/
}
