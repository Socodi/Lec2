import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Calc myCalc = new Calc();

        System.out.println("What would you like to do? A/S/M/D");

        Scanner userInput = new Scanner(System.in);

        char action = userInput.next().charAt(0);

        System.out.println("char entered = " + action);

//        String action = (String) String.valueOf(System.in.read());

        System.out.println("First number: ");

        int num1 =  userInput.nextInt();

        System.out.println("First number entered = : " + num1);

//        String Num1 = (String) String.valueOf(System.in.read());

        System.out.println("Second number:");

        int num2 =  userInput.nextInt();

        System.out.println("Second number entered = : " + num2);

//        String Num2 = (String) String.valueOf(System.in.read());

        System.out.println("The result of your calculation is: ");

        if (action == 'a')
            System.out.println(myCalc.add(num1, num2));
        else if (action == 's')
            System.out.println(myCalc.subtract(num1, num2));
        else if (action == 'm')
            System.out.println(myCalc.multiply(num1, num2));
        else if (action == 'd')
            System.out.println(myCalc.divide(num1, num2));

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

