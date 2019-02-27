import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        LoadData loadData = new LoadData();
        List<Order> listOfOrders = loadData.loadFile();

        Logic logic = new Logic();
        logic.mainMenu(listOfOrders);


    }


}
