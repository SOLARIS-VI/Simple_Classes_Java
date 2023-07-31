public class WaterBottle {
    private int volume = 100;

    public void drink() {
        volume -= 10;
        if (volume < 0) {
            volume = 0;
        }
    }

    public void empty() {
        volume = 0;
    }

    public void fill() {
        volume = 100;
    }

    public int getVolume() {
        return volume;
    }
}
