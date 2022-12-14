package Class;

import Enums.Adjectives;
import Interface.Describe;

public class Folds extends AbstractClass implements Describe {
    public Folds(String name) {
        super(name);
    }
    @Override
    public String describe() {
        String mean = Adjectives.SOFT.toString() + " " + "складками";
        return mean;
    }
}
