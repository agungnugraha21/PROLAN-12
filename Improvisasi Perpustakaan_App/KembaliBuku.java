
package PerpustakaanApp;

public class KembaliBuku {
   public static int pengembalianBuku;
    public void telat(){
        TelatKembali<Integer> getBack = new TelatKembali<>();
        
        getBack.setTotalHari(7); 
        pengembalianBuku = getBack.getPengembalian()-Buku.day;
        System.out.println("\n\n Telat Pengembalian Buku Selama "+pengembalianBuku +" Hari\n Maka anda akan dikenakan sanksi sebagai mana mestinya\n\n");
    }
 
}
