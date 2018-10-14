/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author root
 */
public class Utama_manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia data1 = new manusia();//obyek 1 bernama data1
        manusia data2 = new manusia();//obyek 2 bernama data2
        
        //memberi nomor dan nama objek mobil1 dan mobil2
        data1.masuk_data("Banpo", "Laki-Laki");
        data2.masuk_data("Warsinah", "Perempuan");
        
        //memberi umur objek data1 dan data2
        data1.masuk_usia(20);
        data2.masuk_usia(25);
        
        //menambahkan spesifikasi badan pada data1 dan data2
        data1.masuk_spekbadan(178, 67);
        data2.masuk_spekbadan(167, 40);
        
        //panggil method
        data1.info();
        System.out.println("\n");
        data2.info();
        
    }
      
}
