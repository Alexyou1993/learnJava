package iura.dev.pbinfo.basicElementsOfLanguage.operatorsAndExpressions;

import java.util.Scanner;
public class copii2 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int F = cin.nextInt();
        int B = cin.nextInt();
        int n = cin.nextInt();

        System.out.println(((F * 3)  + (B * 2)) * n) ;
    }
}
