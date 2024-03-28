public class LCD {
    private String Status;
    private int Volume;
    private int Brightness;
    private String Cable;

    public void turnOff() {
        Status = "mati";
    }

    public void turnOn() {
        Status = "menyala";
    }

    public void Freeze() {
        Status = "freeze";
    }

    public void volumeUp() {
        if (Volume < 100) {
            Volume++;
        }
    }

    public void volumeDown() {
        if(Volume > 0) {
            Volume--;
        }
    }

    public void setVolume(int volume) {
        Volume = volume;
    }

    public void brightnessUp() {
        if(Brightness < 100) {
            Brightness++;
        }
    }

    public void brightnessDown() {
        if(Brightness > 0) {
            Brightness--;
        }
    }

    public void setBrightness(int brightness) {
        Brightness = brightness;
    }

    public void setCable(String cable) {
        String[] cableList = {"HDMI", "DVI", "VGA", "DisplayPort"};
        
        for (String c : cableList) {
            if(cable.equals(c)) {
                Cable = c;
            }
        }
    }

    public void displayInfo() {
        System.out.println("LCD Status : " + Status);
        System.out.println("Volume : " + Volume);
        System.out.println("Brightness : " + Brightness);
        System.out.println("Cable : " + Cable);
    }
}
