import java.util.Scanner;

public class LuasLingkaran5_24 {
    static double luasLingkaran(double r) {
        double luas = 3.14 * r * r;
        return luas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;
        System.out.print("Masukkan jari-jari lingkaran: ");
        x = sc.nextDouble();

        double L = luasLingkaran(x);
        System.out.println("Luas lingkaran = " + L);

        sc.close();
    }
}
