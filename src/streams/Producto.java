package streams;

public class Producto {

    private  int id;

    private  int stock;

    private  String name;

    private  double price;

    private boolean isActive;


    public Producto(int id, int stock, String name, double price, boolean isActive) {
        this.id = id;
        this.stock = stock;
        this.name = name;
        this.price = price;
        this.isActive = isActive;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
