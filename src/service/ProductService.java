package service;

import model.Product;
import repository.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductService {

    private ProductRepository repo = new ProductRepository();

    public void tambahProduk(String name, double price, int stock) {
        Product product = new Product(name, price, stock);
        repo.tambah(product);
    }

    public void showAll() throws SQLException {
        List<Product> list = repo.showAll();
        if (list.isEmpty()) {
            System.out.println("Belum ada data.");
            return;
        }
        list.forEach(System.out::println);
    }

}