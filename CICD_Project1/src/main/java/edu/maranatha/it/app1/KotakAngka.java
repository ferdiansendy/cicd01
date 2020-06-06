package edu.maranatha.it.app1;

/**
 * @author Sendy Ferdian Sujadi
 * @Time 01 Agustus 2019
 */
public class KotakAngka {

    public static void main(String[] args) {
        int input = 15;
        int tmp = 0;
        for (int i = 0; i < input * input; i++) {
            ++tmp;
            if (tmp == 5) {
                tmp = 1;
            }
            if (i % input == 0 && i != 0) {
                System.out.print("\n" + tmp);
            } else {
                System.out.print(tmp);
            }
        }
    }
}
