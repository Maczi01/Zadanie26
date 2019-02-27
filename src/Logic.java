import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Logic {

    Scanner scanner = new Scanner(System.in);
    CommunicationWithUser cwu;
    NameOrderComparator noc = new NameOrderComparator();
    PriceOrderComparator poc = new PriceOrderComparator();
    StatusOrderComparator soc = new StatusOrderComparator();

    void mainMenu(List<Order> list) {
        final String EXIT = "0";
        String choise;

        do {
            cwu.showMainMenu();
            System.out.println("Wybierz opcje z menu");
            choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    sortMenu(list);
                    break;
                case "2":
                    statusMenu(list);
                    break;
                case "3":
                    createOrder(list);
                    break;
                case "4":
                    System.out.println(list);
                    break;
                case "5":
                    removeMenu(list);
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Nieprawidlowy wybor");
            }
        } while (!choise.equals(EXIT));
    }


    List<Order> removeOrderFromList(List<Order> list) {
        cwu.choosePositionToRemove();
        list.remove(choiceNumber());
        System.out.println("Po");
        return list;
    }

    List<Order> removeAllOrdersFromList(List<Order> list) {
        cwu.confirm();
        String choise;
        choise = scanner.nextLine();
        switch (choise) {
            case "1":
                list.clear();
                break;
            case "2":
                removeMenu(list);
                break;
                default:
                    System.out.println("Nieprawidlowy wybor");
        }
        return list;
    }

    List<Order> createOrder(List<Order> list) {
        System.out.println("Co zostalo zamowione ?");
        String name = scanner.nextLine();
        System.out.println("Jaka ma to cene ?");
        double price = scanner.nextDouble();
        scanner.nextLine();
        Order o = new Order();
        o.setName(name);
        o.setPrice(price);
        o.setStatusOdrer(StatusOrder.SUBMITTED);
        list.add(o);
        System.out.println("Dodano zamowienie produktu " + name);
        return list;
    }

    Order choiceOrder(List<Order> list) {
        System.out.println("Podaj numer");
        int n = choiceNumber();
        showList(list);
        return list.get(n);
    }

    int choiceNumber() {
        int n = scanner.nextInt();
        scanner.nextLine();
        return n - 1;
    }

    void showList(List<Order> list) {
        int i = 1;
        for (Order o : list) {
            System.out.print(i + " .");
            System.out.print(o);
            i++;
        }
    }

    void statusMenu(List<Order> list) {
        Order order = choiceOrder(list);
        final String EXIT = "0";
        String choise;
        do {
            cwu.showStatusMenu();
            System.out.println("Wybierz opcje z menu");
            choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    order.getStatusOdrer();
                    System.out.println(order.getStatusOdrer());
                    break;
                case "2":
                    order.setStatusOdrer(StatusOrder.SUBMITTED);
                    break;
                case "3":
                    order.setStatusOdrer(StatusOrder.READY_TO_SHIP);
                    break;
                case "4":
                    if (possibilityOfChangeStatus(order))
                        order.setStatusOdrer(StatusOrder.SHIPPED);
                    else
                        System.out.println("Zmiana niemozliwa");
                    break;
                case "5":
                    if (possibilityOfChangeStatus(order))
                        order.setStatusOdrer(StatusOrder.COMPLETED);
                    else
                        System.out.println("Zmiana niemozliwa");
                    break;
                case "6":
                    cwu.confirm();
                    choise = scanner.nextLine();
                    list.remove(choiceNumber());
                    break;
                case "7":
                    mainMenu(list);
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Nieprawidlowy wybor");
            }
        } while (!choise.equals(EXIT));
    }

    List<Order> sortMenu(List<Order> list) {
        final String EXIT = "0";
        String choise;
        do {
            cwu.howToSort();
            choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    Collections.sort(list, noc);
                    System.out.println("Posortowano wg nazwy");
                    break;
                case "2":
                    Collections.sort(list, poc);
                    System.out.println("Posortowano wg ceny");
                    break;
                case "3":
                    Collections.sort(list, soc);
                    System.out.println("Posortowano wg statusu");
                    break;
                case "4":
                    mainMenu(list);
                    break;
                default:
                    break;
            }
        } while (!scanner.equals(EXIT));
        return list;
    }

    boolean possibilityOfChangeStatus(Order o) {
        StatusOrder s = o.getStatusOdrer();
        if (s.equals(StatusOrder.SHIPPED)) {
            return false;
        }
        if (s.equals(StatusOrder.SHIPPED)) {
            return false;
        }
        return true;
    }

    void removeMenu(List<Order> list) {
        final String EXIT = "0";
        String choise;

        do {
            cwu.showMenuremoveOrderFromList();
            choise = scanner.nextLine();
            System.out.println("Wybierz opcje usuwania z menu");
            switch (choise) {
                case "1":
                    removeOrderFromList(list);
                    break;
                case "2":
                    removeAllOrdersFromList(list);
                    break;
                case "0":
                    mainMenu(list);
                    break;
                default:
                    System.out.println("Nieprawidlowy wybor");
            }
        } while (!choise.equals(EXIT));
    }


}
