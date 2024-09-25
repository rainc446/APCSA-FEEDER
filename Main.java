public class Main {

    public static void main(String[] args)
    {




        Feeder ex1 = new Feeder(500);
        ex1.simulateOneDay(12);
        System.out.print(ex1 + " ");
        System.out.println("ex1");
        System.out.println();

        Feeder ex2 = new Feeder(22);
        ex2.simulateOneDay(22);
        System.out.print(ex2);
        System.out.println(" ex2");
        System.out.println();

        Feeder ex3 = new Feeder(100);
        ex3.simulateOneDay(5);
        System.out.print(ex3 + " ");
        System.out.println(" ex3");
        System.out.println();

        Feeder ex4 = new Feeder(2400);
        ex4.simulateManyDays(10,4);
        System.out.print(ex4 + " ");
        System.out.println("ex4");
        System.out.println();


        Feeder ex5 = new Feeder(250);
        ex5.simulateManyDays(10,5);
        System.out.print(ex5 + " ");
        System.out.println("ex5");
        System.out.println();

        Feeder ex6 = new Feeder(0);
        ex6.simulateManyDays(5,10);
        System.out.print(ex6 + " ");
        System.out.println("ex6");
        System.out.println();


    }
}