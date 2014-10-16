//handles input from user
//sets up vending machine products
import java.util.Scanner;

public class VendingMachine
	{
	private Cashier cashier;
	private InventoryManager im;
	private Scanner keypad;
	
	public void main(java.lang.String[] args)//main method
		{
		Object <VendingMachine> VendingMachineObject = new Object <VendingMachine>();
		turnOn();
		listen();
		}
	
	public void alertUser()//Prints out user inputs to this machine
		{	
		System.out.println("Welcome to the Nameless Group Inc. Vending Machine.");
		System.out.println("This machine is now ready to be used.");
		System.out.println("Here are the products available to you:");
		for(int i; i < Product.stock.size(); i++)
			{
			System.out.println("------------------------------------------");
			System.out.println(ProductManager.stock.get(i).getItemCode() + ": " + ProductManager.stock.get(i).getProduct() + ", $" + Product.stock.get(i).getPrice());		
			System.out.println("------------------------------------------");
			}
		}
	
	public void initProducts()//
		{	
		//This is where the other three classes go
		}
	
	public void listen()//infinite loop that listens for keypad input
		{
		Cashier.addMoney();
		Cashier.purchase();
		}
	
	public void turnOn()//initializes products into the vending machine
		{
		initProducts();
		alertUser();		
		}
	}
//1 User inserts money only coins
//User enters selection(2 digit)
//Is the number valid(if statement)
//Is the item in stock(if statement)
//Did the user insert enough $(if statement)
//Machine releases item
//Machine returns best change
//

