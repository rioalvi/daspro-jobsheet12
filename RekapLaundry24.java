import java.util.Scanner;

public class RekapLaundry24 {
    static void inputData(int[][] data, String[] layanan, Scanner sc) {
        for (int i = 0; i < layanan.length; i++) {
            System.out.println("Input berat cucian (kg) untuk layanan " + layanan[i] + ": ");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilTabel(int[][] data, String[] layanan, int[] harga) {
        System.out.println("\n=== TABEL REKAP BERAT CUCIAN (KG) ===");
        System.out.printf("%-15s %-12s", "Layanan", "Harga/kg");
        for (int j = 0; j < data[0].length; j++) {
            System.out.printf("%-11s", "Hari ke-" + (j + 1));
        }
        System.out.println();

        for (int i = 0; i < layanan.length; i++) {
            System.out.printf("%-15s Rp%-10d", layanan[i], harga[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-11d", data[i][j]);
            }
            System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }
        return total;
    }

    static void tampilLayananTertinggi(int[][] data, String[] layanan) {
        int idxMax = 0;
        int maxBerat = totalPerLayanan(data, 0);
        for (int i = 1; i < layanan.length; i++) {
            int total = totalPerLayanan(data, i);
            if (total > maxBerat) {
                maxBerat = total;
                idxMax = i;
            }
        }
        System.out.println("\nLayanan dengan total berat cucian tertinggi: " + layanan[idxMax] + " (" + maxBerat + " kg)");
    }

    static int hariTersibuk(int[][] data) {
        int idxHariMax = 0;
        int maxHari = 0;
        for (int j = 0; j < data[0].length; j++) {
            int totalHari = 0;
            for (int i = 0; i < data.length; i++) {
                totalHari += data[i][j];
            }
            if (j == 0 || totalHari > maxHari) {
                maxHari = totalHari;
                idxHariMax = j;
            }
        }
        return idxHariMax;
    }

    static void tampilPendapatan(int[][] data, String[] layanan, int[] harga) {
        System.out.println("=== PENDAPATAN PER LAYANAN ===");
        int totalPendapatan = 0;
        for (int i = 0; i < layanan.length; i++) {
            int pendapatan = totalPerLayanan(data, i) * harga[i];
            totalPendapatan += pendapatan;
            System.out.println(layanan[i] + ": Rp" + pendapatan);
        }
        System.out.println("Total Pendapatan Selama " + data[0].length + "Hari: Rp" + totalPendapatan);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah layanan: ");
        int jumlahLayanan = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();

        String[] layanan = new String[jumlahLayanan];
        int[] harga = new int[jumlahLayanan];

        for (int i = 0; i < jumlahLayanan; i++) {
            System.out.print("Masukkan nama layanan ke-" + (i + 1) + ": ");
            layanan[i] = sc.nextLine();
            System.out.print("Masukkan harga per kg untuk " + layanan[i] + ": ");
            harga[i] = sc.nextInt();
            sc.nextLine();
        }

        int[][] data = new int[jumlahLayanan][jumlahHari];

        inputData(data, layanan, sc);
        tampilTabel(data, layanan, harga);
        tampilLayananTertinggi(data, layanan);

        int idxSibuk = hariTersibuk(data);
        System.out.println("Hari tersibuk: Hari ke-" + (idxSibuk + 1));

        tampilPendapatan(data, layanan, harga);
    }
}