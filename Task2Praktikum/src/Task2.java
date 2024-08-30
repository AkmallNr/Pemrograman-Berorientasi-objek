//No 1

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        long angka = scan.nextLong();

        String temp;

        if (angka >= Byte.MIN_VALUE && angka <= Byte.MAX_VALUE) {
            temp = "*byte";
            if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE) {
                temp += "\n*short";
                if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE) {
                    temp += "\n*integer";
                    if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) {
                        temp += "\n*long";
                    }
                }
            }
        } else if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE) {
            temp = "*short";
            if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE) {
                temp += "\n*integer";
                if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) {
                    temp += "\n*long";
                }
            }
        } else if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE) {
            temp = "*integer";
            if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) {
                temp += "\n*long";
            }
        } else if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) {
            temp = "*long";
        } else {
            temp = String.valueOf(angka) + " Can’t be fitted anywhere";
        }



        System.out.printf("%d can be fitted in\n%s", angka, temp );

    }

}
