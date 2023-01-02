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
public class AdonanPizza extends Roti implements HargaFillTop{
    public int terigu = 1000;
    public int gula = 100;
    public int butter = 100;
    public int ragi = 20;
    public int suBu = 200;
    public int suCa = 180;
    public int telur = 50;
    public int es = 300;

     public double mterigu;
    public double mgula;
    public double mbutter;
    public double mragi;
    public double msuca;
    public double msubu;
    public double mtelur;
    public double mes;
    
    public double keju;
    public double coklat;
    public double krim;
    public double selai;
    public double sosis;
    public double beef;
    public double bombay;
    
    public double mkeju;
    public double msosis;
    public double mbeef;
    public double mbombay;
    
    @Override
    public double totalBeratAdonan() {
        double berat = this.terigu + this.gula + this.butter + this.ragi + this.suBu + this.suCa + this.telur + this.es;
        return berat;
    }

    @Override
    public double totalHargaAdonan() {
        double harga = (this.terigu * this.hTerigu) + (this.gula * this.hGula) + (this.butter* this.hButter) + (this.ragi* this.hRagi) + (this.suBu* this.hSuBu) + (this.suCa* this.hSuCa) + (this.telur* this.hTelur) + (this.es* this.hEs);
        return harga;
    }
    
    public void tampilRincianAdonan(){
       System.out.println("Total berat adonan Pizza    = " + String.format("% .0f",this.totalBeratAdonan()) + " gr");
       System.out.println("Total harga adonan Pizza    = " + "Rp " + String.format("% .0f",this.totalHargaAdonan()));
       System.out.println("Total harga adonan per pcs  = "  + "Rp " + String.format("% .0f",this.hAdonanPcs()));
       System.out.println("---------------------------------------------------"); 
    }
    
    public void tampilRincianFillTop(){
       System.out.println("Total harga fill+top Pizza  = " + "Rp " + String.format("% .0f", this.totalHargaFillTop()));
       System.out.println("Total harga bahan per pcs   = " + "Rp " + String.format("% .0f",(this.hAdonanPcs() + this.totalHargaFillTop())));
       System.out.println("Harga jual Pizza per pcs    = " + "Rp " + String.format("% .0f", ((this.hAdonanPcs() + this.totalHargaFillTop()) * 1.5)));
       System.out.println(" \n" + " ");
    }

    public double hAdonanPcs(){
        double hPcs = this.totalHargaAdonan() * 190 / this.totalBeratAdonan();
        return hPcs;
    }
    
    @Override
    public double totalHargaFillTop() {
        double hFillTop = (this.beef * this.hBeef) + (this.bombay * this.hBombay) + (this.coklat * this.hCoklat) + (this.keju * this.hKeju) + (this.krim * this.hKrim) + (this.selai * this.hSelai) + (this.sosis * this.hSosis);
        return hFillTop;
    }

@Override
    public double totalBeratTerigu() {
        double mTerigu = this.terigu/this.totalBeratAdonan()*190*10;
        return mTerigu;
    }

    @Override
    public double totalBeratGula() {
      double mGula = this.gula/this.totalBeratAdonan()*190*10;
        return mGula;  
    }

    @Override
    public double totalBeratButter() {
       double mButter = this.butter/this.totalBeratAdonan()*190*10;
        return mButter; 
    }

    @Override
    public double totalBeratRagi() {
        double mRagi = this.ragi/this.totalBeratAdonan()*190*10;
        return mRagi;
    }

    @Override
    public double totalBeratSubu() {
        double mSubu = this.suBu/this.totalBeratAdonan()*190*10;
        return mSubu;
    }

    @Override
    public double totalBeratSuca() {
        double mSuca = this.suCa/this.totalBeratAdonan()*190*10;
        return mSuca;
    }

    @Override
    public double totalBeratTelur() {
        double mTelur = this.telur/this.totalBeratAdonan()*190*10;
        return mTelur;
    }

    @Override
    public double totalBeratEs() {
        double mEs = this.es/this.totalBeratAdonan()*190*10;
        return mEs;
    }

   
}
