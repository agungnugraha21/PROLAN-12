class Perpustakaan extends Peminjam 
{

	public Perpustakaan(String contact)
	{
		//super pada konstruktor
		super(contact);
	}
	//konstruktor
	public void tampildata()
	{
		System.out.println(" Nama Peminjam               : " + nama);
		System.out.println(" Pekerjaan Peminjam          : " + pekerjaan);
		System.out.println(" Alamat Peminjam             : " + alamat);
		System.out.println(" No.HP Peminjam              : " + nohp);
		System.out.println(" Usia Peminjam               : " + usia);
		System.out.println(" Kode Buku                   : " + kode);
		System.out.println(" Judul Buku                  : " + judul);
		System.out.println(" Penerbit                    : " + penerbit);
		System.out.println(" Nama Pengarang              : " + pengarang);
		System.out.println(" Tahun Terbit                : " + terbit);
		System.out.println(" ====================================");
	}

	

	public static void main (String args[])
        {
			Perpustakaan perpus = new Perpustakaan("022 5223202");
			

			System.out.println(" =====================================");
    		System.out.println("|         << Perpustakaan >>          |");    
   			System.out.println(" =====================================");
				perpus.pinjam();
				perpus.buku();
			System.out.println(" ====================================");
				perpus.tampildata();
				perpus.jadi();
				perpus.kontak();

				perpus.waktu();
	
				System.out.print(" Dari tanggal : ");
				perpus.setTglPinjam();
    			System.out.println(" Maka buku harus dikembalikan tanggal : "+ perpus.getTglKembali());
    			System.out.println(" Terimakasih atas pengertiannya ^_^ ");
				System.out.println(" ------------------------------------------- ");
				perpus.penjaga();
				perpus.buka();
				perpus.libur();
        }
}