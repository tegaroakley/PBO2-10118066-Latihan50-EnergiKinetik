/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan50.energikinetik;

/**
 *
 * @author PC
 */
public class EnergiKinetik {
    private double massa, kecepatanawal, kecepatanakhir;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatanawal() {
        return kecepatanawal;
    }

    public void setKecepatanawal(double kecepatanawal) {
        this.kecepatanawal = kecepatanawal;
    }

    public double getKecepatanakhir() {
        return kecepatanakhir;
    }

    public void setKecepatanakhir(double kecepatanakhir) {
        this.kecepatanakhir = kecepatanakhir;
    }

    public double hitungEnergiKinetik(){
        return 0.5*massa*kecepatanakhir*kecepatanakhir;
    }
    
    public double hitungUsaha(){
        return 0.5*massa*((kecepatanakhir*kecepatanakhir)-(kecepatanawal*kecepatanawal));
    }
}
