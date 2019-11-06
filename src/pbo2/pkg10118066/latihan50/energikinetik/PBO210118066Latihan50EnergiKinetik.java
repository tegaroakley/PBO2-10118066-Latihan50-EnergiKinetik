/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan50.energikinetik;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        EnergiKinetik ek = new EnergiKinetik();
        ek.setMassa(145);
        ek.setKecepatanakhir(25);
        ek.setKecepatanawal(0);
        System.out.println("======Program Hitung Energi Kinetik======");
        System.out.println("Massa \t\t: " + ek.getMassa() + " g");
        System.out.println("Kecepatan \t: " + ek.getKecepatanakhir()+ " m/s");
        System.out.println("");
        System.out.println("Energi Kinetik \t: " + ek.hitungEnergiKinetik() + " Joule");
        System.out.println("Usaha \t\t: " + ek.hitungUsaha() + " Joule");
        System.out.println("Dikarenakan tidak adanya perubahan kecepatan sehingga Usaha = Energi Kinetik");
    }
    
}
