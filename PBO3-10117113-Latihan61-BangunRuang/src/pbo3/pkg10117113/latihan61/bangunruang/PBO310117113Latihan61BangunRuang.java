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
public class PBO310117113Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setJari2(7);
        System.out.println("jari-jari : "+bola.getJari2()+
                " Volume : " + bola.hitungVolume());
        
        Tabung tb = new Tabung();
        tb.setTinggi(21);
        tb.setJari2(10);
        System.out.println("Jari-jari : "+tb.getJari2()+
                ", Tinggi : "+tb.getTinggi()+", Volume : " + tb.hitungVolume());
        
        
        Kerucut kc = new Kerucut();
        kc.setJari2(14);
        kc.setTinggi(9);
        System.out.println("Jari-jari : "+kc.getJari2()+
                ", Tinggi : "+kc.getTinggi()+", Volume : " + kc.hitungVolume());
    }
    
}
