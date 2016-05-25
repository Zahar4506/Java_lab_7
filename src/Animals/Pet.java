package Animals;

/**
 * Created by zleha_000 on 25.05.2016.
 */
public abstract class Pet extends MyReader{
    //поля вес, пол, возраст, строка заполнения
    private String name = null;
    private int age = 0;
    private String hungry = null;


    //Конструктор
    public Pet(String hungry, String sex, int age) {
        this.hungry = hungry;
        this.name = sex;
        this.age = age;
    }
    public abstract void voise();

    public String getHungry() {
        return hungry;
    }

    public void setHungry(String hungry) {
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //Алгоритм ввода пола
    public abstract void zapolnenieSex();

    //Алгоритм ввода возраста
    public abstract void zapolnenieAge();

    //Алгоритм ввода веса
    public abstract void zapolnenieVes();

}
