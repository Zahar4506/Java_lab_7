package Animals;

/**
 * Created by zleha_000 on 17.05.2016.
 */
public class Whale extends Cow {
    @Override
    public String getName() {
        setName("Я кит, а не корова");
        return super.getName();
    }

    public Whale() {

    }
}
