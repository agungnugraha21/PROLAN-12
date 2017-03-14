import java.util.Scanner;
public class konstruktor 
{
	
	public static void main (String[] args)
	{
		
		pinjam borrow = new pinjam();
		buku book = new buku();
		}
}
		
class pinjam 
{
	Scanner input = new Scanner(System.in);
	String nama, pekerjaan, alamat, nohp;
	byte usia;

		//konstruktor
		public pinjam()
		{
			System.out.println(" =====================================");
    		System.out.println("|         << Perpustakaan >>          |");    
   		 	System.out.println(" =====================================");
   		 	System.out.print(" Masukkan Nama Peminjam      : ");
    			nama = input.nextLine();
		    System.out.print(" Masukkan Pekerjaan Peminjam : ");
				pekerjaan = input.nextLine();
			System.out.print(" Masukkan Alamat Peminjam    : ");
				alamat = input.nextLine();
			System.out.print(" Masukkan No.HP Peminjam     : ");
				nohp = input.nextLine();
			System.out.print(" Masukkan Usia Peminjam      : ");
				usia = input.nextByte();
		}
}
class buku
{
	Scanner input1 = new Scanner(System.in);
	String kode, judul, penerbit, pengarang; 
    short terbit;
    	//konstruktor
    	public buku()
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
		    System.out.println(" ====================================");
    	}
}
