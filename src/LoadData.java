import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadData {

    List<Order> loadFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("zamowienia.txt"));
        List<Order> orderList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] dane = line.split(";");
            StatusOrder s = StatusOrder.valueOf(dane[2]);
            Order order = new Order(dane[0], Double.valueOf(dane[1]), s);
            orderList.add(order);
        }
        return orderList;
    }
}
