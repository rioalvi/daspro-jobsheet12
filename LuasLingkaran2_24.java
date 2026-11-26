import java.util.Scanner;

public class LuasLingkaran2_24 {
    static void luasLingkaran() {
        Scanner sc = new Scanner(System.in);

        double r;
        System.out.print("Masukkan jari-jari lingkaran: ");
        r = sc.nextDouble();

        double luas = 3.14 * r * r;
        System.out.println("Luas lingkaran = " + luas);

        sc.close();
    }

    public static void main(String[] args) {
        luasLingkaran();
    }
}
