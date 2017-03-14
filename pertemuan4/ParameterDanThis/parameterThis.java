public class parameterThis
{ 
	String nama,nim;

	void isiData ( String nama,String nim) 
	{ 
		this.nama=nama; 
		this.nim=nim; 
	}
	public static void main ( String [ ] args)
	{ 
		parameterThis mhs = new parameterThis(); 

		mhs.isiData("Agung Nugraha","10115302"); 

		System.out.println( "Nama : "+ mhs.nama); 
		System.out.println( "NIM  : "+ mhs.nim); 
	} 
}

 

	 
