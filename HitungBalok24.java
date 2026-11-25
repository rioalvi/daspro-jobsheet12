import java.util.Scanner;

public class HitungBalok24 {
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    //Modifikasi Pertanyaan 4 Fungsi hitungLuasPermukaanBalok memanfaatkan hitungLuas
    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        return 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Menghitung luas permukaan dan volume 3 balok dengan ukuran berbeda
        for (int i = 1; i <= 3; i++) {
            System.out.println("=== Balok ke-" + i + " ===");
            System.out.print("Masukkan panjang: ");
            int p = input.nextInt();
            System.out.print("Masukkan lebar: ");
            int l = input.nextInt();
            System.out.print("Masukkan tinggi: ");
            int t = input.nextInt();

            int luasPermukaan = hitungLuasPermukaanBalok(p, l, t);
            int vol = hitungVolume(t, p, l);

            System.out.println("Luas Permukaan Balok ke-" + i + " adalah " + luasPermukaan);
            System.out.println("Volume Balok ke-" + i + " adalah " + vol + "\n");
        }

        input.close();
    }
}
