public class SprintTaskno1 {

	//generic methode 
    public <T> void namaPeminjam (T nama) {
        System.out.println(" Nama  Peminjam           : " +nama);     
    }
    public <T> void usiaPeminjam (T umur) {
        System.out.println(" Usia Peminjam            :  " +umur+ " Tahun");
    }
    public <T> void alamatPeminjam (T alamat) {
        System.out.println(" Alamat Peminjam          : " +alamat);
    }

    //generic method on 2 types
    public <T,N> void dataBukuPinjaman (T x , N y) {
        System.out.println(" Judul Buku               : " +x);
        System.out.println(" Nama Penerbit            : " +y);
    } 

    public static void main (String[] args) {
        SprintTaskno1 data = new SprintTaskno1();

        data.namaPeminjam(" Agung Nugraha");
        data.usiaPeminjam( 20);
        data.alamatPeminjam(" Bandung");
        data.dataBukuPinjaman(" Java Programming "," Informatika ");
        
    } 
    
}