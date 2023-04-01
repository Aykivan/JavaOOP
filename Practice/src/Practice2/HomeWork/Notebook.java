package Practice2.HomeWork;

import java.util.*;

public class Notebook extends Device {
    private String system;
    private String color;

    public Notebook(int OZU, int volumeHD, String system, String color) {
        super(OZU, volumeHD);
        this.system = system;
        this.color = color;
    }
    public String getSystem() {
        return system;
    }
    public void setSystem(String system) {
        this.system = system;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "NB: OZU - " + getOZU() + ", Volume HD - " + getVolumeHD() + ", System - " + system + ", Color - " + color;
    }
}
