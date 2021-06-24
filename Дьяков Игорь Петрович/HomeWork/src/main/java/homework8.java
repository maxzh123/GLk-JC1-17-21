public class homework8 {
    public static void main(String []arg){
        int money=65663;
        System.out.print(money+" ");
        if (money%10==1)
        {System.out.println("рубль");
        }
        else if (money%10>1&&money%10<5)
        {System.out.println("рубля");
        }
        else{
            System.out.println("рублей");

        }
    }
}
