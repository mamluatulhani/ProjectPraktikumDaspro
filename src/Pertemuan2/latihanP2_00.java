package Pertemuan2;

import java.util.Scanner;

/**
 * latihanP2_00
 */
public class latihanP2_00 {
    public static void main(String[] args) {
        Scanner hani = new Scanner(System.in);

        String jenisKendaran = hani.nextLine();
        int biayaParkir=0;

        // if (jenisKendaran.equalsIgnoreCase("mobil")) {
        //     biayaParkir=5000;
        // } else {
        //     biayaParkir=2000;
        // }

       biayaParkir= (jenisKendaran.equalsIgnoreCase("mobil"))?5000:2000;

        System.out.println(biayaParkir);
       
    }
    
}