public class Furniture {
    String name;
    double price;
    double vatRate;

    public Furniture(String name, double price, double vatRate) {
        this.name = name;
        this.price = price;
        this.vatRate = vatRate;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceIncludingVat() {
        return price * (1 + vatRate);
    }
}