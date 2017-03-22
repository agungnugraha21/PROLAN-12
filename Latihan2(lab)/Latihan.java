import java.util.Scanner;
public class Latihan
{

    public void pilihanA(int min, int jummin)
    {
        System.out.println(" Nilai minimum                  = "+min);
        System.out.println(" Banyaknya kemunculan nilai min = "+jummin);
    }
    
    public void pilihanB(int max, int jummax)
    {
        System.out.println(" Nilai maksimum                 = "+max);
        System.out.println(" Banyaknya kemunculan nilai max = "+jummax);
    }
   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        Latihan pilih = new Latihan();
        int min =0 ,max = 0,jummin = 1,jummax = 1;
        
        System.out.print(" Masukkan jumlah angka : ");
            int n = input.nextInt();
        System.out.print(" Masukkan pilihan anda [A/B] : ");
            char pilihan = input.next().charAt(0);
        
            if((pilihan == 'A')||(pilihan == 'B'))
            {
                 
                     for(int i = 1; i<=n; i++)
                     {
                         System.out.print(" Masukkan angka : ");
                            int angka = input.nextInt();
                        
                            //penampung nilai
                         if(i == 1)
                         {
                             min = angka;
                             max = angka;
                         }else{
                           //pembanding 
                            if(min > angka)
                            {                      
                                min = angka;
                               if(min == angka)
                                {
                                    jummin++;
                                }
                            }else
                            if(max < angka)
                            {                           
                                max = angka;
                                if(max < angka)
                                {
                                    jummax++;
                                }
                            }
                         }
                       
                     }
                     
                if (pilihan == 'A')
                {
                    
                    pilih.pilihanA(min,jummin);
                }else 
                {
                    pilih.pilihanB(max,jummax);       
                }
                
            }else
            {
                System.out.println(" Anda salah memasukkan pilihan, ulangi ! "); 
            }
            
    }
    
}
