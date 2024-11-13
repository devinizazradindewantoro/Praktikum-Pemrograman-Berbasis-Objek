package PolimorfismeII;

public class Elektronik {
    protected int voltase;

    Elektronik(int voltase) {
        this.voltase = voltase;
    }

    public int getVoltase() {
        return voltase;
    }

    public void cetakInfo(){
        System.out.println("Voltase Televisi: " + voltase);
    }
}
