import java.util.ArrayList;
public class InventoryManager
extends java.lang.Object
	{
	/*
	 * return all the ProductManager objects the InventoryManager knows about
	 */
	static ArrayList <ProductManager> listProducts= new ArrayList <ProductManager>();
	
	/*
	 * will create an ArrayList of product objects where all the 
	 * products in the arraylist have a price equal to or less than
	 * the paramater passed in.
	 */
	ArrayList <Product> productsByPrice = new ArrayList <Product>();


	/*
	 * runs all the methods in the InventoryManager class.
	 */
	public static void runAllInventoryManagerMethods()
		{
		
		}
	/*
	 * adds a product manager to the arraylist using the given params
	 */
	public static void addProduct()
		{
		listProducts.add(new ProductManager(product, quantity));
		}
	/*
	 * makes sure that the itemCode passed in is a valid item code
	 * and that the item code is in stock. After those checks it 
	 * gets a list of products taht are equal to or less than the
	 * change currently in the machine.
	 */
	public boolean attemptPurchase()
		{
		
		}
	/*
	 * goes throught the list of ProductManagers and checks if
	 * the item code past in exists.
	 */
	public ProductManager find()
		{
		
		}
	/*
	 * returns weather the machine has any of this product
	 * in stock
	 */
	public boolean isInSock()
		{
		
		}
	/*
	 * checks to make sure that the user inputted itemCode is
	 * legit.
	 */
	public boolean isValidItemCode()
		{
		
		}
	
	}
	