/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author USER
 */
public class panggil {

    public static void main(String[] args) {
        Enkapsulasi pe = new Enkapsulasi();
        pe.namaSiswa = "Ani";
        pe.alamat = "Malang";
        pe.cetakBiodata();
        pe.setUsia(14);
        System.out.println("Usia : " + pe.getUsia());
        
    }

}
