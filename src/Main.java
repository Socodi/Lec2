import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        Calc myCalc = new Calc();

        System.out.println("What would you like to do? A/S/M/D");

        char action = (char) System.in.read();

        System.out.print("First number: ");

        int Num1 = System.in.read();

        System.out.print("Second number:");

        int Num2 = System.in.read();

        if (action == 'a')
            System.out.println(myCalc.add(Num1, Num2));
        else if (action == 's')
            System.out.println(myCalc.subtract(Num1, Num2));
        else if (action == 'm')
            System.out.println(myCalc.multiply(Num1, Num2));
        else if (action == 'd')
            System.out.println(myCalc.divide(Num1, Num2));

        /*
        Car myCar = new Car("blue", 4);
        Car mumsCar = new Car("grey", 5);

//        myCar.setColour(2);

//        System.out.println(myCar.getColour());

//        myCar.printDetails();
//        mumsCar.printDetails();

        String[] passengers = {"Mum", "Dad", "Son", "Daughter"};

        mumsCar.setPassengers(passengers);

//        System.out.println(myCar.toString());
        System.out.println("Initial");
        System.out.println(mumsCar.toString());

//        System.out.println(mumsCar.getPassengers()[2]);

        mumsCar.changePassenger(2, "Step-Son");

        System.out.println("Change passenger");
        System.out.println(mumsCar.toString());

        mumsCar.addPassenger("Jamie");

        System.out.println("Add passenger");
        System.out.println(mumsCar.toString());

        Arrays.sort(mumsCar.getPassengers());

        System.out.println("Sorted Passengers");
        System.out.println(mumsCar.toString());

        System.out.println("----------------------");
        System.out.println("Disadvantages Of Arrays");
        System.out.println("- Fixed size");
        System.out.println("- Hard to insert or delete");
        System.out.println("- Easy to waste memory");
        */

    }
}

