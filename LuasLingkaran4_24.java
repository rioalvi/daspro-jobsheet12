import java.util.Scanner;

public class LuasLingkaran4_24 {
    static double luasLingkaran() {
        Scanner sc = new Scanner(System.in);

        double r;
        System.out.print("Masukkan jari-jari lingkaran: ");
        r = sc.nextDouble();

        double luas = 3.14 * r * r;
        sc.close();
        return luas;
    }

    public static void main(String[] args) {
        double L = luasLingkaran();
        System.out.println("Luas lingkaran = " + L);
    }
}
