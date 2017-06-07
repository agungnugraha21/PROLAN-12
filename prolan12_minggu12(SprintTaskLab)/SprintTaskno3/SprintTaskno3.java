public class SprintTaskno3 <T> {
    
      //generic method
    public static <N> void methodTampil1 (N datanya1){
        System.out.println(" Nama Peminjam    :" + datanya1);
    }
    
    public static <B> void methodTampil2 (B datanya2){
        System.out.println(" NIM Peminjam     : " + datanya2);
    }

     //method biasa
   
       private void methodTampil3() {
        
	int tahunTerbit = 2010;
        System.out.println(" Tahun Terbit     : " +tahunTerbit);
    
	}
    
	public void kodeBuku (String kode) {
        System.out.println(" Kode Buku        : " +kode);
    }
 
    
    public static void main (String[] args) {
        SprintTaskno3 data = new SprintTaskno3();
            data.kodeBuku("A0001 ");
            data.methodTampil3();

        SprintTaskno3<String>  data1  = new SprintTaskno3<>();
            data1.methodTampil1(" Agung Nugraha ");

        SprintTaskno3<Integer> data2 = new SprintTaskno3<>();
            data2.methodTampil2(10115302); 
    }
}