package Class;

import Enums.Adjectives;
import Interface.Describe;

public class Outbreaks extends AbstractClass implements Describe {
    public Outbreaks(String name) {
        super(name);
    }

    @Override
    public String describe() {
        String mean = Adjectives.SHORT.toString() + " " + "вспышками" + ".";
        return mean;
    }
}
