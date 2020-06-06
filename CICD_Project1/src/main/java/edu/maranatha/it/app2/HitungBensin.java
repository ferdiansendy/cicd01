package edu.maranatha.it.app2;

import java.util.Scanner;

/**
 * @author Sendy Ferdian Sujadi
 * @Time 01 Agustus 2019
 */
public class HitungBensin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Besar Uang : ");
        int jb = sc.nextInt();
        double hasil = (double) jb / 4500;
        String temp = "";
        int x = -1;
        for (int i = 0; i < (hasil + "").length(); i++) {
            temp += (hasil + "").charAt(i);
            if ((hasil + "").charAt(i) == '.') {
                x = i + 2;
            }
            if (i == x) {
                break;
            }
        }
        System.out.print("Jumlah Bensin : ");
        System.out.print(temp);
        System.out.print(" Liter Premium");
    }
}
