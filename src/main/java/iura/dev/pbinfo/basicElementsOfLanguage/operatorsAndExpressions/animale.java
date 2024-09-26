package iura.dev.pbinfo.basicElementsOfLanguage.operatorsAndExpressions;

import java.util.Scanner;
public class animale {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int c;
        do {
            c = cin.nextInt();
        } while (!(c >= 2 && c <= 1000));
        System.out.println(c + (c * 2) + (c * 4));
    }
}