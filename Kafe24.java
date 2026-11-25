import java.util.Scanner;

public class Kafe24 {
    //Modifikasi Pertanyaan 4a Tambah parameter jamKunjung (int)
    public static void Menu (String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga24(int pilihanMenu, int banyakItem) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    //Modifikasi Pertanyaan 4 Fungsi hitungDiskon
    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int diskonPromo = 0;
        if (kodePromo.equals("DISKON50")) {
            diskonPromo = total * 50 / 100;
        } else if (kodePromo.equals("DISKON30")) {
            diskonPromo = total * 30 / 100;
        } else {
            System.out.println("Kode promo invalid");
        }

        int diskonMember = 0;
        if (isMember) {
            diskonMember = total * 10 / 100;
        }

        return diskonPromo + diskonMember;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean isMember = true;
        Menu("Andi", isMember);

        int totalHargaKeseluruhan = 0;
        String lanjut;

        //Modifikasi Pertanyaan 3a & 3b
        do {
            System.out.print("\nMasukan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
            } else {
                System.out.print("Masukan jumlah item yang ingin dipesan: ");
                int banyakItem = sc.nextInt();
                totalHargaKeseluruhan += hitungTotalHarga24(pilihanMenu, banyakItem);
            }

            sc.nextLine();
            System.out.print("Apakah ingin memesan menu lain? (y/n): ");
            lanjut = sc.nextLine();
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.print("Masukan kode promo: ");
        String kodePromo = sc.nextLine();

        int besarDiskon = hitungDiskon(totalHargaKeseluruhan, kodePromo, isMember);
        int totalAkhir = totalHargaKeseluruhan - besarDiskon;

        System.out.println("\nTotal harga sebelum diskon: Rp" + totalHargaKeseluruhan);
        System.out.println("Besar diskon: Rp" + besarDiskon);
        System.out.println("Total yang harus dibayar: Rp" + totalAkhir);
       
    }
}
