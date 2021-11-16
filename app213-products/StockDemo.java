
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Louie Fennell
 * @version 09/11/2021
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        stock.add(new Product(101, "GTX 1050 Ti"));
        stock.add(new Product(102, "GTX 1050 Ti"));
        stock.add(new Product(103, "GTX 1080"));
        stock.add(new Product(104, "GTX 1660 SUPER"));
        stock.add(new Product(105, "RTX 2070"));
        stock.add(new Product(106, "RTX 2080 Ti"));
        stock.add(new Product(107, "RTX 3060"));
        stock.add(new Product(108, "RTX 3080"));
        stock.add(new Product(109, "RTX 3090"));
        stock.add(new Product(110, "RTX 3090 Ti"));
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    /**
     * Quick buys in a basic start amount of products
     */
    private void buyProducts()
    {
        stock.buyProduct(101,67);
        stock.buyProduct(102,34);
        stock.buyProduct(103,53);
        stock.buyProduct(104,35);
        stock.buyProduct(105,12);
        stock.buyProduct(106,45);
        stock.buyProduct(107,9);
        stock.buyProduct(108,0);
        stock.buyProduct(109,7);
        stock.buyProduct(110,2);
    }

    /**
     * Quick sells in a basic start amount of products
     */
    private void sellProducts()
    {
        stock.sellProduct(101,67);
        stock.sellProduct(102,3);
        stock.sellProduct(103,5);
        stock.sellProduct(104,3);
        stock.sellProduct(105,1);
        stock.sellProduct(106,4);
        stock.sellProduct(107,3);
        stock.sellProduct(108,4);
        stock.sellProduct(109,2);
        stock.sellProduct(110,1);
    }    
}