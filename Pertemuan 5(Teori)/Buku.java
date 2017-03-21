import java.util.Scanner;
public class Buku {
        Scanner input1 = new Scanner(System.in);
		String kode, judul, penerbit, pengarang; 
        short terbit;

        boolean meminjam;

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

    	
	}    
