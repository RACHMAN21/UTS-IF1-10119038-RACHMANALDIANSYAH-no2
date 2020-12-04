/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.tabungan;

/**
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi untuk menampilkan hasil penarikan uang
 *                     Tabungan dengan konsep pendekatan object oriented
 */

import java.util.Scanner;

public class Tester {
    public static int jumlah;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tabungan tabungan = new Tabungan(0);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal      : ");tabungan.setSaldo(sc.nextInt());
        System.out.print("Jumlah uang yang diambil : ");jumlah = sc.nextInt();
        System.out.println("Saldo Anda Sekarang\t     : " + tabungan.ambilUang(jumlah));
    }
}