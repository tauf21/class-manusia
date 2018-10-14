/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author taufik.amary@gmail.com
 */
public class manusia {
    //variable class
    private String nama;
    private String kelamin;
    private int umur;
    private int tinggibadan;
    private int beratbadan;
    
    //informasi mobil --> METHOD
    public void masuk_data(String nama, String kelamin){
        this.nama = nama;
        this.kelamin = kelamin;
    }
    public void masuk_usia(int umur){
        this.umur = umur;
    }
    public void masuk_spekbadan(int tb, int bb){
        this.tinggibadan=tb;
        this.beratbadan=bb;
    }
    public void info(){
        System.out.println("Nama          = "+this.nama);
        System.out.println("Jenis Kelamin = "+this.kelamin);
        System.out.println("Umur          = "+this.umur);
        System.out.println("Tinggi Badan  = "+this.tinggibadan);
        System.out.println("Berat Badan   = "+this.beratbadan);
    }
    
}
