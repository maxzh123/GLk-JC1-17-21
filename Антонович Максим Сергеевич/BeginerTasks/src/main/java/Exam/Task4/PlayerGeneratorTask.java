package Exam.Task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class PlayerGeneratorTask extends Thread implements Serializable {
//
//    public List<Player> returnCollection () {
//        List<Player> players = new ArrayList<Player>();
//        for (int i = 0; i <10; i++){
//            players.add(new Player(Names.getNames(), (int) (20 + Math.random() * 40), true));
//        }
//        return players;
//    }
    public void run(){
        System.out.printf("%s Started... \n", Thread.currentThread().getName());
        try {
            Random random = new Random();
            List<Player> players1 = new ArrayList<Player>();
            for (int i = 0; i <10; i++){
                players1.add(new Player(Names.getNames(), (int) (20 + Math.random() * 40), random.nextBoolean()) );

            }
            File file = new File ("D:\\Всякое\\1\\FileForTask4.txt");
            FileWriter fileWriter = new FileWriter(file);
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write(String.valueOf(players1));
            }
        }
        catch (IOException e){
            System.out.println("something happened");
        }
        System.out.printf("%s Fiished... \n", Thread.currentThread().getName());
    }
}
