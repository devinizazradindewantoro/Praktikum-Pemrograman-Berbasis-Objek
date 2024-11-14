package PolimorfismeII;

public class TelevisiJadul extends Elektronik{
    private String modelInput;

    TelevisiJadul(int voltase, String modelInput) {
        super(voltase);
        this.modelInput = modelInput;
    }

    public String getModelInput(){
        return modelInput;
    }

    public void cetakInfo(){
        System.out.println("Nyalakan televisi jadul dengan input: " + modelInput);
        super.cetakInfo();
    }
}
