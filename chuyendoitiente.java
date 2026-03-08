import java.util.Scanner;

public class chuyendoitiente {
    public static final double tiente = 25000;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("KIEM TRA TIEN TE");
        System.out.println("1. USD -> VND");
        System.out.println("2. VND -> USD");
        System.out.println("0. thoat");
        System.out.print("Nhap lua chon :");

        if (!scanner.hasNextInt()){
            System.out.print("Nhap so");
            scanner.next();

        }
        int luachon = scanner.nextInt();
      switch(luachon){
          case 1 :
              System.out.print("Nhap USD:");
              double USD = scanner.nextDouble();
              double tien = USD * tiente;
              System.out.println("ket qua:"+ tien+ "%2f " + "VND");
              break;
          case 2 :
              System.out.print("Nhap VND:");
              double VND = scanner.nextDouble();
              double te = VND / tiente;
              System.out.println("ket qua:"+ te +"VND");
              break;
          case 0:
              System.out.println("Tambiet");
              break;
          default:
              System.out.println("vui long nhap so tren");
              break;

      }

    }
}
