
package PerpustakaanApp;

public class TelatKembali <T> {
    private T pengembalian;
 
    
    public void setTotalHari(T pengembalian){
        this.pengembalian = pengembalian;
    }
    public T getPengembalian(){
     
        return pengembalian;
    }


}

