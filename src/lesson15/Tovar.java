package lesson15;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Tovar implements Comparable<Tovar> {
    private String name;
    private int price;
    private ArrayList<Otziv> otzivs = new ArrayList<>();
    private ArrayList<Obzor> obzors = new ArrayList<>();

    public Tovar() {
    }

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Otziv> getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(ArrayList<Otziv> otzivs) {
        this.otzivs = otzivs;
    }

    public ArrayList<Obzor> getObzors() {
        return obzors;
    }

    public void setObzors(ArrayList<Obzor> obzors) {
        this.obzors = obzors;
    }



    public void addOtziv(Otziv t) {
        this.otzivs.add(t);
    }

    public void addObzor(Obzor a) {
        this.obzors.add(a);
    }

    public double getTotalRate() {
        double result = 0;
        int count = 0;
        for (Otziv o : this.otzivs) {
            result = result + o.getRate();
            count++;
        }

        if (count != 0) {
            return result / count;
        } else return 0.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (price != tovar.price) return false;
        if (name != null ? !name.equals(tovar.name) : tovar.name != null) return false;
        if (otzivs != null ? !otzivs.equals(tovar.otzivs) : tovar.otzivs != null) return false;
        return obzors != null ? obzors.equals(tovar.obzors) : tovar.obzors == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (otzivs != null ? otzivs.hashCode() : 0);
        result = 31 * result + (obzors != null ? obzors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", otzivs=" + otzivs +
                ", obzors=" + obzors +
                "}\n";
    }

    @Override
    public int compareTo(Tovar o) {
        if (this.price != o.price) {
            return Integer.compare(this.price, o.price);
        } else if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        } else if (this.getTotalRate() != o.getTotalRate()) {
            return Double.compare(this.getTotalRate(), o.getTotalRate());
        } else if (this.otzivs.size() != o.otzivs.size()) {
            return Integer.compare(this.otzivs.size(), o.otzivs.size());
        } else if (this.obzors.size() != o.obzors.size()) {
            return Integer.compare(this.obzors.size(), o.obzors.size());
        }
        return 0;
    }

    public static TreeSet<Tovar> setByPriceToFrom(TreeSet<Tovar> t) {
        TreeSet<Tovar> res = new TreeSet<>(new SortByPriceToFromCompare());
        for (Tovar tt : t) {
            res.add(tt);
        }
        return res;
    }

    public static TreeSet<Tovar> sortByNameFromTo(TreeSet<Tovar> tovars) {
        TreeSet<Tovar> res = new TreeSet<>((o1, o2) -> {
            if (!o1.getName().equals(o2.getName())) {
                return o1.getName().compareTo(o2.getName());
            } else if (o1.getPrice() != o2.getPrice()) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            } else if (o1.getTotalRate() != o2.getTotalRate()) {
                return Double.compare(o1.getTotalRate(), o2.getTotalRate());
            } else if (o1.getOtzivs().size() != o2.getOtzivs().size()) {
                return Integer.compare(o1.getOtzivs().size(), o2.getOtzivs().size());
            } else if (o1.getObzors().size() != o2.getObzors().size()) {
                return Integer.compare(o1.getObzors().size(), o2.getObzors().size());
            }
            return 0;
        });
        for (Tovar tt : tovars) {
            res.add(tt);
        }
        return res;
    }

    // по рейтигу
    public static TreeSet<Tovar> sortByRateFromTo(TreeSet<Tovar> tovars) {
        TreeSet<Tovar> res = new TreeSet<>((o1, o2) -> {
            if (o1.getTotalRate() != o2.getTotalRate()) {
                return Double.compare(o2.getTotalRate(), o1.getTotalRate());
            } else if (!o1.getName().equals(o2.getName())) {
                return o1.getName().compareTo(o2.getName());
            } else if (o1.getPrice() != o2.getPrice()) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            } else if (o1.getOtzivs().size() != o2.getOtzivs().size()) {
                return Integer.compare(o1.getOtzivs().size(), o2.getOtzivs().size());
            } else if (o1.getObzors().size() != o2.getObzors().size()) {
                return Integer.compare(o1.getObzors().size(), o2.getObzors().size());
            }
            return 0;
        });
        for (Tovar tt : tovars) {
            res.add(tt);
        }
        return res;
    }

    //по отзывам
    public static TreeSet<Tovar> sortByOtzivFromTo(TreeSet<Tovar> tovars) {
        TreeSet<Tovar> res = new TreeSet<>((o1, o2) -> {
            if (o1.getOtzivs().size() != o2.getOtzivs().size()) {
                return Integer.compare(o1.getOtzivs().size(), o2.getOtzivs().size());
            } else if (o1.getTotalRate() != o2.getTotalRate()) {
                return Double.compare(o1.getTotalRate(), o2.getTotalRate());
            } else if (!o1.getName().equals(o2.getName())) {
                return o1.getName().compareTo(o2.getName());
            } else if (o1.getPrice() != o2.getPrice()) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            } else if (o1.getObzors().size() != o2.getObzors().size()) {
                return Integer.compare(o1.getObzors().size(), o2.getObzors().size());
            }
            return 0;
        });
        for (Tovar tt : tovars) {
            res.add(tt);
        }
        return res;
    }

    //по обзорам
    public static TreeSet<Tovar> sortByObzorFromTo(TreeSet<Tovar> tovars) {
        TreeSet<Tovar> res = new TreeSet<>((o1, o2) -> {
            if (o1.getObzors().size() != o2.getObzors().size()) {
                return Integer.compare(o2.getObzors().size(), o1.getObzors().size());
            } else if (!o1.getName().equals(o2.getName())) {
                return o1.getName().compareTo(o2.getName());
            } else if (o1.getPrice() != o2.getPrice()) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            } else if (o1.getTotalRate() != o2.getTotalRate()) {
                return Double.compare(o1.getTotalRate(), o2.getTotalRate());
            } else if (o1.getOtzivs().size() != o2.getOtzivs().size()) {
                return Integer.compare(o1.getOtzivs().size(), o2.getOtzivs().size());
            }
            return 0;
        });
        for (Tovar tt : tovars) {
            res.add(tt);
        }
        return res;

    }
}
