package model;

import java.util.List;

public class Transaction {
    private int id;
    private double totalPrice;

    // RELASI
    private User user;
    private List<TransactionItem> items;

    public Transaction() {}

    public Transaction(User user, List<TransactionItem> items) {
        this.user = user;
        this.items = items;
        this.totalPrice = calculateTotal();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getTotalPrice() { return totalPrice; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public List<TransactionItem> getItems() { return items; }
    public void setItems(List<TransactionItem> items) { this.items = items; }

    private double calculateTotal() {
        double total = 0;
        if (items != null) {
            for (TransactionItem item : items) {
                total += item.getSubtotal();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "ID Transaksi: " + id +
               " | Kasir: " + user.getName() +
               " | Total: " + totalPrice;
    }
}