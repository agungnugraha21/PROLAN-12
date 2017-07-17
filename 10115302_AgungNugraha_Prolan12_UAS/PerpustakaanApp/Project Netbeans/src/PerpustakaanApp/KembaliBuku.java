
package PerpustakaanApp;

public class KembaliBuku {
   public static int pengembalianBuku,PB;
   
    public void telat(){
        TelatKembali<Integer> getBack = new TelatKembali<>();
        
        getBack.setTotalHari(PengembalianBuku.balik); 
        pengembalianBuku = getBack.getPengembalian()- Peminjam.tglKembali;
        PB = PengembalianBuku.balik - Peminjam.tglKembali;
        System.out.println("\n\n Telat Pengembalian Buku Selama "+pengembalianBuku +" Hari\n Maka anda akan dikenakan sanksi sebagai mana mestinya\n\n");
    }
 
}