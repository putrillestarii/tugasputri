/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan4;

/**
 *
 * @author Dwi Randy H
 */
public class Lingkaran {
    private double jari_jari;
    
    public Lingkaran setJariJari(double jari)
    {
        this.jari_jari = jari;
        return this;
    }
    
    public double getLuas()
    {
        double luas = 3.14 * (this.jari_jari * this.jari_jari);
        return luas;
    }
}
