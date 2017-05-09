class Agung extends Mahasiswa{
	protected float ipk;

	@Override
	protected void kuliah(){

		nama = "Agung Nugraha";
		nim = "10115302";
		
		System.out.println(" --------------------------------------- ");
		System.out.println("| Data Mahasiswa UNIKOM ");
		System.out.println("| Nama : "+nama);
		System.out.println("| NIM  : "+nim);
	}

	@Override
	protected void lulus(){
		
		ipk = 3;

		System.out.println(" --------------------------------------- ");
		System.out.println("| Syarat Lulus Kuliah adalah IPK >= 2,75 ");
		System.out.println("| IPK  : "+ipk);
		System.out.println("| Selamat Anda Telah Lulus Kuliah ");
		
	}

	@Override
	protected void tidaklulus(){
		System.out.println(" --------------------------------------- ");
		System.out.println("| IPK Anda Kurang dari Syarat Lulus, ");
		System.out.println("| Ulangi kembali di semester berikutnya ! ");
		System.out.println("|          NEVER GIVE UP !!! ");
		System.out.println(" --------------------------------------- ");

	}

}