/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.p2.pbo.quiz;
import java.text.DecimalFormat;

/**
 *
 * @author abdurrahman al ghifari
 * @npm 202043500111
 * @Tema Penggajian
 */

public class PboQuiz {
    public static void main(String[] args){
        
        Penggajian p = new Penggajian();
        
        System.out.println("------ Data Penggajian ------");
        System.out.println();
        System.out.println("NIK        : " + p.nik(111));
        System.out.println("Status     : " + p.status());
        System.out.println("Jabatan    : " + p.cekJabatan("Senior"));
        System.out.println("Nama       : " + p.nama("Abdurrahman"));
        // convert to decimal format
        DecimalFormat df = new DecimalFormat("##0,000");
        
        Double x = p.getGajiPokok("Senior");
        System.out.println("Gaji Pokok : " + df.format(x));
        
        Double y = p.getTransport("t3");
        System.out.println("Transport  : " + df.format(y));
        
        Double z = p.getBonus("Ya");
        System.out.println("Bonus      : " + df.format(z));        
        System.out.println("============");
        System.out.println("THP        : "+ df.format(x+y+z));
        
    }
}
