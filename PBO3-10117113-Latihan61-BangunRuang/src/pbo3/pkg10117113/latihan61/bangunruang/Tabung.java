/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan61.bangunruang;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menampilkan hasil hitung volume tabung, bola, dan
 *            kerucut.  
 *            
 */
public class Tabung extends BangunRuang{
    public double jari2;
    public double tinggi;

    public double getJari2() {
        return jari2;
    }

    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume(){
        this.volume = 3.14*(jari2*jari2)*tinggi;
        return this.volume;
        
    }
}
