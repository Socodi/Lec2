public class Car {
    public String colour;
    public int wheels;

    public Car(String colour, int wheels) {
        this.colour = colour;
        this.wheels = wheels;
    }

    public void printDetails(){
        System.out.println("The car has " + this.wheels + " wheels and is " + this.colour);
    }
}
