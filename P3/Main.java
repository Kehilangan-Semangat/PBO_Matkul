package P3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan merk sepeda: ");
        String merk = scanner.nextLine();

        Sepeda sepedaKu = new Sepeda(merk);

        int pilihan;
        do {
            System.out.println("\n=== MENU SIMULASI SEPEDA ===");
            System.out.println("1. Maju (+10 km)");
            System.out.println("2. Mundur (-5 km)");
            System.out.println("3. Berhenti");
            System.out.println("0. Exit");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();

            System.out.println("----------------------------");
            switch (pilihan) {
                case 1:
                    sepedaKu.maju();
                    break;
                case 2:
                    sepedaKu.mundur();
                    break;
                case 3:
                    sepedaKu.berhenti();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Pilih opsi 0 - 3.");
                    break;
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
