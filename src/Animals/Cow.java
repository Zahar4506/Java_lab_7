package Animals;

/**
 * Created by zleha_000 on 17.05.2016.
 */
public class Cow {
    public String name = "";

    public Cow() {
        setName("Я корова");
      System.out.println(getName());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
