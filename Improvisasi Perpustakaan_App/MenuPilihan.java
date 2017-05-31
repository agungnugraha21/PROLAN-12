package PerpustakaanApp;
import java.util.Scanner;

public class MenuPilihan {

    int pilihan;
    short angka;
    Scanner input = new Scanner(System.in);
    DataBuku bookdata = new DataBuku();
    DataPegawai jobdata = new DataPegawai();
    Perpustakaan lib = new Perpustakaan(null);
    PengambalianBuku letBook = new PengambalianBuku();
    MenuPilihan(){}
    public void menu(){
        System.out.println(" SELAMAT DATANG DI PERPUSTKAAN ");
        System.out.println("       CV. ABADI PERPUS        ");
        System.out.println("-------------------------------");
        System.out.println("1. Tampil Data Buku ");
        System.out.println("2. Tampil Jadwal Pegawai");
        System.out.println("3. Pinjam Buku ");
        System.out.println("4. Pengembalian Buku");
        System.out.println("0. Keluar");
        
        System.out.print(" Pilihan Anda : ");
            pilihan = input.nextInt();
            
        switch(pilihan){
            case 1 : bookdata.Data();
                        break;
            case 2 : jobdata.Data();
                        break;
            case 3 : lib.runProgram();
                        break;
            case 4 : letBook.pengembalian();
                        break;
            case 0 : System.exit(0);
            
        }
        System.out.println(" ========================================= ");
        System.out.print(" Masukkan angka 1 untuk kembali ke menu utama dan angka 0 untuk keluar : ");
            angka = input.nextShort();
            if(angka == 1){
                menu();
            }else if(angka == 0){
                System.exit(0);
            }else{
                System.out.println(" Salah Memasukkan Angka Ulangi");
                System.out.print(" Pilihan ");
                    angka = input.nextShort();
            }
    }
    
    
}
