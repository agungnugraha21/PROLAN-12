import java.util.Scanner;
public class Buku {
        Scanner input1 = new Scanner(System.in);
		String kode, judul, penerbit, pengarang,makan; 
        short terbit,day;

        boolean meminjam,kons;

    	//konstruktor
    	public void buku()
    	{
    		System.out.print(" Masukkan Kode Buku          : ");
		        kode = input1.nextLine();
		    System.out.print(" Masukkan Judul Buku         : ");
		        judul = input1.nextLine();
		    System.out.print(" Masukkan Penerbit           : ");
		        penerbit = input1.nextLine();
		    System.out.print(" Masukkan Nama Pengarang     : ");
		        pengarang = input1.nextLine();
		    System.out.print(" Masukkan Tahun Terbit       : ");
		        terbit = input1.nextShort();
    	}

    	//konstruktor
    	public void keterangan()
    	{
    		System.out.println("| Buku yang telah dipinjam harap dikembalikan tepat pada waktunya !");
    		System.out.println("| Terima Kasih ^_^ ");
    	}

        //for Override
    	public void waktu()
        {
            System.out.print(" Berapa lama anda akan meminjam buku :  ");
                day = input1.nextShort();
        }

        public void  telat()
        {
            System.out.println(" Jika anda telat mengembalikan buku maka ada sanksi bagi anda !");
        }

        public void hilang()
        {
            System.out.println(" Bila buku yang dipinjam ternyata hilang, maka peminjam wajib menggantinya ! ");
        }

        public void sanksi()
        {
            System.out.print(" Apakah anda siap menerima konsekuensinya ? ");
                kons = input1.nextBoolean();

            if(kons == true)
            {
                System.out.println(" Buku " + judul + " telah dipinjam ");
                System.out.println(" Terimakasih atas pengertiannya ^_^ ");
            }else
            {
                System.out.println(" Anda tidak diperkenankan untuk meminjam buku ");
                System.out.println(" Mohon perhatikan kembali peraturan yang tersedia ");
            }
        }
        //end Override

	}    