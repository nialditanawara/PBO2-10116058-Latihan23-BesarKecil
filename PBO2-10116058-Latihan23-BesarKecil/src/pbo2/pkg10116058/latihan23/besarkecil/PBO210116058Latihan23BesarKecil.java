/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan23.besarkecil;

import java.util.Scanner;

public class PBO210116058Latihan23BesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaPtgs;
        int no, min, max, banyakMhs;
        int[] nilai = new int[1000];

        Scanner doyen = new Scanner(System.in);

        System.out.println("========Program Nilai Terbear dan Terkecil Nilai"
                + "Mahasiswa===========");
        System.out.print("Masukkan Nama Petugas : ");
        namaPtgs = doyen.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyakMhs = doyen.nextInt();

        for (no = 1; no <= banyakMhs; no++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke- " + no + " : ");
            nilai[no] = doyen.nextInt();
        }
        max = 0;
        min = 1000;
        System.out.println("===========Hasil Nilai Mahasiswa==========");
        for (no = 1; no <= nilai[no]; no++) {
            if (nilai[no] < min) {
                min = nilai[no];
            } else if(nilai[no] > max) {
                max = nilai[no];
            }if(nilai[no] > max) {
                max = nilai[no];
            }
            System.out.println("Nilai Mahasiswa ke- " + no + " : " + nilai[no]
                    + "\n");
        }
        System.out.println("Nilai Terbesar Adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min + "\n");
        System.out.println("Petugas" + namaPtgs + "\n");

    }

}