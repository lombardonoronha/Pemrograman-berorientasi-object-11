/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ArrayProcessing {
    int[] dataBil = new int[100];
    
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data (n): ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Masukkan bil ke-"+(i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    double cariMax(int[] data){
        int i;
        int max = dataBil[0];
        for (i = 1; i < n; i++)
             if (dataBil[i] > max)
                 max = dataBil[i];
        
         return max;
    }
    
    double cariMin(int[] data){
        int i;
        int min = dataBil[0];
        for (i = 1; i < n; i++)
             if (dataBil[i] < min)
                min = dataBil[i];
        
         return min;
    }
    
    int[] urutkan(int[] data){
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (dataBil[j] > dataBil[j+1])
                {
                    int temp = dataBil[j];
                    dataBil[j] = dataBil[j+1];
                    dataBil[j+1] = temp;
                }
        
        return dataBil;
    }
    
    void output(){
        int[] newBil = this.urutkan(this.dataBil);
        System.out.println("Rerata: " + this.hitungRerata(this.dataBil));
        System.out.println("Nilai Maximum: " + this.cariMax(this.dataBil));
        System.out.println("Nilai Minimum: " + this.cariMin(this.dataBil));
        System.out.print("Sorted Array: " );
        for (int i=0; i<n; i++){
            System.out.print(newBil[i]+", ");
        }
    }
}