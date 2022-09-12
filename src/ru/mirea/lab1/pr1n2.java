package ru.mirea.lab1;
import java.util.Scanner;
public class pr1n2 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] m = new int [10];
    int i = 0;
    do {
        m[i] = sc.nextInt();
        i++;
    }while (i < m.length);
    i = 0;
    int sum = 0, min = 100000000, max=-100000000;
    while(i<m.length){
        sum += m[i];
        if (m[i] < min) min = m[i];
        if (m[i] > max) max = m[i];
        i++;
    }
    System.out.println(sum);
    System.out.println(min);
    System.out.println(max);
    }
}

