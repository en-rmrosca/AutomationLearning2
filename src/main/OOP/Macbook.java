package main.OOP;

public class Macbook extends Laptop {

    public Macbook(String producer, String model, String screenResolution, int price) {
        super(producer, model, screenResolution, price);
    }

    @Override
    public void startLaptop() {
        System.out.println("Your MacBook is turning on");
    }

}
