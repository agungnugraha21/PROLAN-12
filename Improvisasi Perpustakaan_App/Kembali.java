
package PerpustakaanApp;

public class Kembali implements Telat {
  
	@Override
	public void dendaHari(){
		System.out.println(" Telat pengembalian <= 3 hari : Rp. 2.000 ");
	}

	@Override
	public void dendaMinggu(){
		System.out.println(" Telat pengembalian 4 >= 7 : Rp. 5.000 ");
	}

	@Override
	public void dendaBulan(){
		System.out.println(" Telat pengembalian l<= 30 hari : Rp. 10.000 ");
	}
        
        @Override
        public void dendaDefault(){
                System.out.println(" Telat pengembalian > 30 hari : seharga buku yang dipinjam ");
        }
}

