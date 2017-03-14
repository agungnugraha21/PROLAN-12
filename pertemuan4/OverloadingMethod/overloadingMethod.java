public class overloadingMethod
{
	public static void main (String[] args)
	{
		overloading over = new overloading();
			
			over.name();
			over.name(20);

	}
}
class overloading
{
	void name()
	{
		String nama;
		nama = "Agung Nugraha";
		System.out.println("Nama Saya Adalah "+nama);
	}

	void name(int umur)
	{
		System.out.println("Dan Saya Berumur "+umur);
	}
}