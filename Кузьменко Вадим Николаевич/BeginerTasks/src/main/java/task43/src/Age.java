public class Age {
    private int age;

    public int getAge() {
        return age;

    }

    public void setAge(int age) throws AgeException {
        if (age<18) {
            throw new AgeException("YouVeryYoung");
        }
        this.age = age;
    }
}
