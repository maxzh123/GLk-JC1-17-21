package WorkBookTask.Task_34;

public class AbstractJobStructure implements JobStructure {
    protected static int salary=500; //некий оклад

    private String position; // поле должности
    private String paymentMethod; // поле метод оплаты

   public AbstractJobStructure(String position,String paymentMethod){
       this.position=position;
       this.paymentMethod=paymentMethod;
   }

   public String getPosition(){
       return this.position;
   }
   public String getPaymentMethod(){
       return this.paymentMethod;
   }


    @Override
    public void doSalary() {
        System.out.println("Дорогой согласно вашей должности '"+ getPosition()+"' и метода оплаты '"+getPaymentMethod());
        System.out.println("Вам начислено: "+ salary);

    }
}
