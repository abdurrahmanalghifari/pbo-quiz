/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.p2.pbo.quiz;

/**
 *
 * @author abdurrahman al ghifari
 * @npm 202043500111
 * @Tema Penggajian
 */
public class Penggajian {
    int    nik;
    String nama, 
           jabatan,
           status;
    double pokok, 
           transport,
           bonus;
    
    
    public void jabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    //non-void
    String cekJabatan(String J){
        return J;
    }

    String nama(String nm){
        return nm;
    }
    
    String status (){
        return "Aktif";
    }
    
    int nik(int nik){
        return nik;
    }

    //void
    double getGajiPokok(String jabatan){
        if(jabatan.equalsIgnoreCase("Senior") ){
            pokok = 300000;
        }else if(jabatan.equalsIgnoreCase("Middle") ){
            pokok = 200000;
        }else if(jabatan.equalsIgnoreCase("Junior") ){
            pokok = 150000;
        }else{
            pokok = 100000;
        }
        return pokok;
    }
    
    double getTransport(String jabatan){
        if(jabatan.equalsIgnoreCase("t3") ){
            transport = 35000;
        }else if(jabatan.equalsIgnoreCase("t2") ){
            transport = 25000;
        }else if(jabatan.equalsIgnoreCase("t1") ){
            transport = 15000;
        }else{
            transport = 10000;
        }
        return transport;
    }
    
    double getBonus(String jabatan){
        if(jabatan.equalsIgnoreCase("Ya")){
            bonus = 30000;
        }
        else{
            bonus = 10000;
        }
        return bonus;
    }
    
    

    

    


    
//    
//    String jabatan(String j){
//        return j;
//    }
//    
//    void cetak(){
//        DecimalFormat df = new DecimalFormat("##0,000");
//        
//        System.out.println("------ Detil Karyawan ------");
//        System.out.println("No: "+ this.nik);
//        System.out.println("Nama: "+ this.nama);
//        System.out.println("Bagian: "+ this.jabatan);
//        System.out.println("Gaji Pokok: "+ df.format(getGajiPokok()));
//    }
}
 