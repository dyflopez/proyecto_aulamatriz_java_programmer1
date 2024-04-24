package streams;

public class InformeProductos {


    private  String productName;


    private  int stock;

    public InformeProductos(String productName, int stock) {
        this.productName = productName;
        this.stock = stock;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "InformeProductos{" +
                "productName='" + productName + '\'' +
                ", stock=" + stock +
                '}';
    }
}
