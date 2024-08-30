import java.util.Scanner;
public class Lexico {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama 1: ");
        String nama1 = scan.nextLine();

        System.out.print("Masukkan Nama 2: ");
        String nama2 = scan.nextLine();

        int sumlen = nama1.length() + nama2.length();
        int compstr = nama1.compareTo(nama2);
        String hasil = (compstr < 0)? "No": (compstr > 0)?"Yes":"Equal";

        System.out.println("Panjang String " + sumlen);
        System.out.println("Hasil Lexico " + hasil);
        System.out.print(nama1.substring(0, 1).toUpperCase() + nama1.substring(1));
        System.out.println(' ' + nama2.substring(0, 1).toUpperCase() + nama2.substring(1));
    }
}
