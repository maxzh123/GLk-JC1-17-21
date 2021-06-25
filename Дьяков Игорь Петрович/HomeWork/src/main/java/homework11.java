public class homework11 {
    public static void main(String[]arg){
        int day=3;
        nedel(day);
            }
    private static void nedel(int a){
        switch (a) {
            case 1:
                System.out.println("понедельник");
                System.out.println("сделать 6 задание из beginer task");
                break;
            case 2:
                System.out.println("вторник");
                System.out.println("понедельник день тяжелый,выполняем дела понедельника, если не хотим, то делаем задачи из тетради");
                break;
            case 3:
                System.out.println("среда");
                System.out.println("Если есть время то делаем что успеем из тетради");
                break;
            case 4:
                System.out.println("четверг");
                System.out.println("пробуем разобрать 6 задание из beginer task");
                break;
            case 5:
                System.out.println("пятница");
                System.out.println("Делаем задачи из тетради, пытаемся нагнать занятия");
                break;
            case 6:
                System.out.println("суббота");
                System.out.println("Шашлычки, речка, пиво, гараж??, а нет, Задания из тетрадочки");
                break;
            case 7:
                System.out.println("воскресенье");
                System.out.println("днем ремонт, вечером java");
                break;
            default:
                System.out.println("неделя не резиновая в ней всего 7 дней");

        }

    }
}
