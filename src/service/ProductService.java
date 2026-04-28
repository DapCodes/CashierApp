package service;

import model.Mahasiswa;
import repository.MahasiswaRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductService {

    private ProductRepository repo = new ProductRepository();

    public void tambahProduk(String name, double price, int stock) {
        Product product = new Product(name, price, stock);
        repo.tambah(product);
    }

}