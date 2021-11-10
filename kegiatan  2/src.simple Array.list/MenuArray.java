/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class MenuArray {
    ArrayList<String> dataBil = new ArrayList<String>();
    
    void menu(){
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Menu Data ArrayList:");
            System.out.println("1. Tambah data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.println("Pilih nomor berapa:");

            int option = input.nextInt();
            switch(option) {
                case 1:
                    add();
                    break;
                case 2:
                    cari();
                    break;
                case 3:
                    hapus();
                    break;
                case 4:
                    tampil();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
    
    void add(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan data string: ");
        this.dataBil.add(input.nextLine());
        System.out.println("Daftar string dalam array list: " + this.dataBil);
        input.nextLine();
    }
    
    void cari(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("String yang mau dicari: ");
        String cari = input.nextLine();
        int index = this.dataBil.indexOf(cari);
        if(index >= 0) {
            System.out.println("String '" + cari + "' ada di index ke-"+ index +" di dalam data");
        } else {
        System.out.println("String ‘"+ cari +"’ tidak ada dalam data");
        }
        input.nextLine();
    }
    
    void hapus(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("String yang mau dihapus: ");
        String hapus = input.nextLine();
        int index = this.dataBil.indexOf(hapus);
        if(index >= 0) {
            this.dataBil.remove(index);
            System.out.println("String '" + hapus + "' sudah dihapus di dalam data");
        } else {
        System.out.println("String ‘"+ hapus +"’ tidak ada dalam data");
        }
        System.out.println("Daftar string dalam array list: " + this.dataBil);
        input.nextLine();
    }
    
    void tampil(){
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar string dalam array list: " + this.dataBil);
        input.nextLine();
    }
}