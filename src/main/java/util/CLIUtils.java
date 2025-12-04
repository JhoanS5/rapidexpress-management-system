package util;

import java.util.Random;
import java.util.Scanner;

public class CLIUtils {

    private static final Scanner scanner = new Scanner(System.in);

    public static String leerString(String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextLine().trim();
    }

    public static int leerInt(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje + ": ");
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
            }
        }
    }

    public static double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje + ": ");
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
            }
        }
    }

    public static boolean leerBoolean(String bool) {
        while (true) {
            System.out.print(bool + " (s/n): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("s")) return true;
            if (input.equals("n")) return false;
            System.out.println("Entrada inválida. Use 's' o 'n'.");
        }
    }

    public static String generarTrackingCode() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            sb.append(caracteres.charAt(rnd.nextInt(caracteres.length())));
        }
        return sb.toString();
    }
}
