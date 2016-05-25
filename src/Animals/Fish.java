package Animals;

/**
 * Created by zleha_000 on 25.05.2016.
 */
public class Fish extends Pet {
    public Fish() {
        super("Мы рыбы не едим вообще", "F", 5);
    }

    @Override
    public void voise() {
        System.out.println("Буль буль буль");
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
}
