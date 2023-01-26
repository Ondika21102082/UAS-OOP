package penjualan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author NIM 21102082 NAMA SILVESTER ONDIKA MAMPUR
 */
public class Penjualan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inisialisasi objek untuk masing-masing kelas
         Scanner input = new Scanner(System.in);
         DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
         DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
         //Deklarasi variabel
         int jum=0, i=0;
         double total_bayar=0;
         //Deklarasi array
         int [] kode = new int[6];
         int [] qty = new int[6];
         int [] harga = new int[6];
         double [] sub_total = new double[6];
         double [] diskon= new double [6];
         String [] barang = new String[6];
         
         System.out.println("PROGRAM JAVA TENTANG PENJUALAN BARANG");
         
         System.out.print("Masukan Jumlah Beli : ");
         jum=input.nextInt();
         System.out.println(" ");
         //Memasukan elemen didalam array
         for (i=0; i<jum;i++){
              System.out.print("Masukan Kode Barang Ke-"+(i+1)+" : ");
              kode[i]=input.nextInt();
              System.out.print("Masukan Qty Ke-"+(i+1)+" : ");
              qty[i]=input.nextInt();
              //Menentukan barang berdasarkan kode yang dimmasukan
              switch (kode[i]){
                  case 1 : 
                            barang[i]="Laptop Asus ROG  ";
                            harga[i]=10299000;
                            diskon[i]=0.1;
                            break;
                  case 2 : 
                            barang[i]="TV LED 32 Inch  ";
                            harga[i]=2000000;
                            diskon[i]=0.05;
                            break;
                  case 3 : 
                            barang[i]="Power Bank 10.000 mAh";
                            harga[i]=300000;
                            diskon[i]=0.2;
                            break;
                  case 4 : 
                            barang[i]="Tripod Kamera";
                            harga[i]=150000;
                            diskon[i]=0.05;
                            break;
                  case 5 : 
                            barang[i]="AirPods Pro";
                            harga[i]=600000;
                            diskon[i]=0.1;
                            break;
                  case 6 : 
                            barang[i]="Smart Watch Xiomi";
                            harga[i]=700000;
                            diskon[i]=0.5;
                            break;
                  default : 
                            System.out.println("Kode Barang Tidak Tersedia");
              }
         }
          //Pengaturan format number
          formatRp.setCurrencySymbol("Rp. ");
          formatRp.setMonetaryDecimalSeparator(',');
          formatRp.setGroupingSeparator('.');
          kursIndonesia.setDecimalFormatSymbols(formatRp);
          
          System.out.println(" ");
          System.out.println("No   Nama Barang             Harga            QTY  Diskon   Sub Total");  
          //Menampilkan seluruh elemen di dalam array
          for (i=0; i<jum;i++){ 
             sub_total[i]=((qty[i]*harga[i])-(qty[i]*harga[i]*diskon[i]));
             total_bayar+=sub_total[i];
              System.out.println(i+1+"    "+barang[i]+"   "+kursIndonesia.format(harga[i])+"    "+qty[i]+"     "+(int)(diskon[i]*100)+"%"+"     "+kursIndonesia.format(sub_total[i])); 
          }
          System.out.println(" ");
          //Menampilkan total bayar
          System.out.println("Total Bayar : "+kursIndonesia.format(total_bayar));
    }
    }
    

