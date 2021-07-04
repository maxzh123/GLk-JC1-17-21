public class homework20 {
    public static void main(String[] args) {
        int mas[] = {2, 3, 7, 2, 8, 4, 9, 1};
        int maxOcenka=mas[0];
        for (int i=0;i< mas.length;i++){
            if(maxOcenka<mas[i]){
                maxOcenka=mas[i];
                System.out.print("\rиндекс ="+i);//схитрил, подумаю как можно будет сделать по другому
            }
        }
            System.out.print(" с значением ="+maxOcenka);
    }
}