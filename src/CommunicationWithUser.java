public class CommunicationWithUser {

    static void showMainMenu(){
        System.out.println("1. Posortuj");
        System.out.println("2. Zmien status zamowienia");
        System.out.println("3. Dodaj zamowienie");
        System.out.println("4. Pokaz liste zamowien");
        System.out.println("5. Usuwanie zamowien");
        System.out.println("0. Wyjdz z programu");
    }
    static void showStatusMenu(){
        System.out.println("1. Obecny status");
        System.out.println("2. Zmien na ZLOZONE");
        System.out.println("3. Zmien na PRZYGOTOWANE");
        System.out.println("4. Zmien na W TRANSPORCIE");
        System.out.println("5. Zmien na ZREALIZOWANE");
        System.out.println("6. Anuluj zamowienie");
        System.out.println("7. Wroc do glownego menu");
    }
    static void confirm(){
        System.out.println("Czy na pewno?");
        System.out.println("1. TAK");
        System.out.println("2. NIE");
    }
    static void howToSort(){
        System.out.println("Wybierz opcje z menu");
        System.out.println("Jak chcesz posortowac produkty?");
        System.out.println("1. po nazwie");
        System.out.println("2. po cenie");
        System.out.println("3. wg statusu");
        System.out.println("4. Wyjscie do menu glownego");
        System.out.println("0. Wyjscie z programu");
}
    static void showMenuremoveOrderFromList(){
        System.out.println("Czy chcesz usunac jedna pozycje czy wszystkie ?");
        System.out.println("1. Jedna");
        System.out.println("2. Wszystkie");
        System.out.println("0. Wroc do menu glownego");
    }

    static void choosePositionToRemove(){
        System.out.println("Ktora pozycje chcesz usunac ?");
    }

}
