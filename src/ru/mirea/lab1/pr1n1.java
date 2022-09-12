package ru.mirea.lab1;
public class pr1n1 {
    public static void main(String[] args) {
        int[] b = new int[6];
        b[0]=1;
        b[1]=2;
        b[2]=3;
        b[3]=4;
        b[4]=5;
        b[5]=6;
        int sum = 0;
        for(int i = 0; i<b.length; i++){
            sum += b[i];
        }
        System.out.println(sum);
        float fl = sum/b.length;
        System.out.println(fl);
    }
}
