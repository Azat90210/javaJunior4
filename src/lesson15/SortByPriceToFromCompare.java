package lesson15;

import java.util.Comparator;

public class SortByPriceToFromCompare implements Comparator<Tovar> {


    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getPrice() != o2.getPrice()) {
            return Integer.compare(o2.getPrice(), o1.getPrice());
        } else if (!o1.getName().equals(o2.getName())) {
            return o1.getName().compareTo(o2.getName());
        } else if (o1.getTotalRate() != o2.getTotalRate()) {
            return Double.compare(o1.getTotalRate(), o2.getTotalRate());
        } else if (o1.getOtzivs().size() != o2.getOtzivs().size()) {
            return Integer.compare(o1.getOtzivs().size(), o2.getOtzivs().size());
        } else if (o1.getObzors().size() != o2.getObzors().size()) {
            return Integer.compare(o1.getObzors().size(), o2.getObzors().size());
        }
        return 0;
    }
}
