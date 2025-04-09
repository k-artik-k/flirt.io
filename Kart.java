import java.util.Scanner;

public class Kart {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Approaching girl...");

        System.out.print("Does she have a boyfriend? (yes/no): ");
        String hasBoyfriend = k.nextLine().toLowerCase();

        if (hasBoyfriend.equals("no")) {
            flirt();
        } else if (hasBoyfriend.equals("yes")) {
            shoot();
        } else {
            System.out.println("Try again");
        }

        k.close();
    }

    static void flirt() {
        System.out.println("Kart: Hey, are you French? Because Eiffel for you.");
    }

    static void shoot() {
        System.out.println("Kart: *throws self-respect into trash*");
        System.out.println("Kart: Do you want a better one?");
    }
}
