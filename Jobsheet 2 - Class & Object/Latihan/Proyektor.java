public class Proyektor {
    String Merk;
    int Brightness, Contrast, Volume, Keystone, tambahVolume, kurangiVolume, tambahBrightness, 
    kurangiBrightness, tambahContrast, kurangiContrast, tambahKeystone, kurangiKeystone;

    public void menyalakan() {
        System.out.println("Proyektor " + Merk + " Dinyalakan ");
    }

    public void mematikan() {
        System.out.println("Proyektor " + Merk + " Dinyalakan ");
    }
    
    public int tambahVolume (float increment) {
        tambahVolume += increment;
        return tambahVolume;
    }

    public int kurangivVolume (float decrement) {
        kurangiVolume -= decrement;
        return kurangiVolume;
    }

    public int tambahBrightness (float increment) {
        tambahBrightness += increment;
        return tambahBrightness;
    }

    public int kurangiBrightness (float decrement) {
        kurangiBrightness -= decrement;
        return kurangiBrightness;
    }

    public int tambahContrast (float increment) {
        tambahContrast += increment;
        return tambahContrast;
    }

    public int kurangiContrast (float decrement) {
        kurangiContrast -= decrement;
        return kurangiContrast;
    }

    public int tambahKeystone (float increment) {
        tambahKeystone += increment;
        return tambahKeystone;
    }

    public int kurangiKeystone (float decrement) {
        kurangiKeystone -= decrement;
        return kurangiKeystone;
    }

    public void setMerk (String newValue) {
        Merk = newValue;
    }

    public void setBrightness (int newValue) {
        Brightness = newValue;
    }

    public void setContrast (int newValue) {
        Contrast = newValue;
    }

    public void setVolume (int newValue) {
        Volume = newValue;
    }

    public void setKeystone (int newValue) {
        Keystone = newValue;
    }

    public void cetakInfo () {
        System.out.println("---------INFORMASI PROYEKTOR--------");
        System.out.println("Merk : " + Merk);
        System.out.println("Brightness : " + Brightness);
        System.out.println("Contrast : " + Contrast);
        System.out.println("Volume : " + Volume);
        System.out.println("Keystone : " + Keystone);
    }
}
