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
public class Persegi {
    private double sisi;
    
    public Persegi setSisi(double s)
    {
        this.sisi = s;
        return this;
    }
    
    public double luas()
    {
        double hasil = this.sisi * this.sisi;
        return hasil;
    }
}
