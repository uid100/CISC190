/**
 * Participant class for Module 6 solution.
 *
 * @author dsullivan@sdccd.edu
 * @version 2023.11.09.001
 */

public class Participant
{
    // class variables and constants
    static final String defaultName = "Joe Schmoe";
    static final int defaultWeight = 200;
    static final double defaultHeight = 6.0;

    // instance variables
    private String name;
    private int weight;
    private double height;


    /*------------------ Constructors ------------------*/
    /**
     * Parameterless constructor  (1)
     */
    public Participant()
    {
        this(defaultName);
    }

    /**
     * Constructor with only name parameter  (2)
     */
    public Participant(String name)
    {
        this(name,defaultWeight,defaultHeight);
    }

    /**
     * Constructur set all instance variables  (3)
     */
    public Participant(String name, int wt, double ht )
    {
        setName(name);

        // validate non-negative height and weight
        if( wt < 0 ) {
            System.out.println(
                  "Incorrect weight, weight must be positive. "
                + "Weight will be set to default value "
                + String.format( "(%d).", defaultWeight) );
            wt = Participant.defaultWeight;
        }
        setWeight(wt);

        if( ht < 0 ) {
            System.out.println(
                  "Incorrect height, height must be positive. "
                + "Height will be set to default value "
                + String.format( "(%.2f).", defaultHeight) );
            ht = Participant.defaultHeight;
        }
        setHeight(ht);
    }


    /* --------------- Setters and Getters ---------------*/
    // Accessors and Mutators...

    /**
     * setName()
     *
     * @param  n  value for the instance variable
     */
    public void setName(String n)
    {
        this.name = n;
    }
    /**
     * getName()
     *
     * @return    value of the instance variable
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * setHeight()
     *
     * @param  h  value for the instance variable
     */
    public void setHeight(double h)
    {
        if(h>0)
            this.height = h;
        else
            System.out.println("Incorrect height, height must be positive. "
                + "Height will not be updated.");
    }
    /**
     * getHeight()
     *
     * @return    set the value of the instance variable
     */
    public double getHeight()
    {
        return this.height;
    }

    /**
     * setWeight()
     *
     * @param  h  value for the instance variable
     */
    public void setWeight(int w)
    {
        if(w>0)
            this.weight = w;
        else
            System.out.println("Incorrect weight, weight must be positive. "
                    + "Weight will not be updated.");
    }

    /**
     * getWeight()
     *
     * @return    set the value of the instance variable
     */
    public int getWeight()
    {
        return this.weight;
    }

    public double getBMI()
    {
        return 703 * this.weight / (this.height * this.height);
    }


    /* -------------------- toString() ------------------*/

    /**
     * toString()
     *
     * @return formatted string
     */
    public String toString() {
        return "Participant:\n"
            + "Name: " + this.getName() + "\n"
            + "Weight: " + this.getWeight() + "\n"
            + "Height: " + this.getHeight() + "\n";
    }
}





