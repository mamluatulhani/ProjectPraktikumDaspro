package Pertemuan2;

import java.util.Scanner;

public class ContohVariabel00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isMember;
        int total, totalBayar, diskon;

        System.out.print("apakah member?");
        isMember = sc.nextBoolean();

        System.out.print("input total belanja: ");
        total = sc.nextInt();

        if (isMember) {
            if (total>5000_000) {
                diskon=50_000;
            } else if (total>500_000){
                diskon=25_000;
            } else{
                diskon=10_000;
            }
        } else {
            if (total>2000_000) {
                diskon=10_000;
            } else {
                diskon=0;
            }
        }
        totalBayar=total-diskon;
        System.out.println(totalBayar);
        




   

    }
    
}
