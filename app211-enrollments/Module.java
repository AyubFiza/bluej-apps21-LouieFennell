
/**
 * Write a description of class Module here.
 *
 * @author Louie Fennell
 * @version 2.01 19/10/21
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String code;
    private String title;
    private int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code,String title)
    {
        //Modules Key variables
        this.code = code;
        this.title = title;
        credit = 0;
    }
    public String getCode()
    {
        //Prints Code
        return this.code;
    }
    public String getTitle()
    {
        //Prints title
        return this.title;
    }
    public int getCredit()
    {
        //Prints Credit
        return this.credit;
    }
    public void setCredit(int credit)
    {
        //sets Credits value
        this.credit = credit;
    }
    public void print()
    {
        //printHeading();
        
        System.out.println(" Course Code: " + code + ": " + title);
        System.out.println("Credit Score" + credit);
    }
}

