
package PerpustakaanApp;
import java.util.Scanner;
public class PengembalianBuku {
    private char late;
    Peminjam pinjam = new Peminjam();
    static int balik,P;
    Buku book = new Buku();
    Scanner input = new Scanner(System.in);
    
    public void pengembalian(){
        
        System.out.println(" << PENGEMBALIAN BUKU >>");
        pinjam.pinjam();
        book.buku();
        System.out.println(" ============================");
        System.out.println(" Buku telah dipinjam dari tanggal : " + Peminjam.tglPinjam);
        System.out.println(" Selama "+Buku.day+" Hari");
        System.out.println(" Buku yang dipinjam seharusnya dikembalikan tanggal : " + Peminjam.tglKembali);
        System.out.print(" Apakah peminjam telat dalam pengembalian buku ? [Y/T] : ");
            late = input.next().charAt(0);
            if(late == 'Y' || late == 'y'){
                System.out.print(" Tanggal Hari ini : ");
                    balik = input.nextInt();
                     P = balik - Peminjam.tglKembali;
                System.out.println(" Telat Pengembalian Buku Selama "+ P);
                System.out.println(" Sanksi yang dikenakan sesuai peraturan ");
                book.dendaHari();
                book.dendaMinggu();
                book.dendaBulan();
                book.dendaDefault();
            }else{
                System.out.println(" Terima Kasih Telah Mengembalikan Tepat Pada Waktunya");
            }
    }
}