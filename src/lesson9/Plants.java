package lesson9;

public class Plants {
    private String listya;
    private String razmnogenie;
    private String osobennosti;

    public Plants() {
    }

    public Plants(String listya, String razmnogenie, String osobennosti) {
        this.listya = listya;
        this.razmnogenie = razmnogenie;
        this.osobennosti = osobennosti;
    }

    public String getListya() {
        return listya;
    }

    public void setListya(String listya) {
        this.listya = listya;
    }

    public String getRazmnogenie() {
        return razmnogenie;
    }

    public void setRazmnogenie(String razmnogenie) {
        this.razmnogenie = razmnogenie;
    }

    public String getOsobennosti() {
        return osobennosti;
    }

    public void setOsobennosti(String osobennosti) {
        this.osobennosti = osobennosti;
    }

    @Override
    public String toString() {
        return "Растения {" +
                "listya='" + listya + '\'' +
                ", razmnogenie='" + razmnogenie + '\'' +
                ", osobennosti='" + osobennosti + '\'' +
                '}';
    }
}
