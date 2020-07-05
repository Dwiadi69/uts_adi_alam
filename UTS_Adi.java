/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author N
 */
public class UTS_Adi {
   public static void main(String[] args) throws IOException {
        System.out.println("Selamat datang di Pertanian adi garden ");
        System.out.println("jenis-jenis Bibit Buah, Bunga, Syuran");
        System.out.println("jual : Bibit Buah"
                       + "\n       Bibit Bunga"
                       + "\n       Bibit Sayur");
        Scanner scan = new Scanner(System.in);
        System.out.println("pilih Bibit yang akan di tanam ? ");
        int M3nu ;
        String menu = scan.nextLine();
       
        
        InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
        
       int Bibitbuah, 
           BibitBunga, 
           BibitSayur;
       
        if ("Bibit Buah".equals(menu)){
         
        System.out.println("Jenis-jenis Bibit Buah   \n 1. Bibit Anggur"
                                                     + "\n 2. Bibit Apel"
                                                     + "\n 3. Bibit Belimbing"
                                                     + "\n 4. Bibit Rambutan"
                                                     + "\n 5. Bibit Buah Naga");
        System.out.println("pilih Bibit buah yang akan anda ingin tanam ? ");

        int user = 0;
          user = Integer.parseInt(br.readLine());  
            switch (user){
                case 1:
                    System.out.println("Bibit Buah Anggur - Harga 33.000");
                 boolean BibitBuah = true;
        int pesanan1 = 0;
        String pesan1;
         
        
        //Input
        while( BibitBuah ){
            System.out.println("apakah anda inggin memilih Bibit Buah Anggur lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan1 = scan.nextLine();
            
            if( pesan1.equalsIgnoreCase("Tidak") ){
                BibitBuah = false;
            }
        //Output
            pesanan1++;
        }
        System.out.println("Anda telah memesan "+ pesanan1 +"  Bibit Buah Anggur");
        System.out.println("Selamat Menanam"+"\n~Terima Kasih~");
    
    break;
              case 2:
                  System.out.println("Bibit Buah Apel - Harga 30.000");
                   boolean BibitBuah1 = true;
        int pesanan2 = 0;
        String pesan2;
         
        // Imput
        while(BibitBuah1){
            System.out.println("apakah anda ingin memilih Bibit Buah Apel lagi ?");
            System.out.println("Ya atau Tidak");
            
            pesan2 = scan.nextLine();
            
            if(pesan2.equalsIgnoreCase("Tidak") ){    
                BibitBuah1 = false;
            }    
        //Output        
          pesanan2++;      
        }        
         System.out.println("Anda telah memesan "+ pesanan2 +"  Bibit Buah Apel");
         System.out.println("Selamat Menanam"+"\n~Terima Kasih~");
    
    break;
              case 3:
                  System.out.println("Bibit Buah Belimbing - Harga 27.000");
                   boolean BibitBuah3 = true;
        int pesanan3 = 0;
        String pesan3;
         
        // Imput
        while(BibitBuah3){
            System.out.println("apakah anda ingin memilih Bibit Buah Belimbing lagi ?");
            System.out.println("Ya atau Tidak");
            
            pesan3 = scan.nextLine();
            
            if(pesan3.equalsIgnoreCase("Tidak") ){    
                BibitBuah3 = false;
            }    
        //Output        
          pesanan3++;      
        }        
         System.out.println("Anda telah memesan "+ pesanan3 +"  Bibit Buah Belimbing");
         System.out.println("Selamat Menanam"+"\n~Terima Kasih~");
    
    
    break;
              case 4:
                  System.out.println("Bibit Buah Rambutan - Harga 24.000");
                   boolean BibitBuah4 = true;
        int pesanan4 = 0;
        String pesan4;
         
        // Imput
        while(BibitBuah4){
            System.out.println("apakah anda ingin memilih Bibit Buah Rambutan lagi ?");
            System.out.println("Ya atau Tidak");
            
            pesan4 = scan.nextLine();
            
            if(pesan4.equalsIgnoreCase("Tidak") ){    
                BibitBuah4 = false;
            }    
        //Output        
          pesanan4++;      
        }        
         System.out.println("Anda telah memesan "+ pesanan4 +"  Bibit Buah Rambutan");
         System.out.println("Selamat Menanam"+"\n~Terima Kasih~");
         
         break;
             case 5:
                  System.out.println("Bibit Buah Naga - Harga 40.000");
                   boolean BibitBuah5 = true;
        int pesanan5 = 0;
        String pesan5;
         
        // Imput
        while(BibitBuah5){
            System.out.println("apakah anda ingin memilih Bibit Buah Naga lagi ?");
            System.out.println("Ya atau Tidak");
            
            pesan5 = scan.nextLine();
            
            if(pesan5.equalsIgnoreCase("Tidak") ){    
                BibitBuah5 = false;
            }    
        //Output        
          pesanan5++;      
        }        
         System.out.println("Anda telah memesan "+ pesanan5 +"  Bibit Buah Naga");
         System.out.println("Selamat Menanam"+"\n~Terima Kasih~");
       
        }
            
        } if ("Bibit Bunga".equals(menu)){
                     
        System.out.println("Jenis-jenis Bibit Bunga   \n 1. Bibit Bunga Wisteria"
                                                     + "\n 2. Bibit Bunga Kosmos Cokelat"
                                                     + "\n 3. Bibit Bunga Gardenia"
                                                     + "\n 4. Bibit Bunga Melati"
                                                     + "\n 5. Bibit Bunga Kamboja");
        System.out.println("pilih Bibit Bunga yang akan Anda ingin tananm ? ");
        int user = 0;
          user = Integer.parseInt(br.readLine());  
            switch (user){
                case 1:
                    System.out.println("Bibit Bunga Wisteria - Harga 35.000 ");
                     boolean BibitBunga1 = true;
        int pesanan1 = 0;
        String pesan1;
        //Input
        while( BibitBunga1 ){
            System.out.println("apakah anda inggin memilih Bibit Bunga Wisteria lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan1 = scan.nextLine();
            
            if( pesan1.equalsIgnoreCase("Tidak") ){
                BibitBunga1 = false;
            }
        //Output
            pesanan1++;
        }
        System.out.println("Anda telah memesan "+ pesanan1 +"  Bibit Bunga Wisterria");
        System.out.println("Selamat Menanam"+"\n~Terima Kasih~");
        
        break;
            case 2:
                    System.out.println("Bibit Bunga Kosmos Cokelat - Harga 38.000 ");
                     boolean BibitBunga2 = true;
        int pesanan2 = 0;
        String pesan2;
        //Input
        while( BibitBunga2 ){
            System.out.println("apakah anda inggin memilih Bibit Bunga Kosmos Cokelat lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan1 = scan.nextLine();
            
            if( pesan1.equalsIgnoreCase("Tidak") ){
                BibitBunga2 = false;
            }
        //Output
            pesanan2++;
        }
        System.out.println("Anda telah memesan "+ pesanan2 +"  Bibit Bunga Kosmos Cokelat");
        System.out.println("Selamat Menanam"+"\n~Terima Kasih~");
         
        break;
        case 3:
                    System.out.println("Bibit Bunga Gerdenia - Harga 40.000 ");
                     boolean BibitBunga3 = true;
        int pesanan3 = 0;
        String pesan3;
        //Input
        while( BibitBunga3 ){
            System.out.println("apakah anda inggin memilih Bibit Bunga Gerdenia lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan1 = scan.nextLine();
            
            if( pesan1.equalsIgnoreCase("Tidak") ){
                BibitBunga3 = false;
            }
        //Output
            pesanan3++;
        }
        System.out.println("Anda telah memesan "+ pesanan3 +"  Bibit Bunga Gerdenia");
        System.out.println("Selamat Menanam"+"\n~Terima Kasih~");

        break;
        case 4:
                    System.out.println("Bibit Bunga Melati - Harga 20.000 ");
                     boolean BibitBunga4 = true;
        int pesanan4 = 0;
        String pesan4;
        //Input
        while( BibitBunga4 ){
            System.out.println("apakah anda inggin memilih Bibit Bunga Melati lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan4 = scan.nextLine();
            
            if( pesan4.equalsIgnoreCase("Tidak") ){
                BibitBunga4 = false;
            }
        //Output
            pesanan4++;
        }
        System.out.println("Anda telah memesan "+ pesanan4 +"  Bibit Bunga Melati");
        System.out.println("Selamat Menanam"+"\n~Terima Kasih~");

        break;
        case 5:
                    System.out.println("Bibit Bunga Wisteria - Harga 35.000 ");
                     boolean BibitBunga5 = true;
        int pesanan5 = 0;
        String pesan5;
        //Input
        while( BibitBunga5 ){
            System.out.println("apakah anda inggin memilih Bibit Bunga Wisteria lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan5 = scan.nextLine();
            
            if( pesan5.equalsIgnoreCase("Tidak") ){
                BibitBunga5 = false;
            }
        //Output
            pesanan5++;
        }
        System.out.println("Anda telah memesan "+ pesanan5 +"  Bibit Bunga Wisterria");
        System.out.println("Selamat Menanam"+"\n~Terima Kasih~");

            }
        
        } if ("Bibit Sayur".equals(menu)){
                     
        System.out.println("Jenis-jenis Bibit Bunga   \n 1. Bibit Kangkung"
                                                     + "\n 2. Bibit Wortel"
                                                     + "\n 3. Bibit mentimun"
                                                     + "\n 4. Bibit Selada"
                                                     + "\n 5. Bibit Bayam");
        System.out.println("pilih Bibit Bunga yang akan Anda ingin tananm ? ");
        int user = 0;
          user = Integer.parseInt(br.readLine());  
            switch (user){
            case 1:
                    System.out.println("Bibit Kangkung - Harga 17.000 ");
                     boolean BibitSayur1 = true;
        int pesanan1 = 0;
        String pesan1;
        //Input
        while( BibitSayur1 ){
            System.out.println("apakah anda inggin memilih Bibit Kangkung lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan1 = scan.nextLine();
            
            if( pesan1.equalsIgnoreCase("Tidak") ){
                BibitSayur1 = false;
            }
        //Output
            pesanan1++;
        }
        System.out.println("Anda telah memesan "+ pesanan1 +"  Bibit Kangkung");
        System.out.println("Selamat Menanam"+"\n~Terima Kasih~");
            
            break;
            case 2:
                    System.out.println("Bibit Wortel - Harga 23.000 ");
                     boolean BibitSayur2 = true;
        int pesanan2 = 0;
        String pesan2;
        //Input
        while( BibitSayur2 ){
            System.out.println("apakah anda inggin memilih Bibit Wortel lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan2 = scan.nextLine();
            
            if( pesan2.equalsIgnoreCase("Tidak") ){
                BibitSayur2 = false;
            }
        //Output
            pesanan2++;
        }
        System.out.println("Anda telah memesan "+ pesanan2 +"  Bibit Wortel");
        System.out.println("Selamat Menanam"+"\n~Terima Kasih~");
        
        break;
         case 3:
                    System.out.println("Bibit mentimun - Harga 20.000 ");
                     boolean BibitSayur3 = true;
        int pesanan3 = 0;
        String pesan3;
        //Input
        while( BibitSayur3 ){
            System.out.println("apakah anda inggin memilih Bibit metimun lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan3 = scan.nextLine();
            
            if( pesan3.equalsIgnoreCase("Tidak") ){
                BibitSayur3 = false;
            }
        //Output
            pesanan3++;
        }
        System.out.println("Anda telah memesan "+ pesanan3 +"  Bibit mentimun");
        System.out.println("Selamat Menanam"+"\n~Terima Kasih~");
            
        break;
         case 4:
                    System.out.println("Bibit Selada - Harga 25.000 ");
                     boolean BibitSayur4 = true;
        int pesanan4 = 0;
        String pesan4;
        //Input
        while( BibitSayur4 ){
            System.out.println("apakah anda inggin memilih Bibit Selada lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan4 = scan.nextLine();
            
            if( pesan4.equalsIgnoreCase("Tidak") ){
                BibitSayur4 = false;
            }
        //Output
            pesanan4++;
        }
        System.out.println("Anda telah memesan "+ pesanan4 +"  Bibit Selada");
        System.out.println("Selamat Menanam"+"\n~Terima Kasih~");
            
        break;
         case 5:
                    System.out.println("Bibit Bayam - Harga 24.000 ");
                     boolean BibitSayur5 = true;
        int pesanan5 = 0;
        String pesan5;
        //Input
        while( BibitSayur5 ){
            System.out.println("apakah anda inggin memilih Bibit Bayam lagi ?");
            System.out.println(" Ya atau Tidak ");
            
            pesan5 = scan.nextLine();
            
            if( pesan5.equalsIgnoreCase("Tidak") ){
                BibitSayur5 = false;
            }
        //Output
            pesanan5++;
        }
        System.out.println("Anda telah memesan "+ pesanan5 +"  Bibit Bayam");
        System.out.println("Selamat Menanam"+"\n~Terima Kasih~");
       }
      }
   } 
}