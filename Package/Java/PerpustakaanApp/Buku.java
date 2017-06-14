package PerpustakaanApp;
import java.util.Scanner;

public class Buku extends Pegawai {
    
    //constructor
    Buku(){
        
    }

        Scanner input1 = new Scanner(System.in);
		String kode, judul, penerbit, pengarang,makan; 
         public static int terbit,day;

        boolean meminjam,kons;

    	//konstruktor
    	public void buku()
    	{
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
    	}

    	//konstruktor
    	public void keterangan()
    	{
    		System.out.println("| Buku yang telah dipinjam harap dikembalikan tepat pada waktunya !");
    		System.out.println("| Terima Kasih ^_^ ");
    	}

        //for Override
    	public void waktu()
        {
            System.out.print(" Berapa lama anda akan meminjam buku :  ");
                day = input1.nextShort();
        }

        public void  telat()
        {
            System.out.println(" Jika anda telat mengembalikan buku maka ada sanksi bagi anda !");
        }

        public void hilang()
        {
            System.out.println(" Bila buku yang dipinjam ternyata hilang, maka peminjam wajib menggantinya ! ");
        }

        public void sanksi()
        {
            System.out.print(" Apakah anda siap menerima konsekuensinya ? ");
                kons = input1.nextBoolean();

            if(kons == true)
            {
                System.out.println(" Buku " + judul + " telah dipinjam ");
      
            }else
            {
                System.out.println(" Anda tidak diperkenankan untuk meminjam buku ");
                System.out.println(" Mohon perhatikan kembali peraturan yang tersedia ");
                System.exit(0);
            }
        }
        //end Override


    @Override
    protected void penjaga(){

        
        System.out.println("\n\n ------------------------------------------ ");
        System.out.println("|    Pegawai Perpustakaan ");
            ipt = input1.nextLine();
        System.out.print("| Nama    : " );
            nama = input1.nextLine();
        System.out.print("| NIP     : " );
            nip = input1.nextLine();
        System.out.print("| Hari    : " );
            hariKerja1 = input1.nextLine();
        System.out.print("| Hingga  : " );
            hariKerja2 = input1.nextLine();
            
    }

    @Override
    protected void buka(){
        

        System.out.println(" ------------------------------------------ ");
        System.out.println("|      Jam kerja "+hariKerja1+" samapai "+hariKerja2+"        |");
        System.out.println("|          Buka dari pukul 09.00           |");
        System.out.println("|            Tutup pukul 16.00             |");
        
    }

    @Override
    protected void libur(){
        System.out.println(" ------------------------------------------ ");
        System.out.println("| Setiap Hari Sabtu dan Minggu Perpustakaan |");
        System.out.println("|                   TUTUP                   |");
        System.out.println(" ------------------------------------------ ");

    }

    @Override
    public void dendaHari() {
        System.out.println(" Telat pengembalian sebelum kurang dari 3 hari : Rp. 2.000 ");
    }

    @Override
    public void dendaMinggu() {
        System.out.println(" Telat pengembalian sebelum seminggu : Rp. 5.000 ");
    }

    @Override
    public void dendaBulan() {
        System.out.println(" Telat pengembalian sebelum sebulan : Rp. 10.000 ");
    }

    @Override
    public void dendaDefault() {
        System.out.println(" Telat pengembalian > 30 hari : seharga buku yang dipinjam ");
    }

	}