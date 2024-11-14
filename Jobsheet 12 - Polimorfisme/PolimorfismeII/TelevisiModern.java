package PolimorfismeII;

public class TelevisiModern extends Elektronik {
    private String modelInput;

    TelevisiModern(int voltase, String modelInput) {
        super(voltase);
        this.modelInput = modelInput;
    }

    public String getModelInput() {
        return modelInput;
    }

    public void cetakInfo(){
        System.out.println("Nyalakan televisi jadul dengan input: " + modelInput);
        super.cetakInfo();
    }
}
