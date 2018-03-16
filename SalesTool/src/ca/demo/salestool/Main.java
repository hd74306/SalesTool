package ca.demo.salestool;

public class Main {
	public static void main(String[] args){
		SalesData salesData = new SalesData();
		
		displayGreeting();
		salesData.display();
		
	}

	private static void displayGreeting(){
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("THIS APP SHOWS SALES DATA");
	}
}
