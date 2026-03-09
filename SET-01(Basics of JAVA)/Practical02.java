package pkg250763107023;

import java.util.Scanner;

public class practical02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int d1, d2, d3, d4, d5;

        d1 = (num / 10000) % 10;
        d2 = (num / 1000) % 10;
        d3 = (num / 100) % 10;
        d4 = (num / 10) % 10;
        d5 = num % 10;

        d1 = (d1 + 1) % 10;
        d2 = (d2 + 1) % 10;
        d3 = (d3 + 1) % 10;
        d4 = (d4 + 1) % 10;
        d5 = (d5 + 1) % 10;

        int result = d1 * 10000 + d2 * 1000 + d3 * 100 + d4 * 10 + d5;

        System.out.println("New number: " + result);

        sc.close();
    }
}
