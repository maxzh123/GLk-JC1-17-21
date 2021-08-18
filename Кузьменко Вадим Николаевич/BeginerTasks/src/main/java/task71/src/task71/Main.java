package task71;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Class clss = Class.forName("task70.ManS");
        Constructor c=clss.getDeclaredConstructor(new Class[]{});
        Object mans=c.newInstance();
        Object mans2=new ManS("Совсем не вредная",0,"Настя!");
        Field[] flds=clss.getDeclaredFields();
        for(Field f:flds){
            System.out.print(f.getName());
            System.out.print(" ");
            System.out.print(f.getType());
            System.out.print(" ");
            f.setAccessible(true);
            System.out.print(f.get(mans));
            System.out.print(":");
            System.out.print(f.get(mans2));
            System.out.println();
            if (f.getType()==int.class){
                f.set(mans2,15);
            }
        }
        Method[] methods = clss.getDeclaredMethods();
        for (Method method : methods) {
            System.out.printf("%s %s %s\n",Modifier.toString(method.getModifiers()),method.getReturnType().getName(),method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.printf("\t%s -> %s\n",
                        parameter.getName(),parameter.getType().getName());
                method.invoke(mans,new Object[]{"привет"});
                method.invoke(mans2,new Object[]{"привет"});
            }
        }
    }
}
