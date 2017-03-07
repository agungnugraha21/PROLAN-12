class perpustakaan{
	public static void main (String[] args){
		peminjam borrow = new peminjam();
		buku book = new buku();

		borrow.nama = "Agung Nugraha";
		borrow.pekerjaan = "Mahasiswa";
		borrow.alamat = "Bandung";
		borrow.nohp = "082316675115";

		book.kode = "A001";
		book.judul = "Java Is The Best Programming Language";
		book.penerbit = "Tiga Serangkai";
		book.pengarang = "Rinaldi Munir";

		System.out.println(" << Perpustakaan >>");
		System.out.println(" ------------------- ");
		System.out.println(" Nama Peminjam = "+borrow.nama);
		System.out.println(" Pekerjaan  = "+borrow.pekerjaan);
		System.out.println(" Alamat = "+borrow.alamat);
		System.out.println(" No Hp = "+borrow.nohp);
		System.out.println(" -------------------");
		System.out.println(" Kode Buku = "+book.kode);
		System.out.println(" Judul Buku = "+book.judul);
		System.out.println(" Penerbit = "+book.penerbit);
		System.out.println(" Pengarang = "+book.pengarang);
		System.out.println(" -------------------");
		borrow.meminjamBuku();
		
		
	}
}