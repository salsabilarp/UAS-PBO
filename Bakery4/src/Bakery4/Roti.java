/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bakery4;

/**
 *
 * @author user
 */
public abstract class Roti {
    public String nama;
    
    public double hTerigu = 40000/1000;
    public double hGula = 25000/1000;
    public double hButter = 23000/500;
    public double hRagi = 5000/11;
    public double hSuBu = 39000/1000;
    public double hSuCa = 24000/1000;
    public double hTelur = 23000/1000;
    public double hEs = 2000/1000;
    /*
    public double hKeju = 31000/250;
    public double hCoklat = 29000/500;
    public double hKrim = 30000/500;
    public double hSelai = 25000/500;
    public double hSosis = 80000/1000;
    public double hBeef = 90000/1000;
    public double hBombay = 40000/500;
    */
   
    
//Method//
    public abstract double totalBeratAdonan();
    public abstract double totalHargaAdonan();
    
    //Method berat bahan per Adonan//
    public abstract double totalBeratTerigu();
    public abstract double totalBeratGula();
    public abstract double totalBeratButter();
    public abstract double totalBeratRagi();
    public abstract double totalBeratSubu();
    public abstract double totalBeratSuca();
    public abstract double totalBeratTelur();
    public abstract double totalBeratEs();
    
   
    
    
      
  
    //Method Rincian//
    public abstract void tampilRincianAdonan();
    public abstract void tampilRincianFillTop();
    
}
