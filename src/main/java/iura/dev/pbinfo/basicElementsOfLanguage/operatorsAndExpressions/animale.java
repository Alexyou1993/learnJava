package iura.dev.pbinfo.basicElementsOfLanguage.operatorsAndExpressions;

//Requirement
//        In a yard there are dogs, cats and chickens. It is known that the number of cats is equal to twice the number of dogs, and the number of chickens is equal to twice the number of cats. If there are Cdogs in the yard, how many animals are there in the yard?
//
//        Input data
//        The program reads the natural number from the keyboard C.
//
//        Output data
//        The program will display the total number of animals in the yard on the screen.
//
//        Restrictions and clarifications
//        2 ≤ C ≤ 1000
//        Example:
//        entry
//
//        3
//        Exit
//
//        21
//        Explanation
//        There are 3dogs, 6cats and 12chickens, in total 21animals.

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