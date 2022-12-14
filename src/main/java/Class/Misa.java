package Class;

import Enums.Adjectives;
import Interface.ActionMisa;

public class Misa extends AbstractClass implements ActionMisa {
    public Misa(String name) {
        super(name);
    }
    @Override
    public void sad() {
        System.out.print(" " + this.getName() + " " + "грустила" + " ");
    }

    @Override
    public void say() {
        System.out.print(this.getName() + " " + "издала" + " " + Adjectives.STRANGER.toString() + " " + "звук" + "." + "\n");
    }
    @Override
    public void silent(){
        System.out.print("Потом" + this.getName() + " " + "и" + "Фрекен Снорк" + " " + "помолчали");
    }
}
