package model;

public class TransactionItem {
    private int id;
    private int quantity;
    private double price;

    // RELASI
    private Product product;

    public TransactionItem() {}

    public TransactionItem(Product product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public double getSubtotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Produk: " + product.getName() +
               " | Qty: " + quantity +
               " | Harga: " + price +
               " | Subtotal: " + getSubtotal();
    }
}