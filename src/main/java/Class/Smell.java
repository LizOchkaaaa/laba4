package Class;

import Enums.Adjectives;
import Interface.Describe;

public class Smell extends AbstractClass implements Describe {
    public Smell(String name) {
        super(name);
    }

    @Override
    public String describe() {
        String mean = Adjectives.INVITING.toString() + " " + "и" + " " + Adjectives.SWEET.toString()
                    + " " + this.getName() + " " + "пудры." + "\n";
            return mean;
    }
}
