/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author User
 */
public class riska {
    //attribute
    int panjang;
    int lebar;
    
    //method
    int luas(){
       int area = this.lebar * this.panjang;
       return area;
    }
    public static void main(String[] args) {
        riska A = new riska();
        A.lebar = 2;
        A.panjang = 4;
        System.out.println(A.luas());
    }
}

