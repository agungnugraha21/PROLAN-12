import java.util.Scanner;
class buku {
   Scanner input1 = new Scanner(System.in);
   String kode, judul, penerbit, pengarang; 
   short terbit;
   
    
    void isibuku(){
    System.out.print(" Masukkan Kode Buku          : ");
        kode = input1.nextLine();
    System.out.print(" Masukkan Judul Buku         : ");
        judul = input1.nextLine();
    System.out.print(" Masukkan Penerbit           : ");
        penerbit = input1.nextLine();
    System.out.print(" Masukkan Nama Pengarang     : ");
        pengarang = input1.nextLine();
    System.out.print(" Masukkan Tahun Terbit       : ");
        terbit = input1.nextShort();
    System.out.println(" ====================================");
    }

    void tampilbuku(){

    System.out.println(" Kode Buku                   : "+kode);
    System.out.println(" Judul Buku                  : "+judul);
    System.out.println(" Penerbit                    : "+penerbit);
    System.out.println(" Pengarang                   : "+pengarang);
    System.out.println(" Tahun                       : "+terbit);
    System.out.println(" ====================================");
    }
}
