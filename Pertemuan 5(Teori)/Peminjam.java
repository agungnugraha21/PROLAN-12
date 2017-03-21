import java.util.Scanner;

public class Peminjam extends Buku 
{
    
        Scanner input = new Scanner(System.in);
		String nama, pekerjaan, alamat, nohp, contact;
		byte usia;

		//konstruktor
		public void pinjam()
		{
			
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

		public void jadi()
		{
				System.out.print(" Apakah Anda Ingin Meminjam Buku Ini ? ");
					//super pada atribut
					super.meminjam = input1.nextBoolean();

				if(meminjam == true)
				{
					
						System.out.println("\n| Peminjam dengan nama "+ nama +" telah meminjam buku "+ judul);
						//super pada method
						super.keterangan();
				
				}else
				{
					System.out.println(" Anda Tidak Jadi Meminjam Buku "+ judul);
				}	
		}

		Peminjam(String contact)
    	{
    		this.contact = contact;
    	}

    	public void kontak()
    	{
    		System.out.println(" ");
    		System.out.println("  CV. ABADI PERPUS || " +contact);
    	}

}