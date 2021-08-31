package examTasks.Task4;

import java.util.Random;

    public enum Names {
        Катя, Оля, Петя, Вася, Миша, Маша, Вероника, Сергей, Вячеслав, Коля, Веня;

        static Names[] names= Names.values();
        static Random random=new Random();

        public static Names getNames() {
            int i=random.nextInt(names.length);
            return names[i];
        }
    }
