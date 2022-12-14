package Class;

import Enums.Adjectives;
import Enums.Adverbs;
import Interface.Describe;

public class Circle extends AbstractClass implements Describe, AbstractClass.ActionCircle {
    public Circle(String name) {
        super(name);
    }
    @Override
    public String describe() {
        String mean = this.getName() + " " + "от" + " " + Adjectives.POCKET.toString() + " " + "фонарика" + " ";
        return mean;
    }

    @Override
    public void run() {
        System.out.print("бегал" + " " + Adverbs.UPDOWN.toString() + " " + "по стенам и" + " ");
    }

    @Override
    public void stop() {
        System.out.print("остановился" + " " + Adverbs.FINISH.toString() + " " + "на" + " " + Adjectives.MAGIC.toString()
                + " " + "слове \"Гардеробная\"" + "." + "\n");

    }
}
