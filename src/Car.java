public class Car {
    private String colour;
    private int wheels;

    public String getColour() { return colour; }

    public void setColour(String colour) { this.colour = colour; }

    public int getWheels() { return wheels; }

    public void setWheels(int wheels) { this.wheels = wheels; }

    public Car(String colour, int wheels) {
        this.setColour(colour);
        this.setWheels(wheels);
    }

    public void printDetails() {
        System.out.println("The car has " + this.getWheels() + " wheels and is " + this.getColour());
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + getColour() + '\'' +
                ", wheels=" + getWheels() +
                '}';
    }
}
