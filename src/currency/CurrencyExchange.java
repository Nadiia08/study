package currency;

public class CurrencyExchange {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(36);
        Som som = new Som(1000);
        Currency workingCurrency;


        ListOfCurrency.addCurrency(dollar);
        ListOfCurrency.addCurrency(som);
        ListOfCurrency.addCurrency(new Euro(38));

        final int EXIT_NUMBER = 100;
        int currencyNumber;

        do {
            MenuCurrency.printCurrencyMenu();
            currencyNumber = MenuCurrency.getNumberFromConsole();
//            System.out.println("Currency "+currencyNumber);
            if (currencyNumber == 0) {
                System.out.println("Wrong currency. Try again!");
                continue;
            } else if (currencyNumber != EXIT_NUMBER) {
                workingCurrency = MenuCurrency.setCurrency(currencyNumber);

//          System.out.println("Working currency is "+ workingCurrency.getCurrencyName()+ " kurs NBU "+ workingCurrency.getKursNBU());
                boolean exitFromActionMenu;
                do {
                    MenuActions.printActionsMenu(workingCurrency);
                    int menuNumber = MenuActions.getNumberFromConsole();
                    exitFromActionMenu = menuNumber != EXIT_NUMBER;
                    if(exitFromActionMenu) {
//                        System.out.println("Menu number " + menuNumber);
                        MenuActions.doActionsWithCurrency(workingCurrency, menuNumber);
                    }
                } while (exitFromActionMenu);


            }
        } while (currencyNumber != EXIT_NUMBER);

        System.out.println("-------Good bye-------");
    }
}
