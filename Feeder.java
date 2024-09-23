public class Feeder {

    /**
     * The amount of food, in grams, currently in the bird feeder; initialized
     * in the constructor and always greater than or equal to zero
     */

    private int currentFood;
    private int days;

    public Feeder(int c)
    {
        currentFood = c;
    }

    public Feeder() {}
    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird
     * feeder, as described in part (a) Precondition: numBirds > 0
     */
    public void simulateOneDay(int numBirds)
    {

        if((Math.random()*10) < .05)
        {
            currentFood = 0;
        }
        else
        {
            int eaten = (int) (Math.random() *41 ) +10;
            currentFood -= eaten*numBirds;
            if(currentFood < 0) {currentFood = 0;}
        }

    }

    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b) Preconditions:
     * numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays)
    {
        for(days = 0; days < numDays; days++)
        {

            if((Math.random()*10) < .05) //simulates bear
            {
                currentFood = 0;
                //System.out.println("Day " + days + " Amount of Food:" + currentFood);
                //System.out.println("A bear has found the feeder on day " + days);
                return days; //ends simulation
            }


            else //simulates no bear
            {
                int eaten = (int) (Math.random() *41 ) +10;
                currentFood -= eaten*numBirds;
                if(currentFood < 0)
                {
                    currentFood = 0;
                    return days;
                }

                //System.out.println("Day " + days + " Amount of Food:" + currentFood); //doesn't work/print
            }

        }
        return days;
    }
    public int getCurrentFood()
    {
        return currentFood;
    }

    public String toString()
    {
        return "Current Food: " + currentFood;
    }
    public String toSting()
    {
        return "Number of days that a bear or birds found food:" + days;
    }

}