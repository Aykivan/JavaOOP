package Practice2.HomeWork;

public abstract class Device implements Magazine {
    private int OZU;
    private int volumeHD;

    public Device(int OZU, int volumeHD) {
        this.OZU = OZU;
        this.volumeHD = volumeHD;
    }
    public int getOZU() {
        return OZU;
    }
    public void setOZU(int OZU) {
        this.OZU = OZU;
    }
    public int getVolumeHD() {
        return volumeHD;
    }

    public void setVolumeHD(int volumeHD) {
        this.volumeHD = volumeHD;
    }
}
