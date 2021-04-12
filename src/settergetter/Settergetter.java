/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settergetter;

/**
 *
 * @author MOKLET-2
 */
public class Settergetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat ojek baru
        setget baru = new setget();
        
         //pesan pembuka 
         System.out.println("<< Kalkulator Sederhana >>");
         
        //mengisi nilai dari variabel yang ada di class setget
        baru.setnilai1(60);
        baru.setnilai2(20);
        
        //menampilkan nilai dari angka pertama dan angka kedua di class setget
        System.out.println("Angka Pertama = "+ baru.getnilai1());
        System.out.println("Angka Kedua   = "+ baru.getnilai2());
        
        //melakukan operasi kalkulator
        int penjumlahan = baru.getnilai1() + baru.getnilai2();
        int pengurangan = baru.getnilai1() - baru.getnilai2();
        int perkalian   = baru.getnilai1() * baru.getnilai2();
        int pembagian   = baru.getnilai1() / baru.getnilai2();
        int modulus     = baru.getnilai1() % baru.getnilai2();
        
        //menampilkan hasil dari operasi kalkulator
        System.out.println("Hasil penjumlahan = "+penjumlahan);
        System.out.println("Hasil pengurangan = "+ pengurangan);
        System.out.println("Hasil perkalian   = "+ perkalian);
        System.out.println("Hasil pembagian   = "+ pembagian);
        System.out.println("Hasil modulus     = "+ modulus);
        
      
}
}
