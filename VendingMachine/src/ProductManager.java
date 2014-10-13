import java.util.ArrayList;

public class ProductManager
	{
	private static String nextItemCode = "";
	private String itemCode;
	private Product product;
	private int quantity;
	
	/*
	 * the arraylist that will be filled with the objects in the txt file
	 */
	ArrayList <Product> stock = new ArrayList <Product>();
	
	/*
	 * will run all of the methods in the Productmanager class
	 */
	public static void runAllProductManagerMethods()
		{
		
		}
	
	public void ProductManager(String ic, Product p, int q)
		{
		itemCode = ic;
		product = p;
		quantity = q;
		}
	/*
	 * will return the item code assigned to this product
	 */
	public String getItemCode()
		{
		
		}
	/*
	 * will return the product that ProductManager is managing
	 */
	public Product getProduct()
		{
		
		}
	/*
	 * takes the variable that represents the last item code used and increments it
	 */
	public static void incrementItemCode()
		{
		
		}
	/*
	 * will check if the item is still in stock
	 */
	public boolean isInStock()
		{
		
		}
	/*
	 * checks to make sure this item is vendable
	 */
	public boolean vendItem()
		{
		
		}
	
	/*
	 * user inserts money, the machine only accepts coins
	 * user enters a selection (2 digit)
	 * 
	 * is the number valid?(if statement)
	 * 		if yes proceed
	 * 		if no return to the previous step
	 * 
	 * is the item in stock(if statement)
	 * 		if yes proceed
	 * 		if no return tot he previous step
	 * 
	 * did they insert enough money?(if statement)
	 * 	 	if yes proceed
	 *  	if no return to the payment step
	 *  
	 * machine releases the item
	 * machine returns the most efficient amount of change to the user
	 */
	}
