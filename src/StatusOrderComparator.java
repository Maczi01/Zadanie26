import java.util.Comparator;

public class StatusOrderComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        if (o1.getStatusOdrer().ordinal() > o2.getStatusOdrer().ordinal()) {
            return 1;
        } else if (o1.getStatusOdrer().ordinal() < o2.getStatusOdrer().ordinal()) {
            return -1;
        } else
            return 0;
    }
}
