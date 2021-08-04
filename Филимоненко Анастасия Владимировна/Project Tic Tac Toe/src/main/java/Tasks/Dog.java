package Tasks;

public class Dog {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void main(String[] args) {
        Dog dog = new Dog("Седрик");
        dog.putCollar();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем экипировку. Где ошейник?" + dog.isCollarPutOn + "/r/n Поводок?" + dog.isLeashPutOn + "r/n/ Намордник?" + dog.isMuzzlePutOn);
        }
    }
        public void putCollar() {

            System.out.println("Ошейник надет!");
            this.isCollarPutOn = true;
        }

        public void putLeash() {

            System.out.println("Поводок надет!");
            this.isLeashPutOn = true;
        }

        public void putMuzzle () {
            System.out.println("Намордник надет!");
            this.isMuzzlePutOn = true;
        }

        public void walk () throws DogIsNotReadyException {

            System.out.println("Собираемся выгуливать пёселя!");
            if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
                System.out.println("Ну наконец-то! " + name + " безумно счастлив, возможно, я не помечу твои тапки!");
            } else {
                throw new DogIsNotReadyException("Собака " + name + " не готова к прогулке! Проверьте экипировку!");
            }
        }

    }