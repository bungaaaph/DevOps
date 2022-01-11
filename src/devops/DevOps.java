/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devops;

import java.util.Scanner;
/**
 *
 * @author bungaaaph
 */
public class DevOps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu,AUD,USD,ambil,jumlah,simpan,saldo,total;
        saldo = 5000;
        AUD = 10000;
        USD = 9000;
        Scanner pilih = new Scanner (System.in);
        System.out.println("Selama datang di ATM kami");
        System.out.println("Silahkan pilih menu yang anda inginkan");
        System.out.println("1. mengambil uang 2. menyimpan uang 3. Cek saldo");
        menu = pilih.nextInt();
        
        if (menu == 1){
            System.out.println("apakah uang anda saat ini berbentuk 1. AUD 2. USD");
            menu = pilih.nextInt ();
            if (menu == 1){
            System.out.println("berapa uang yang ingin anda ambil");
            ambil = pilih.nextInt();
            jumlah = AUD * ambil;
            total = saldo - jumlah ;
            System.out.println("uang yang anda ambil setelah di konversi ke IDR sebesar IDR " + jumlah);
            System.out.println("Saat ini saldo anda sebesar IDR. " + total);
            }
            else if (menu == 2){
            System.out.println("berapa uang yang ingin anda ambil");
            ambil = pilih.nextInt();
            jumlah = USD * ambil;
            total = saldo - jumlah ;
            System.out.println("uang yang anda ambil setelah di konversi ke IDR sebesar IDR " + jumlah);
            System.out.println("Saat ini saldo anda sebesar IDR. " + total);
            }
            else {
                System.out.println("Pilihan yang anda pilih tidak ada");
                System.out.println("terima kasih");
            }
        }
        else if (menu == 2){
            System.out.println("Apakah uang anda saat ini berbentuk 1. AUD 2. USD");
            menu = pilih.nextInt();
            if (menu == 1){
            System.out.println("Berapa uang yang ingin anda simpan");
            simpan = pilih.nextInt();
            jumlah = AUD * simpan;
            total = saldo + jumlah; 
            System.out.println("uang yang anda simpan setelah di konversi ke IDR sebesar IDR " + jumlah);
            System.out.println("Saat ini saldo anda sebesar IDR. " + total);
                }
            else if (menu == 2){
             System.out.println("Berapa uang yang ingin ada simpan");
            simpan = pilih.nextInt();
            jumlah = USD * simpan;
            total = saldo + jumlah; 
            System.out.println("uang yang anda simpan setelah di konversi ke IDR sebesar IDR " + jumlah);
            System.out.println("Saat ini saldo anda sebesar IDR. " + total);
            }
            else {
                System.out.println("Pilihan yang anda pilih tidak ada");
                System.out.println("Terima kasih");
            }
            }
        else if (menu == 3){
            System.out.println("apakah uang anda saat ini berbentu 1. AUD 2. USD");
            menu = pilih.nextInt();
            if (menu == 1){
                jumlah = saldo * AUD;
                System.out.println("Saat ini saldo anda sebesar IDR. " + jumlah);
            }
            else if (menu == 2){
                jumlah = saldo * USD;
                System.out.println("Saat ini saldo anda sebesar IDR. " + jumlah);
            }
            else {
                System.out.println("Pilihan yang anda pilih tidak ada");
                System.out.println("Terima kasih");
            }
        }
        else {
            System.out.println("Pilihan yang anda pilih tidak ada");
            System.out.println("Terima kasih");
        }
    
    } 
}