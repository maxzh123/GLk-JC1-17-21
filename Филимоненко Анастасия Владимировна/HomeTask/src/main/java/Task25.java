public class Task25 {
    public static void main(String[] args) {
        int coins20;
        int coins50;
        int coins100;
        int allMoney;

    }

    public Task25(int coins20, int coins50, int coins100){
        coins20 = 0;
        coins50 = 0;
        coins100 = 0;
    }
    public static void addMoney(int coins20, int coins50, int coins100, int addcoins20, int addcoins50, int addcoins100){
        coins20 += addcoins20;
        coins50 += addcoins50;
        coins100 += addcoins100;
        int allAddCons = addcoins20 * 20 + addcoins50 * 50 + addcoins100 * 100;
        int allCoins = coins20 * 20 + coins50 * 50 + coins100 * 100;

    }

    public static boolean takeAwayMoney(int sum, int coins20, int coins50, int coins100){
        if(sum > coins20 * 20 + coins50 * 50 + coins100 * 100){
            sum -= coins20 * 20 + coins50 * 50 + coins100 * 100;
            return true;
        }else return false;

    }
}
