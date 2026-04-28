import service.ProductService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();

        try {

            Scanner input = new Scanner(System.in);

            System.out.println("Masukan Aksi (CREATE | SHOW ALL | SHOW BY ID)");
            String aksi = input.nextLine();

            if (aksi.equals("CREATE")) {
                System.out.println("Masukan Nama: ");
                String name = input.nextLine();
                System.out.println("Masukan Harga: ");
                double price = input.nextDouble();
                System.out.println("Masukan Stock: ");
                int stock = input.nextInt();
                service.tambahProduk(name, price, stock);
                System.out.println("Produk berhasil ditambahkan!");
            }

            if (aksi.equals("SHOW ALL")) {
                System.out.println("\n=== Daftar Produk ===");
                service.showAll();
            }

            if (aksi.equals("SHOW BY ID")) {
                System.out.println("Masukan ID: ");
                int id = input.nextInt();
                service.showById(id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}