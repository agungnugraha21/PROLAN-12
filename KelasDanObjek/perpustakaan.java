class perpustakaan{
	public static void main (String[] args){
		peminjam borrow = new peminjam();
		buku book = new buku();

		borrow.tampilpeminjam();
		book.tampilbuku();
		borrow.meminjamBuku();
		
		
	}
}
