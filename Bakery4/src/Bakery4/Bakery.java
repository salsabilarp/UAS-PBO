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
public class Bakery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======= PROGRAM HITUNG HARGA PENJUALAN ROTI PAK RAY =======");
     
        
        //ROTI MANIS//
        System.out.println("======================= ROTI MANIS ========================");
        System.out.println("===========================================================");
        
        
        AdonanRotiManis rmv1 = new AdonanRotiManis();
        rmv1.tampilRincianAdonan();
        
        System.out.println("=================== ROTI MANIS VARIAN 1 ===================");
        rmv1.keju = 5;
        rmv1.coklat = 10;
        rmv1.mkeju = rmv1.keju * 50;
        rmv1.mcoklat = rmv1.coklat * 50;
        
        rmv1.tampilRincianFillTop();
        
        System.out.println("=================== ROTI MANIS VARIAN 2 ===================");
        AdonanRotiManis rmv2 = new AdonanRotiManis();
        rmv2.selai = 10;
        rmv2.krim = 5;
        rmv2.mselai = rmv2.selai * 100;
        rmv2.mkrim = rmv2.krim * 100;
        
        rmv2.tampilRincianFillTop();
        
        System.out.println("=================== ROTI MANIS VARIAN 3 ===================");
        AdonanRotiManis rmv3 = new AdonanRotiManis();
        rmv3.keju = 10;
        rmv3.sosis = 10;
        rmv3.mkeju = rmv3.keju * 70;
        rmv3.msosis = rmv3.sosis * 70;
        rmv3.tampilRincianFillTop();
        
        
        //ROTI TAWAR//
        System.out.println("======================== ROTI TAWAR =======================");
        System.out.println("===========================================================");
        
        AdonanRotiTawar rtv1 = new AdonanRotiTawar();
        rtv1.tampilRincianAdonan();
        
        System.out.println("=================== ROTI TAWAR VARIAN 1 ===================");
        rtv1.coklat = 80;
        rtv1.mcoklat = rtv1.coklat * 20;
        rtv1.tampilRincianFillTop();
        
        System.out.println("=================== ROTI TAWAR VARIAN 2 ===================");
        AdonanRotiTawar rtv2 = new AdonanRotiTawar();
        rtv2.keju = 80;
        rtv2.mkeju = rtv2.keju * 15;
        rtv2.tampilRincianFillTop();
        
        
        //PIZZA//
        System.out.println("========================== PIZZA ==========================");
        System.out.println("===========================================================");
        
        AdonanPizza pv1 = new AdonanPizza();
        pv1.tampilRincianAdonan();
        pv1.keju = 30;
        pv1.sosis = 50;
        pv1.beef = 50;
        pv1.bombay = 30;
        pv1.mkeju = pv1.keju * 10;
        pv1.msosis = pv1.sosis * 10;
        pv1.mbeef = pv1.beef * 10;
        pv1.mbombay = pv1.bombay * 10;
        pv1.tampilRincianFillTop();
        
        
        System.out.println("================= RINCIAN PESANAN =================");
        System.out.println("- Roti Manis (varian 1)     : 50    pcs\n" +
                           "- Roti Manis (varian 2)     : 100   pcs\n" +
                           "- Roti Manis (varian 3)     : 70    pcs\n" +
                           "---------------------------------------- +");
        System.out.println("Total Pesanan RM            : 220   pcs\n" + " ");
        
        System.out.println("- Roti Tawar (varian 1)     : 20    pcs\n" +
                           "- Roti Tawar (varian 2)     : 15    pcs\n" +
                           "---------------------------------------- +");
        System.out.println("Total Pesanan RT            : 35    pcs\n" + " ");
        
        System.out.println("- Pizza (varian 1)          : 10    pcs\n" + " ");
        
                           
        
        System.out.println("==== BERAT BAHAN YANG DIPERLULAN UNTUK MEMBUAT ROTI MANIS ====");
        
        //BERAT BAHAN YANG DIPERLUKAN UNTUK MEMBUAT ROTI MANIS//
        AdonanRotiManis beratPerBahan = new AdonanRotiManis();
        beratPerBahan.mterigu = beratPerBahan.totalBeratTerigu();
        beratPerBahan.mgula = beratPerBahan.totalBeratGula();
        beratPerBahan.mbutter = beratPerBahan.totalBeratButter();
        beratPerBahan.mragi = beratPerBahan.totalBeratRagi();
        beratPerBahan.msuca = beratPerBahan.totalBeratSuca();
        beratPerBahan.msubu = beratPerBahan.totalBeratSubu();
        beratPerBahan.mtelur = beratPerBahan.totalBeratTelur();
        beratPerBahan.mes = beratPerBahan.totalBeratEs();
        
        System.out.println("Terigu      : " + String.format("% .0f", beratPerBahan.mterigu) + " gr");
        System.out.println("Gula        : " + String.format("% .0f", beratPerBahan.mgula) + " gr");
        System.out.println("Butter      : " + String.format("% .0f", beratPerBahan.mbutter) + " gr");
        System.out.println("Ragi        : " + String.format("% .0f", beratPerBahan.mragi) + " gr");
        System.out.println("Susu Bubuk  : " + String.format("% .0f", beratPerBahan.msubu) + " gr");
        System.out.println("Susu Cair   : " + String.format("% .0f", beratPerBahan.msuca) + " gr");
        System.out.println("Telur       : " + String.format("% .0f", beratPerBahan.mtelur) + " gr");
        System.out.println("Es Batu     : " + String.format("% .0f", beratPerBahan.mes) + " gr");
        
        System.out.println(" ");
        System.out.println("==== BERAT BAHAN YANG DIPERLULAN UNTUK MEMBUAT ROTI TAWAR ====");
        
        //BERAT BAHAN YANG DIPERLUKAN UNTUK MEMBUAT ROTI TAWAR//
        AdonanRotiTawar beratPerBahan2 = new AdonanRotiTawar();
        beratPerBahan2.mterigu = beratPerBahan2.totalBeratTerigu();
        beratPerBahan2.mgula = beratPerBahan2.totalBeratGula();
        beratPerBahan2.mbutter = beratPerBahan2.totalBeratButter();
        beratPerBahan2.mragi = beratPerBahan2.totalBeratRagi();
        beratPerBahan2.msuca = beratPerBahan2.totalBeratSuca();
        beratPerBahan2.msubu = beratPerBahan2.totalBeratSubu();
        beratPerBahan2.mtelur = beratPerBahan2.totalBeratTelur();
        beratPerBahan2.mes = beratPerBahan2.totalBeratEs();
        
        System.out.println("Terigu      : " + String.format("% .0f", beratPerBahan2.mterigu) + " gr");
        System.out.println("Gula        : " + String.format("% .0f", beratPerBahan2.mgula) + " gr");
        System.out.println("Butter      : " + String.format("% .0f", beratPerBahan2.mbutter) + " gr");
        System.out.println("Ragi        : " + String.format("% .0f", beratPerBahan2.mragi) + " gr");
        System.out.println("Susu Bubuk  : " + String.format("% .0f", beratPerBahan2.msubu) + " gr");
        System.out.println("Susu Cair   : " + String.format("% .0f", beratPerBahan2.msuca) + " gr");
        System.out.println("Telur       : " + String.format("% .0f", beratPerBahan2.mtelur) + " gr");
        System.out.println("Es Batu     : " + String.format("% .0f", beratPerBahan2.mes) + " gr");
        
        System.out.println(" ");
        System.out.println("==== BERAT BAHAN YANG DIPERLULAN UNTUK MEMBUAT PIZZA ====");
        
        //BERAT BAHAN YANG DIPERLUKAN UNTUK MEMBUAT PIZZA//
        AdonanPizza beratPerBahan3 = new AdonanPizza();
        beratPerBahan3.mterigu = beratPerBahan3.totalBeratTerigu();
        beratPerBahan3.mgula = beratPerBahan3.totalBeratGula();
        beratPerBahan3.mbutter = beratPerBahan3.totalBeratButter();
        beratPerBahan3.mragi = beratPerBahan3.totalBeratRagi();
        beratPerBahan3.msuca = beratPerBahan3.totalBeratSuca();
        beratPerBahan3.msubu = beratPerBahan3.totalBeratSubu();
        beratPerBahan3.mtelur = beratPerBahan3.totalBeratTelur();
        beratPerBahan3.mes = beratPerBahan3.totalBeratEs();
        
        System.out.println("Terigu      : " + String.format("% .0f", beratPerBahan3.mterigu) + " gr");
        System.out.println("Gula        : " + String.format("% .0f", beratPerBahan3.mgula) + " gr");
        System.out.println("Butter      : " + String.format("% .0f", beratPerBahan3.mbutter) + " gr");
        System.out.println("Ragi        : " + String.format("% .0f", beratPerBahan3.mragi) + " gr");
        System.out.println("Susu Bubuk  : " + String.format("% .0f", beratPerBahan3.msubu) + " gr");
        System.out.println("Susu Cair   : " + String.format("% .0f", beratPerBahan3.msuca) + " gr");
        System.out.println("Telur       : " + String.format("% .0f", beratPerBahan3.mtelur) + " gr");
        System.out.println("Es Batu     : " + String.format("% .0f", beratPerBahan3.mes) + " gr");
        
        System.out.println(" ");
        System.out.println("==== TOTAL BERAT BAHAN YANG DIPERLUKAN UNTUK MEMBUAT PESANAN ====");
        
        System.out.println("Terigu      : " + String.format("% .0f", beratPerBahan3.mterigu + beratPerBahan2.mterigu + beratPerBahan.mterigu) + " gr");
        System.out.println("Gula        : " + String.format("% .0f", beratPerBahan3.mgula + beratPerBahan2.mgula + beratPerBahan.mgula) + " gr");
        System.out.println("Butter      : " + String.format("% .0f", beratPerBahan3.mbutter + beratPerBahan2.mbutter + beratPerBahan.mbutter) + " gr");
        System.out.println("Ragi        : " + String.format("% .0f", beratPerBahan3.mragi + beratPerBahan2.mragi + beratPerBahan.mragi) + " gr");
        System.out.println("Susu Bubuk  : " + String.format("% .0f", beratPerBahan3.msubu + beratPerBahan2.msubu + beratPerBahan.msubu) + " gr");
        System.out.println("Susu Cair   : " + String.format("% .0f", beratPerBahan3.msuca + beratPerBahan2.msuca + beratPerBahan.msuca) + " gr");
        System.out.println("Telur       : " + String.format("% .0f", beratPerBahan3.mtelur + beratPerBahan2.mtelur + beratPerBahan.mtelur) + " gr");
        System.out.println("Es Batu     : " + String.format("% .0f", beratPerBahan3.mes + beratPerBahan2.mes + beratPerBahan.mes) + " gr");
        
        System.out.println(" ");
        System.out.println("==== BERAT FILLTOP YANG DIPERLUKAN UNTUK MEMBUAT ROTI MANIS ====");
        System.out.println("VARIAN 1");
        System.out.println("Keju      : " + String.format("% .0f", rmv1.mkeju) + " gr");
        System.out.println("Coklat    : " + String.format("% .0f", rmv1.mcoklat) + " gr\n" + " ");
        
        System.out.println("VARIAN 2");
        System.out.println("Selai     : " + String.format("% .0f", rmv2.mselai) + " gr");
        System.out.println("Krim      : " + String.format("% .0f", rmv2.mkrim) + " gr\n" + " ");
        
        System.out.println("VARIAN 3");
        System.out.println("Keju      : " + String.format("% .0f", rmv3.mkeju) + " gr");
        System.out.println("Sosis     : " + String.format("% .0f", rmv3.msosis) + " gr\n" + " ");
        
        System.out.println(" ");
        System.out.println("==== BERAT FILLTOP YANG DIPERLUKAN UNTUK MEMBUAT ROTI TAWAR ====");
        System.out.println("VARIAN 1");
        System.out.println("Coklat    : " + String.format("% .0f", rtv1.mcoklat) + " gr\n" + " ");
        
        System.out.println("VARIAN 2");
        System.out.println("Keju      : " + String.format("% .0f", rtv2.mkeju) + " gr");
        
        System.out.println(" ");
        System.out.println("====== BERAT FILLTOP YANG DIPERLUKAN UNTUK MEMBUAT PIZZA ======");
        System.out.println("VARIAN 1");
        System.out.println("Keju      : " + String.format("% .0f", pv1.mkeju) + " gr");
        System.out.println("Sosis     : " + String.format("% .0f", pv1.msosis) + " gr");
        System.out.println("Beef      : " + String.format("% .0f", pv1.mbeef) + " gr");
        System.out.println("Bombay    : " + String.format("% .0f", pv1.mbombay) + " gr");
        
        System.out.println(" \n" + " ");
        System.out.println("==== TOTAL BERAT FILLTOP YANG DIPERLUKAN UNTUK MEMBUAT PESANAN ====");
        System.out.println("Keju      : " + String.format("% .0f", rmv1.mkeju + rmv3.mkeju + rtv2.mkeju + pv1.mkeju) + " gr");
        System.out.println("Coklat    : " + String.format("% .0f", rmv1.mcoklat + rtv1.mcoklat) + " gr");
        System.out.println("Krim      : " + String.format("% .0f", rmv2.mkrim) + " gr");
        System.out.println("Selai     : " + String.format("% .0f", rmv2.mselai) + " gr");
        System.out.println("Sosis     : " + String.format("% .0f", rmv3.msosis + pv1.msosis) + " gr");
        System.out.println("Beef      : " + String.format("% .0f", pv1.mbeef) + " gr");
        System.out.println("Bombay    : " + String.format("% .0f", pv1.mbombay) + " gr");
        
        System.out.println("===========================================================");
        
        
          
    }
    
}
