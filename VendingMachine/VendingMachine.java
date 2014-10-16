//handles input from user
//sets up vending machine products
import java.util.Scanner;

public class VendingMachine
	{
	private Cashier cashier;
	private InventoryManager im;
	private Scanner keypad;
	String itemChoice;
	
	public static void main(java.lang.String[] args)//main method
		{
		//make vending machine obj
		String <VendingMachine> VendingMachineObject = new String<VendingMachine>();//good????
		turnOn();
		listen();
		}
	
	public void alerUser()//Prints out user inputs to this machine
		{
		//cashier 
		initProducts();
		Cashier.addMoney();
		Cashier.purchase();
		//offers to let user not buy
		}
	
	public void initProducts()//give user choice of snack
		{	
		System.out.println("What product would you like?");
		for(int i = 0; i < 10; i++)
		System.out.println("----------------------------------------------------------------------");
		System.out.println(ProductManager.listProducts.get(i).getItemCode() + " = " + Product.stock.get(i).getSnackName() + ", " + Product.stock.get(i).getCostInCents() + " cents, " + ProductManager.listProducts.get(i).getQuantity() + "q");
		System.out.println("----------------------------------------------------------------------");
		
		}
	
	public void listen()//infinite loop that listens for keypad input
		{
		alertUser();
		}
	
	public void turnOn()//initializes products into the vending machine
		{
		//Product, inventory manager, and product manager methods go here
		}
	
	}
//User inserts money only coins
//User enters selection(2 digit)
//Is the number valid(if statement)
//Is the item in stock(if statement)
//Did the user insert enough $(if statement)
//Machine releases item
//Machine returns best change