import java.util.Scanner;

public class HitungBalok24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("Masukan panjang");
        p = input.nextInt();

        System.out.println("Masukan lebar");
        l = input.nextInt();

        System.out.println("Masukan tinggi");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas persegi panjang adalah " + L);
        vol = p * l * t;
        System.out.println("Volume balok adalah " + vol);

        input.close();
    }
}
