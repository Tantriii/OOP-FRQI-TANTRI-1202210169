import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    Calculation calculation = new Calculation();

    do {
      try {
        System.out.println("\n==Menu Program==");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Trapesium");
        System.out.println("0. Exit");
        System.out.print("Pilih Menu: ");
        int PilihMenu = scanner.nextInt();

        switch (PilihMenu) {
          case 1:
            System.out.print("\nMasukkan panjang sisi persegi : ");
            double sisi = scanner.nextDouble();
            calculation.setSquare(sisi);
            calculation.run();
            System.out.println("\nHasil perhitungan: " + calculation.getSquare());
            break;
          case 2:
            System.out.print("\nMasukkan jari-jari lingkaran : ");
            double radius = scanner.nextDouble();
            calculation.setCircle(radius);
            calculation.run();
            System.out.println("\nHasil perhitungan: " + calculation.getCircle());
            break;
          case 3:
            System.out.print("\nMasukkan sisi atas trapesium : ");
            double a = scanner.nextDouble();
            System.out.print("Masukkan sisi alas trapesium: ");
            double b = scanner.nextDouble();
            System.out.print("Masukkan tinggi trapesium : ");
            double t = scanner.nextDouble();
            calculation.setTrapezoid(a, b, t);
            calculation.run();
            System.out.println("\nHasil perhitungan:" + calculation.getTrapezoid());
            break;
          case 0:
            System.out.println("\nProgram Selesai");
            break;
          default:
            System.out.println("\nOpsi tidak tersedia");
            continue;
        }
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("\n====Error: Input harus berupa integer atau angka====");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repeat);

    scanner.close();
  }
}
