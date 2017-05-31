
package PerpustakaanApp;

public abstract class Pegawai implements Telat {
 
    protected String ipt;
    protected String nama;
    protected String nip;
    protected String hariKerja1;
    protected String hariKerja2;

    protected abstract void penjaga();
    protected abstract void buka();
    protected abstract void libur(); 

}
