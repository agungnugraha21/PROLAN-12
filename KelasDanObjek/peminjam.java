class peminjam{
	String nama, pekerjaan, alamat, nohp;
	
	void tampilpeminjam(){
		
		nama = "Agung Nugraha";
		pekerjaan = "Mahasiswa";
		alamat = "Bandung";
		nohp = "082316675115";

		System.out.println(" << Perpustakaan >>");
		System.out.println(" ------------------- ");
		System.out.println(" Nama Peminjam = "+nama);
		System.out.println(" Pekerjaan     = "+pekerjaan);
		System.out.println(" Alamat        = "+alamat);
		System.out.println(" No Hp         = "+nohp);
		System.out.println(" -------------------");
	}

	public void meminjamBuku(){
		System.out.println("\n NB : Buku Telah Dipinjam,, Mohon Kembalikan Tepat Waktu !!! ^_^");
	}

}
