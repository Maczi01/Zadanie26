public class Order {

    private String name;
    private double price;
    private StatusOrder statusOdrer;

    public Order() {
    }

    public Order(String name, double price, StatusOrder statusOdrer) {
        this.name = name;
        this.price = price;
        this.statusOdrer = statusOdrer;
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

    public StatusOrder getStatusOdrer() {
        return statusOdrer;
    }

    public void setStatusOdrer(StatusOrder statusOdrer) {
        this.statusOdrer = statusOdrer;
    }

    @Override
    public String toString() {
        return "Zamowienie " + name + '\'' +
                " o cenie " + price +
                " ma status " + statusOdrer +
                "\n";
    }
}
