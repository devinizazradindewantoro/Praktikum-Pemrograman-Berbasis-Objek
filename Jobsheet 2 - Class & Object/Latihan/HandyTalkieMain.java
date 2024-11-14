public class HandyTalkieMain {
    public static void main(String[] args) {
        
        HandyTalkie ht1 = new HandyTalkie();

        ht1.kurangivVolume(70);
        ht1.setMerkHT("Baofeng");
        ht1.setWarnaHT("Hitam");
        ht1.setChannel(16);
        ht1.setVolume(100);
        ht1.cetakSpesifikasi();
    }
}
