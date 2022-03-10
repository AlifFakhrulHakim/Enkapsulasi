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
public class Enkapsulasi {

    public String namaSiswa;
    private int usia;
    protected String alamat;

    /**
     * @param args the command line arguments
     */
    public void cetakBiodata() {
        System.out.println("Nama : " + namaSiswa);
        System.out.println("Alamat : " + alamat);
        // TODO code application logic here
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public int getUsia() {
        return usia;
    }

}
