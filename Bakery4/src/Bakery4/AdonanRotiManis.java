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
public class AdonanRotiManis extends Roti implements HargaFillTop{
    
    public int terigu = 1000;
    public int gula = 150;
    public int butter = 150;
    public int ragi = 20;
    public int suBu = 300;
    public int suCa = 250;
    public int telur = 80;
    public int es = 400;
    
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
    public double mcoklat;
    public double mkrim;
    public double mselai;
    public double msosis;
    
    
    
    
    

    @Override
    public  double totalBeratAdonan() {
        double berat = this.terigu + this.gula + this.butter + this.ragi + this.suBu + this.suCa + this.telur + this.es;
        return berat;        
    }
    
    @Override
    public double totalHargaAdonan() {
        double harga = (this.terigu * this.hTerigu) + (this.gula * this.hGula) + (this.butter* this.hButter) + (this.ragi* this.hRagi) + (this.suBu* this.hSuBu) + (this.suCa* this.hSuCa) + (this.telur* this.hTelur) + (this.es* this.hEs);
        return harga;
    }
    
    @Override
    public double totalHargaFillTop() {
        double hFillTop = (this.beef * this.hBeef) + (this.bombay * this.hBombay) + (this.coklat * this.hCoklat) + (this.keju * this.hKeju) + (this.krim * this.hKrim) + (this.selai * this.hSelai) + (this.sosis * this.hSosis);
        return hFillTop;
    }
    
    public double hAdonanPcs(){
        double hPcs = this.totalHargaAdonan() * 50 / this.totalBeratAdonan();
        return hPcs;
    }

    public void tampilRincianAdonan(){
       System.out.println("Total berat adonan Roti Manis    = " + String.format("% .0f",this.totalBeratAdonan()) + " gr");
       System.out.println("Total harga adonan Roti Manis    = " + "Rp " + String.format("% .0f",this.totalHargaAdonan()));
       System.out.println("Total harga adonan per pcs       = "  + "Rp " + String.format("% .0f",this.hAdonanPcs()));
       System.out.println("---------------------------------------------------"); 
    }
    public void tampilRincianFillTop(){
       System.out.println("Total harga fill+top Roti Manis  = " + "Rp " + String.format("% .0f", this.totalHargaFillTop()));
       System.out.println("Total harga bahan per pcs        = " + "Rp " + String.format("% .0f",(this.hAdonanPcs() + this.totalHargaFillTop())));
       System.out.println("Harga jual Roti Manis per pcs    = " + "Rp " + String.format("% .0f", ((this.hAdonanPcs() + this.totalHargaFillTop()) * 1.5)));
       System.out.println(" \n" + " ");
    }

    //Method berat bahan per Adonan//
    
    @Override
    public double totalBeratTerigu() {
        double mTerigu = this.terigu/this.totalBeratAdonan()*50*220;
        return mTerigu;
    }

    @Override
    public double totalBeratGula() {
      double mGula = this.gula/this.totalBeratAdonan()*50*220;
        return mGula;  
    }

    @Override
    public double totalBeratButter() {
       double mButter = this.butter/this.totalBeratAdonan()*50*220;
        return mButter; 
    }

    @Override
    public double totalBeratRagi() {
        double mRagi = this.ragi/this.totalBeratAdonan()*50*220;
        return mRagi;
    }

    @Override
    public double totalBeratSubu() {
        double mSubu = this.suBu/this.totalBeratAdonan()*50*220;
        return mSubu;
    }

    @Override
    public double totalBeratSuca() {
        double mSuca = this.suCa/this.totalBeratAdonan()*50*220;
        return mSuca;
    }

    @Override
    public double totalBeratTelur() {
        double mTelur = this.telur/this.totalBeratAdonan()*50*220;
        return mTelur;
    }

    @Override
    public double totalBeratEs() {
        double mEs = this.es/this.totalBeratAdonan()*50*220;
        return mEs;
    }

   
}
