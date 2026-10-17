package P3;

public class Sepeda {
    private String merk;
    private int jarakTempuh;

    public Sepeda(String merk) {
        this.merk = merk;
        this.jarakTempuh = 0;
    }

    public void maju() {
        jarakTempuh += 10;
        System.out.println("Sepeda " + merk + " maju.");
        System.out.println("Jarak tempuh saat ini: " + jarakTempuh + " km");
    }

    public void mundur() {
        jarakTempuh -= 5;
        System.out.println("Sepeda " + merk + " mundur.");
        System.out.println("Jarak tempuh saat ini: " + jarakTempuh + " km");
    }

    public void berhenti() {
        System.out.println("Sepeda " + merk + " berhenti.");
        System.out.println("Jarak akhir: " + jarakTempuh + " km");
    }

    public String getMerk() {
        return merk;
    }

    public int getJarakTempuh() {
        return jarakTempuh;
    }
}
