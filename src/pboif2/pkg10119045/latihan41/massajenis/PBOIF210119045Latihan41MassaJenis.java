/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119045.latihan41.massajenis;

/**
 *
 * @author Legion
 */
public class PBOIF210119045Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Kubus kubus = new Kubus();
        
        System.out.println("=====Massa Jenis Kubus=====");
        kubus.setSisi(5);
        System.out.println("Sisi : " + kubus.getSisi());
        kubus.setMassa(250);
        System.out.println("Massa : " + kubus.getMassa());
        
        System.out.println();
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(kubus.getMassa(),kubus.hitungVolume(kubus.getSisi())));
    }
    
}
