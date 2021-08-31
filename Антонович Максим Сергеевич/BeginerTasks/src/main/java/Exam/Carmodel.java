package Exam;

import java.util.Random;

public enum Carmodel {
   Вольва , Пежо , Мерс, Волга, Ауди;

   static Carmodel[] carmodels=Carmodel.values();
   static Random random=new Random();

   public static Carmodel getCarmodel() {
      int i=random.nextInt(carmodels.length);
      return carmodels[i];
   }
}
