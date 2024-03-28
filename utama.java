public class utama {
    public static void main(String[] args) {
        LCD lcd1 = new LCD();

        lcd1.Freeze();
        lcd1.setVolume(51);
        lcd1.setBrightness(38);
        lcd1.setCable("HDMI");

        lcd1.displayInfo();
    }

}