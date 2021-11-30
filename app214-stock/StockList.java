import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 *
 * @author     Louie Fennell
 * @version    30.11.21
 */

public class StockList
{
    // A list of the products.
    private ArrayList<Product> stock;
    public ArrayList<Product> products; 
    //
    private int amountRequired;
    //Finds the product key
    private boolean isFound;

    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }
    
    /**
     * Add a product to the list.
     * 
     */
    public void add(Product item)
    {   
            stock.add(item);
    }
    
    /**
     * Removes product by Product ID.
     * @param item The product item to be added.
     */
    public Product remove(int productID)
    {       
        Product product = findProduct(productID);
        if (product!= null)
            stock.remove(product);
        else
            System.out.println("Could not find product");
            return product;
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
      buyProduct(productID, 1);
    }
    
    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void buyProduct(int productID, int amount)
    { Product product = findProduct(productID) ;
     product.increaseQuantity(amount);
    }
    
    /**
     * Check levels of stock
     * If the stock is less than minimum it will buy in more
     */
    public void lowStocklist()
    {
        printHeading();
        for(Product product: stock)
            { 
             if(product.getQuantity() < 5)
              product.increaseQuantity(10);
            }
        System.out.println();
        for(Product product : stock)
            {       
              product.print();
            }
    }

    /**
     * Find a product to match the product name,
     * if not found return null
     */
    public void searchForProduct(String productName)
        {   
        for (Product product: stock)
            if(product.getName().contains(productName))
            {   
                System.out.println(product); 
            }
        }
                                    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {
        for(Product product : stock )
        {
            if(product.getID() == productID)
            
                return product;
                System.out.println(product);
            
        }
        return null;
    }

    /**
     * Sells one product
     */
    public void sellProduct(int productID)
    {
        sellProduct(productID , 1);
    }
    
    /**
     * Sell one of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public String sellProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            if(product.getQuantity() > 0)
            {
                product.decreaseQuantity(amount);
                // printout message
                return String.valueOf(product.getQuantity());
            }
            else
            {
                amountRequired = -1*(product.getQuantity()-amount);
                // printout message
                return "Product Quantity two low requires " + amountRequired +"more stock of "+ product;
            }
        }
        else
        {
            // printout message
            return("Product not Found");
        }
    } 
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int productID)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    public void printHeading()
    {
        System.out.println();
        System.out.println(" Louie's Car stock");
        System.out.println(" ====================");
        System.out.println();
    }
}