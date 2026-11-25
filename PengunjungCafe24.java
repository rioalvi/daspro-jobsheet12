public class PengunjungCafe24 {
    //Modifikasi Pertanyaan 2a & 3
    static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
    // Modifikasi Pertanyaan 4
    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int h : harga) {
            total += h;
        }
        return total;
    }
    public static void main(String[] args) {
        daftarPengunjung(1,"Ali", "Budi", "Citra");
        daftarPengunjung(2,"Andi");
        daftarPengunjung(3,"Doni", "Eti", "Fahmi", "Galih");

        // Modifikasi Pertanyaan 2b
        String[] tamu = {"Ali", "Budi", "Citra"};
        daftarPengunjung(4, tamu);

        //Uji coba
        System.out.println("\nTotal belanja (1 item): Rp" + hitungTotalBelanja(15000));
        System.out.println("Total belanja (3 item): Rp" + hitungTotalBelanja(15000, 20000, 12000));
        System.out.println("Total belanja (5 item): Rp" + hitungTotalBelanja(15000, 20000, 22000, 10000, 18000));
    }
}