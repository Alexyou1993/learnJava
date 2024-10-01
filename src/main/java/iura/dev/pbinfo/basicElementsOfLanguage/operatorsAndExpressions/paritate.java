package iura.dev.pbinfo.basicElementsOfLanguage.operatorsAndExpressions;

import java.util.*;

public class paritate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " este par");
        } else {
            System.out.println(n + " este impar");
        }
    }
}
