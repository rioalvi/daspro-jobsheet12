import java.util.Scanner;

public class KubusLimas24 {
    static int luasPersegi(int s) {
        return s * s;
    }

    static int volumeKubus(int s) {
        return s * s * s;
    }

    static int luasPermukaanKubus(int s) {
        return 6 * luasPersegi(s);
    }

    static double volumeLimasPersegi(int s, int t) {
        return (luasPersegi(s) * t) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU BANGUN RUANG ===");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Volume Kubus");
            System.out.println("3. Luas Permukaan Kubus");
            System.out.println("4. Volume Limas Persegi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");
            pilihan = sc.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan panjang sisi (s): ");
                int s = sc.nextInt();
                System.out.println("Luas Persegi = " + luasPersegi(s));
            } else if (pilihan == 2) {
                System.out.print("Masukkan panjang sisi (s): ");
                int s = sc.nextInt();
                System.out.println("Volume Kubus = " + volumeKubus(s));
            } else if (pilihan == 3) {
                System.out.print("Masukkan panjang sisi (s): ");
                int s = sc.nextInt();
                System.out.println("Luas Permukaan Kubus = " + luasPermukaanKubus(s));
            } else if (pilihan == 4) {
                System.out.print("Masukkan panjang sisi alas (s): ");
                int s = sc.nextInt();
                System.out.print("Masukkan tinggi limas (t): ");
                int t = sc.nextInt();
                System.out.println("Volume Limas Persegi = " + volumeLimasPersegi(s, t));
            } else if (pilihan == 0) {
                System.out.println("Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
