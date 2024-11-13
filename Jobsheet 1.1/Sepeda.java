public class Sepeda {
    private String Merek;
    private int kecepatan;
    private int gear;

    public void setMerek (String newValue) 
    {
        Merek = newValue;
    }
    
    public void gantiGear (int newValue) 
    {
        gear = newValue;
    }
    
    public void tambahKecepatan (int increment)
    {
        kecepatan = kecepatan + increment;
    }
    
    public void rem(int decrement) 
    {
        kecepatan = kecepatan - decrement;
    }
    
    public void cetakStatus() {
        
        System.out.println("merek: " + Merek);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
    }
}