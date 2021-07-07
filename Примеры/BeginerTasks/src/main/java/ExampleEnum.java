public class ExampleEnum {
    public static void main(String... str){
        Еда[] vals=Еда.values();
        for(Еда i:vals){
            System.out.println(i);
        }
        Еда.Курочка.setVal1(3);
        Еда i=null;
        try {
            i = Еда.valueOf("Курочка");
//            throw new RuntimeException("dfg");
        }catch(Throwable e){
            e.printStackTrace();
        }

        System.out.println(i.getVal1());
        System.out.println(Еда.Каша.getVal1());

    }
}
