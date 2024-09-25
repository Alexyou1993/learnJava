package iura.dev.pbinfo;
import java.util.*;

public class uciv {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x,y;
        x = cin.nextInt();
        y = cin.nextInt();
        System.out.println((x % 10 + y % 10 ) % 10);
    }
}