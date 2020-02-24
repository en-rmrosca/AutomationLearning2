package main.OOP;

public class Laptop {
    private String producer;
    private String model;
    private String screenResolution;
    private int price;

    public Laptop() {
        this.producer = "Lenovo";
        this.model = "T590";
        this.screenResolution = "1920x1080";
        this.price = 1500;
    }

    public Laptop(String producer, String model, String screenResolution, int price) {
        this.producer = producer;
        this.model = model;
        this.screenResolution = screenResolution;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 5000 && price > 500)
            this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public void startLaptop() {
        System.out.println("Your laptop has turned on");
    }
}
