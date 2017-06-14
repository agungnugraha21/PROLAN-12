package PerpustakaanApp;
import java.util.Scanner;
public class Peminjam extends Buku {
    
//construkctor             
    Peminjam() {
         } 


    
        Scanner input = new Scanner(System.in);
		String nama, pekerjaan, alamat, nohp, contact;
		byte usia;

		//for encaptulation
		public int tglPinjam,tglKembali;
   
  

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
                                        System.out.println(" Selamat Datang Kembali");
                                        System.exit(0);
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

    	//encapsulation
    	public void setTglPinjam(){
    		this.tglPinjam = input.nextInt();
    	}
    	public int getTglKembali(){
    			tglKembali = tglPinjam + day;
    		return tglKembali;
    	}

    	//override
    	@Override
    	public void waktu()
    	{
    		

    		System.out.println("\n ------------------------------------------- ");
    		super.waktu();
    		super.telat();
    		super.hilang();
    		super.sanksi();
    		System.out.println(" Buku telah dipinjam selama "+ day + " hari");
    	}
}