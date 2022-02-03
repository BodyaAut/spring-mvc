package web.model;

public class Car {
    private String model;
    private int number;
    private int age;

    public Car() {}

    public Car(String model, int number, int age) {
        this.model = model;
        this.number = number;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", age=" + age +
                '}';
    }
}
