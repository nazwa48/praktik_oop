// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Sepeda {
    private String merek;
    private int kecepatan;
    private int gear;

    public void setMerek (String newValue){
        merek = newValue;
    }

    public void gantiGear (int newValue) {
        gear = newValue;
    }

    public void tambahKecepatan (int increment) {
        kecepatan = kecepatan + increment;
    }

    public void rem (int decrement) {
        kecepatan = kecepatan - decrement;
    }

    public void cetakStatus() {
        System.out.println("Merek \t\t: " + merek);
        System.out.println("Kecepatan \t: " + kecepatan);
        System.out.println("Gear \t\t: " + gear);
    }
}