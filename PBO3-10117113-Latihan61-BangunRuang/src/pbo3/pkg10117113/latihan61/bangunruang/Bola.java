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
public class Bola extends BangunRuang{
    private double jari2;
 

    public double getJari2() {
        return jari2;
    }

    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }

    public double hitungVolume() {
        this.volume = (4/3) * 3.14 * (jari2*jari2*jari2);
        return this.volume;
    }
}
