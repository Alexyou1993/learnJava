package iura.dev.pbinfo.basicElementsOfLanguage.operatorsAndExpressions;

import org.junit.Test;

import java.io.*;
import java.util.*;

import static org.junit.Assert.*;


public class sum00Test {

    @Test
    public void sumOfTwoPositiveNumbers(){
        ByteArrayInputStream in = new ByteArrayInputStream("3\n5\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        assertEquals(8, a+b);

    }
    @Test
    public void sumOfPositiveAndNegativeNumbers(){
        ByteArrayInputStream in = new ByteArrayInputStream("3\n-5\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        assertEquals(-2, a+b);

    }
    @Test
    public void sumOfTwoNegativeNumbers(){
        ByteArrayInputStream in = new ByteArrayInputStream("-3\n-5\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        assertEquals(-8, a+b);

    }
    @Test
    public void sumWithZero(){
        ByteArrayInputStream in = new ByteArrayInputStream("0\n3\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        assertEquals(3, a+b);

    }
    @Test
    public void invalidInputThrowsException(){
        ByteArrayInputStream in = new ByteArrayInputStream("a\n3\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        assertThrows(java.util.InputMismatchException.class, () ->{
            int a= scanner.nextInt();
        });
    }

}