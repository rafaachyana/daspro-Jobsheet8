import java.util.Scanner;
public class TugasTiga22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();
        int totalPelanggan = 0;
        int totalItemTerjual = 0;
        System.out.println("\n== Input Penjualan Per Cabang ==");
        for (int cabang = 1; cabang <= jumlahCabang; cabang++) {
            System.out.println("\n- Cabang " + cabang + " -");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            int itemCabang = 0;
            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                System.out.print("- Pelanggan " + pelanggan + " memesan berapa item? ");
                int item = sc.nextInt();
                itemCabang += item;
            }
            System.out.println("Cabang " + cabang + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + itemCabang);
            totalPelanggan += jumlahPelanggan;
            totalItemTerjual += itemCabang;
        }
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("- Pelanggan: " + totalPelanggan + " orang");
        System.out.println("- Item terjual: " + totalItemTerjual + " item");
        sc.close();
    }
}
