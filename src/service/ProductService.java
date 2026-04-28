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

}