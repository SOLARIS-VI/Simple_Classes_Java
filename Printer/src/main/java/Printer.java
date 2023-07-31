public class Printer {
    private int sheetsLeft;
    private int tonerVolume;

    public Printer(int sheetsLeft, int tonerVolume) {
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public void print(int pages, int copies) {
        int totalSheetsNeeded = pages * copies;
        if (sheetsLeft >= totalSheetsNeeded) {
            sheetsLeft -= totalSheetsNeeded;
            tonerVolume -= totalSheetsNeeded;
        }
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }
}
