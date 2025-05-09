package fooddelivery.model;

public class MenuItem implements Comparable<MenuItem> {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(MenuItem other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return name + " - " + price + " RON";
    }
}