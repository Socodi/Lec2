import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
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
        */

        Car myCar = new Car("blue", 4);

        myCar.printDetails();

        System.out.println(myCar.toString());


    }
}

