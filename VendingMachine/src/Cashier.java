import java.util.Scanner;

//handle money, return change 
public class Cashier
	{
	private int currentCents;//amount of change the user inputs
	int changeOfTransaction, condition = 0;//change from transaction and while loop helper
	String coinName;
	
	
	public int addMoney()//adds value to vending machine
		{
		while(condition < 1)
			{
			System.out.println("What coins will you insert?  Type 'done' to stop.");
			Scanner userInput1 = new Scanner(System.in);		
			coinName = userInput1.nextLine();	
			currentValue();		
			}
		showCash();
		return currentCents;
		}
	
	public int currentValue()//converts money given into size 2 array DONE
		{
		switch(coinName)
			{
			case "nickel":
				{
				currentCents = currentCents + 5;
				break;
				}
				
			case "penny":
				{
				currentCents = currentCents + 1;
				break;
				}
				
			case "quarter":
				{
				currentCents = currentCents + 25;
				break;
				}
				
			case "dime":
				{
				currentCents = currentCents + 10;
				break;
				}
				
			case "done":
				{
				condition = 1;
				break;
				}
			
			default:
				{
				System.out.println("SYSTEM ERROR!!!!!");
				break;
				}
			}
		return currentCents;
		}
	
	public void purchase()//does math with given amount and price DONE
		{
		if(Products.costInCents <= currentCents)
			{
			changeOfTransaction = Product.costInCents - currentCents;	
			//toPennies();
			}
		else
			{
			System.out.println("You do not have enough money to purchase this item.");
			}
		returnChange();
		}
	
	public String returnChange()//returns change HELP
		{		
		String change = changeOfTransaction + "cents";
		System.out.println("You receive " + changeOfTransaction + " cents in change.");
		return change;
		}
	
	public /* static? */ String showCash()//returns amount of money input into the machine HELP
		{
		String cash = currentCents + "cents";
		System.out.println("You entered " + currentCents + " into the vending machine.");
		return cash;
		}
	
//	public static int toPennies()//converts size 2 array into money
//		{
//		
//		System.out.println("Your change is " + changeOfTransaction + " pennies as change.");		
//		return;
//		}
	
	}
