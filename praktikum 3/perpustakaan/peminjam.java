import java.util.Scanner;
class peminjam {
	Scanner input = new Scanner(System.in);
    String nama, pekerjaan, alamat, nohp;
    byte usia;

    void isipinjam(){

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
                
	void tampilpeminjam(){

	System.out.println(" Nama Peminjam               : "+nama);
	System.out.println(" Pekerjaan                   : "+pekerjaan);
	System.out.println(" Usia                        : "+usia);
	System.out.println(" Alamat                      : "+alamat);
	System.out.println(" No Hp                       : "+nohp);

        }
	
        void meminjamBuku(){
		System.out.println("\n NB : Buku Telah Dipinjam,, Mohon Kembalikan Tepat Waktu !!! ^_^");
	}
}
