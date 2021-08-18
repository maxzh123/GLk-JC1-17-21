package enumIteration;

public enum TestEnum {
    VALUE1,VALUE2;
    static TestEnum getFromString(String val){
        for(TestEnum v:values()){
            if (val.contains(v.name())){return v;}
        }
        return null;
    }
}
