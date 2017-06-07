public class Main {
   public <T> SprintTaskno3 dataSprintTaskno3 (T SpTn3) {
       return (SprintTaskno3) SpTn3;
   }
   
 public static void main(String[] args) {
   Main Objek = new Main();
   
   Objek.dataSprintTaskno3(new SprintTaskno3<>()).methodTampil1(" Agung Nugraha ");
   Objek.dataSprintTaskno3(new SprintTaskno3<>()).methodTampil2(10115302); 
   }
}