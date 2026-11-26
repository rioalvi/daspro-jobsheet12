import java.util.Scanner;

public class LuasLingkaran1_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r;
        System.out.print("Masukkan jari-jari lingkaran: ");
        r = sc.nextDouble();

        double luas = 3.14 * r * r;
        System.out.println("Luas lingkaran = " + luas);

        sc.close();
    }
}
