/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11; // tambahkan package Modul11
import java.util.Scanner;// tambahkan Scanner dengan import
/**
 *
 * @author gilbysingarimbun
 */
public class GanjilGenap {//tambahkan public class GanjilGenap
    public static void main(String[] args) {// tambahkan public static void main...
        
        /*Masukkan Scanner dengan nilai input yang akan dipakai*/
        Scanner input = new Scanner(System.in);
        // masukkan variabel nilai yang bersifat integer
        int nilai;
        
        /*Tambahkan output untuk memintah user apa yang mau diisi*/
        System.out.print("Masukkan nomor anda: ");
        //masukkan hasil input dari user menjadi nilai dengan nilai bersifat integer
        nilai = input.nextInt();
        
        /*tambahkan if else, dimana if berisi jika % atau hasil sisa pembagian 
        tidak ada sisa atau sama dengan 0 maka hasil adalah genap dari variebl nilai
        dengan emggunakan == karena ini adalah perbandingan variabel*/
        if(nilai%2==0){
            System.out.println("Nomor anda genap");}
        //maka kecuali itu yang adalah berupa %1 akan memberi output menjadi ganjil
        else {System.out.println("Nomor anda Ganjil");}
    }
    
}
