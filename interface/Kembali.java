public class Kembali implements Telat {
	@Override
	public void dendaHari(){
		System.out.println(" Telat pengembalian sebelum kurang dari seminggu : Rp. 2.000 ");
	}

	@Override
	public void dendaMinggu(){
		System.out.println(" Telat pengembalian sebelum seminggu : Rp. 5.000 ");
	}

	@Override
	public void dendaBulan(){
		System.out.println(" Telat pengembalian sebelum sebulan : Rp. 10.000 ");
	}
}