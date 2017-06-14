package PerpustakaanApp;
import java.util.Scanner;
public class PengembalianBuku {
    private boolean late;
    Peminjam pinjam = new Peminjam();
    Buku book = new Buku();
    Scanner input = new Scanner(System.in);
    
    public void pengembalian(){
        
        System.out.println(" << PENGEMBALIAN BUKU >>");
        pinjam.pinjam();
        book.buku();
        System.out.println(" ============================");
        System.out.println(" Buku telah dipinjam dari tanggal "+pinjam.tglPinjam);
        System.out.println(" Selama "+Buku.day+" Hari");
        System.out.println(" Buku yang dipinjam seharusnya dikembalikan tanggal "+pinjam.tglKembali);
        System.out.print(" Apakah peminjam telat dalam pengembalian buku ?");
            late = input.nextBoolean();
            if(late == true){
                System.out.println(" Telat Pengembalian Buku Selama "+KembaliBuku.pengembalianBuku);
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