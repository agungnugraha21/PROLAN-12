import java.util.Scanner;
class Inputoutput3
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		String nama,alamat;
		System.out.print("Nama Anda : ");
		nama = input.nextLine();
		System.out.print("Alamat Anda : ");
		alamat = input.nextLine();
		System.out.println("Nama Anda Adalah " +nama);
		System.out.print("Alamat Anda Adalah di " +alamat);
	}
}