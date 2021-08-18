package task33;

public class DebitCard extends AbstractBankCard{
    public static int salary=1500;
    int cardBalance;


    public DebitCard(String type, int cardBalance) {
        super(type);
        this.cardBalance =cardBalance;
    }
    @Override
    public String getType()
    {
        return "зарплатная карточка";
    }

    @Override
    public int addMoney() {
        return cardBalance+salary;
    }
    @Override
    public int takeOffMoney() {
        return (salary-(int)(0.9*salary)); //откладываем 10 процентов с зарплаты
    }

    @Override
    public  void printInfo() {
        System.out.println("Это "+getType()+", на текущий момент ее баланс составляет: "+cardBalance+", в последний день месяца" +
                " поступит зарплата и баланс карточки составит "+addMoney()+". В копилку на море поступит "+ takeOffMoney());
    }
    private static void someClass() {
        System.out.println("Это просто статический класс");
    }
}
