package Animals;

/**
 * Created by zleha_000 on 17.05.2016.
 */
public class Dog extends Cat {
    @Override
    public Dog getChild(){
        System.out.println("dog????");
        return new Dog();
    }
}
