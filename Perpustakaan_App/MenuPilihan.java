
import java.util.Scanner;

public class MenuPilihan {
    int pilihan;
    Scanner input = new Scanner(System.in);
    DataBuku bookdata = new DataBuku();
    DataPegawai jobdata = new DataPegawai();
    Perpustakaan lib = new Perpustakaan(null);
    
    public void menu(){
        System.out.println(" SELAMAT DATANG DI PERPUSTKAAN ");
        System.out.println("       CV. ABADI PERPUS        ");
        System.out.println("-------------------------------");
        System.out.println("1. Tampil Data Buku ");
        System.out.println("2. Tampil Jadwal Pegawai");
        System.out.println("3. Pinjam Buku ");
        System.out.print(" Pilihan Anda : ");
            pilihan = input.nextInt();
            
        switch(pilihan){
            case 1 : bookdata.Data();
                        break;
            case 2 : jobdata.Data();
                        break;
            case 3 : lib.runProgram();
                        break;
        }
    }
    
    
}
