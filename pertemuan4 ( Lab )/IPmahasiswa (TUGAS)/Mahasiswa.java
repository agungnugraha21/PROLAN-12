import java.util.Scanner;
public class Mahasiswa
{

	public static void main(String[] args)
	{
		Mahasiswa ipmhs = new Mahasiswa();
		Scanner input = new Scanner(System.in);
		float ip,rataRata = 0,jumIp = 0;
		int jmlMhs = 0,jmlMhsLls = 0,jmlMhsTLls = 0, dataabai = 0;

		System.out.println(" ====================================== ");
		System.out.println("|       INDEKS PRESTASI MAHASISWA       |");
		System.out.println(" =======================================");
		System.out.print  (" Masukkan IP Mahasiswa          : ");
			ip = input.nextFloat();
			
			while(ip != -999)
			{
					if(ipmhs.iswithinRange(ip, 0, 4) == 1 )
					{
						jmlMhs++;
						jumIp = jumIp + ip;
						
						if (ip >= 2.75)
						{
							jmlMhsLls++;
						}else
						{
							jmlMhsTLls++;
						}		
						rataRata = jumIp/jmlMhs;
					}else
					{
						System.out.println("        <--- Tidak Ada Data ---> ");
						dataabai++;
					}
					
					System.out.print  (" Masukkan IP Mahasiswa          : ");
					ip = input.nextFloat();
			}
			System.out.println(" ======================================= \n");
			
			if((jmlMhs == 0)&&(jmlMhsTLls == 0)&&(jmlMhsLls == 0)&&(rataRata == 0))
			{
				System.out.println(" <--- Tidak Ada Data Yang Dimasukkan ---> ");
			}else
			{
				System.out.println(" Jumlah Mahasiswa adalah        : " + jmlMhs);
				System.out.println(" Data IP Yang Diabaikan         : " + dataabai);
				System.out.println(" Jumlah Mahasiswa Lulus adalah  : " + jmlMhsLls);
				System.out.println(" Jumlah Mahasiswa Tidak Lulus   : " + jmlMhsTLls);
				System.out.println(" Rata-rata IP Mahasiswa         : " + rataRata);
			}

	}



	int iswithinRange (float x, float min, float max)
	{
		if(x >= min && x <= max)
		{
			return 1;
		}else
		{
			return 0;
		}
	}
}