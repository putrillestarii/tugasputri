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
public class Segitiga {
    private double alas;
    private double tinggi;
    
    public Segitiga setAlas(double a)
    {
        this.alas = a;
        return this;
    }
    
    public Segitiga setTinggi(double t)
    {
        this.tinggi = t;
        return this;
    }
    
    public double luas()
    {
        return (this.alas * this.tinggi) / 2;
    }
}
