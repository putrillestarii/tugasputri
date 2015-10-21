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
public class PersegiPanjang {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang setPanjang(double p)
    {
        this.panjang = p;
        return this;
    }
    public PersegiPanjang setLebar(double l)
    {
        this.lebar = l;
        return this;
    }
    
    public double luas()
    {
        return this.panjang * this.lebar;
    }
    
}
