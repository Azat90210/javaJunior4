package lesson9;

public class Vodorosli extends Plants{
    private boolean pochva;

    public Vodorosli() {
        super();
    }

    public Vodorosli(boolean pochva) {
        super();
        this.pochva = pochva;
    }

    public Vodorosli(String listya, String razmnogenie, String osobennosti, boolean pochva) {
        super(listya, razmnogenie, osobennosti);
        this.pochva = pochva;
    }

    public boolean isPochva() {
        return pochva;
    }

    public void setPochva(boolean pochva) {
        this.pochva = pochva;
    }
}
