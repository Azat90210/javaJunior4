package lesson12;

public class Coins {
    private int diametr;
    private int nominal;
    private String sostav;

    public Coins() {
    }

    public Coins(int diametr, int nominal, String sostav) {
        this.diametr = diametr;
        this.nominal = nominal;
        this.sostav = sostav;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public String getSostav() {
        return sostav;
    }

    public void setSostav(String sostav) {
        this.sostav = sostav;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coins coins = (Coins) o;

        if (diametr != coins.diametr) return false;
        if (nominal != coins.nominal) return false;
        return sostav != null ? sostav.equals(coins.sostav) : coins.sostav == null;
    }

    @Override
    public int hashCode() {
        int result = diametr;
        result = 31 * result + nominal;
        result = 31 * result + (sostav != null ? sostav.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Coins{" +
                "diametr=" + diametr +
                ", nominal=" + nominal +
                ", sostav='" + sostav + '\'' +
                '}';
    }
}
