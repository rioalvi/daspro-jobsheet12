import java.util.Scanner;

public class BankSampah24 {
    static double[] inputSetoran(int n) {
        Scanner sc = new Scanner(System.in);
        double[] setoran = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Masukan berat setoran nasabah ke-" + (i + 1) + " (kg): ");
            setoran[i] = sc.nextDouble();
        }
        return setoran;
    }

    static void tampilSetoran(double[] setoran) {
        System.out.println("\n=== Daftar Setoran Sampah Nasabah ===");
        for (int i = 0; i < setoran.length; i++) {
            System.out.println("Nasabah ke-" + (i + 1) + ": " + setoran[i] + " kg");
        }
    }

    static double totalSetoran(double[] setoran) {
        double total = 0;
        for (double berat : setoran) {
            total += berat;
        }
        return total;
    }

    static double hitungSaldo(double berat, double hargaPerKg) {
        return berat * hargaPerKg;
    }

    static int nasabahTerbanyak(double[] setoran) {
        int idxTerbanyak = 0;
        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[idxTerbanyak]) {
                idxTerbanyak = i;
            }
        }
        return idxTerbanyak;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double HARGA_PER_KG = 3000;

        System.out.print("Masukkan jumlah nasabah (N): ");
        int n = sc.nextInt();

        double[] dataSetoran = inputSetoran(n);
        tampilSetoran(dataSetoran);

        System.out.println("\n=== Saldo Setiap Nasabah (Rp3.000/kg) ===");
        for (int i = 0; i < dataSetoran.length; i++) {
            double saldo = hitungSaldo(dataSetoran[i], HARGA_PER_KG);
            System.out.println("Nasabah ke-" + (i + 1) + ": Rp" + saldo);
        }

        double total = totalSetoran(dataSetoran);
        int idxMax = nasabahTerbanyak(dataSetoran);

        System.out.println("\nTotal berat setoran seluruh nasabah: " + total + " kg");
        System.out.println("Nasabah dengan setoran terbanyak: Nasabah ke-" + (idxMax + 1) + " (" + dataSetoran[idxMax] + " kg)");
    }
}
