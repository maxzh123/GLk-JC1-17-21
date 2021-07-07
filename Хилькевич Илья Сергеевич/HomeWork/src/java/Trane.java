public class Trane {
       public static void main(String[] arg) {}}
/*             int x = 3;
             while (x > 0) { // можно убрать  2 строки или while
                     if (x > 2) {
                            System.out.print("a");
                     }
                    x = x - 1;
                     System.out.print("-");
                     if (x == 2) {
                            System.out.print("b c");
                 //           x = x - 1;              //
                  //          System.out.print("-");  //можно убрать эти 2 строки или while
                     }
                     if (x == 1) {
                            System.out.print("d");
                            x = x - 1;
                     }

              }

       }
}*/ // a-b c-d (загадка)
/*            String[] world1 = {"круглосуточный", "трех-звенный", "взаимный", "обоюдный выйгрыш", "фронтэнд", "на основе IT ьехнологий", "проникающий", "умный", "системный", "динамичный", "активный", "бэкэнд"};
              String[] world2 = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный", "фирменный", "нестандартный ум", "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на", "общий", "совместный", "ускоренный"};
              String[] world3 = {"в процессе", "и конечный результат", "выход из положения", "тип структуры", "талант", "подход", "уровень завоевания внимания", "портал", "период времени", "обзор", "образец", "пункт следования", "результат", "поток данных"};
              int oneWorld = world1.length;
              int twoWorld = world2.length;
              int threeWorld = world3.length;
              System.out.println(twoWorld + "  " + oneWorld + "  " + threeWorld);

    //        System.out.println(world1[0]+ "  " +world2[0]+ "  " +world3[0]);       // выдергиваем элемент массива

              int rand1 = (int) (Math.random() * oneWorld);
              int rand2 = (int) (Math.random() * twoWorld);
              int rand3 = (int) (Math.random() * threeWorld);
              String phrase = world1[rand1] + " " + world2[rand2] + " " + world3[rand3];
              System.out.println("Все что нам нужно-это " + phrase);**/ // генератор случайных фраз
/*        int f = 5;
        Integer x = f;
        System.out.println(x);
    }
}**/ // int и Integer
/*   int x=5;
     int y=2;
     int t= x-y;
     System.out.println(t);}}
  **/ // простое вычитание
/*       String q="12345";
        String q2=new String("12345");
        System.out.println(q.equals(q2));
    }
 }**/ // сравнение equals
/*   String num="8";
     int x=Integer.parseInt(num);**/ // строковое значение 8 преобразуем в число 8
/*int x=1;
while (x<3){
       System.out.print("Doo");
       System.out.print("Bee");
       x=x+1;
}
if (x==3){
       System.out.print("Do");
}}}**/ // задачка DooBee
/*              int Beernum = 99;
              String world = " бутылок";
              while (Beernum > -1) {
                     if (Beernum == 1 ) {
                           world = " бутылка";}
                            System.out.println(Beernum + "" + world + " пива на стене");
                            System.out.println(Beernum + world + " пива");
                            System.out.println(" Возьми другую");
                            System.out.println(" Пусти по кругу");
                            Beernum = Beernum - 1;}
                            if(Beernum==0){
                                   System.out.println(Beernum + "" + world + " пива на стене");
                     } else{
                            System.out.println("Нет бутылок на стене");
                            }
                     }
              }**/ // песенка про 99 бутылкок




