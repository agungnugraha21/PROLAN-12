class perpustakaan{
	public static void main (String[] args){
		peminjam borrow = new peminjam();
		buku book = new buku();

		book.kode = "A001";
		book.judul = "Java Is The Best Programming Language";
		book.penerbit = "Tiga Serangkai";
		book.pengarang = "Rinaldi Munir";

		System.out.println(" Kode Buku = "+book.kode);
		System.out.println(" Judul Buku = "+book.judul);
		System.out.println(" Penerbit = "+book.penerbit);
		System.out.println(" Pengarang = "+book.pengarang);
		System.out.println(" -------------------");
		borrow.meminjamBuku();
		
		
	}
}
