package Animals;

/**
 * Created by zleha_000 on 17.05.2016.
 */
public class Cat extends Pet {
    @Override
    public void voise() {
        System.out.println("МЯУ мяу МЯУ");
    }

    @Override
    public void zapolnenieSex() {

    }

    @Override
    public void zapolnenieAge() {

    }

    @Override
    public void zapolnenieVes() {

    }

    public Cat(){
        super("Голодный","F",15);

    }

    public Cat getChild(){
        System.out.println("cat????");
        return new Cat();
    }
}
