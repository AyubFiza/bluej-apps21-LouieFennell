import java.util.ArrayList;
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Derek Peacock and Nicholas Day
 * @Modified by Louie Fennell
 * @version 2021-10-26
 */
public class Course
{
    public final static int MAXN_MODULES = 4;
    
    public ArrayList<Module> modules;
    public ArrayList<Student> student;
    
    private String code;
    private String title;
    
    private Grades finalGrade;
    private Student Student;
     
    public Course()
    {
        this("BB1BMI1", "BSc Business Management and Information Technology");
    }
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        
        modules  = new ArrayList<Module>();
        
        createModules();
    }
    /**
     * Create four modules and add them to the
     * modules list for testing purposes.  These
     * must be your four modules.
     */
    public void createModules()
    {
        Module CO452 = new Module("CO452","Programing Concepts");
        Module CO456 = new Module("CO452","Web Design");
        Module CO450 = new Module("CO452","Computer Architechture");
        Module CO454 = new Module("CO452","Digi Techs");
        addModule(CO452);
        addModule(CO456);
        addModule(CO450);
        addModule(CO454);
    }
    public void addModule(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }
    /**
     * Converts marks total to grades
     */
    public Grades convertToGrade(int mark)
    {
        if(mark <= 0)
            return Grades.NS;
        else if(mark <= 39)
            return Grades.F;
        else if(mark <= 49)
            return Grades.D;
        else if(mark <= 59)
            return Grades.C;
        else if(mark <= 69)
            return Grades.B;
        else if(mark <= 100)
            return Grades.A;
        else    
            return Grades.NS;
    }
    
    /**
     * Calculate the average mark from the four module marks
     * and convert that into a final grade.
     */
    public Grades calculateGrade(ArrayList<ModuleMark> marks)
    {
        int total = 0;
        int finalMark = 0;
        for(ModuleMark mark : marks)
        {
            total = total + mark.getValue();
        }
        finalMark = total/4;
        finalGrade = convertToGrade(finalMark);
        return finalGrade;
    }
    
    /**
     * Prints out the details of a course and the
     * four modules
     */
    public void print()
    {
        System.out.println();
        System.out.println(" Course " + code + ": " + title);
        //System.out.println();
        
        printModules();
    }
    
    /**
     * Print the course's four modules
     */
    public void printModules()
    {
        for(Module module : modules)
        {
            module.print();
            module.printCredit();
        }
        }
    }

