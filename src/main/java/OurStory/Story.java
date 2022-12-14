package OurStory;
import Class.*;
import Interface.*;

public class Story {
    public static void main(String[] args) {
        FrekenSnork frekensnork = new FrekenSnork("Фрекен Снорк");
        Dress dress = new Dress("платья");
        Misa misa = new Misa("Миса");
        MoomiMama moomimama = new MoomiMama("Муми-мама");
        frekensnork.slippeout();
        frekensnork.understand(true);

        try {
            frekensnork.go(false);
            frekensnork.feel(true);
            Smell smell = new Smell("запах");
            System.out.print(smell.describe());
        } catch (FrekenSnorkDontGoException var) {
            System.out.print(var.getMessage());
            System.out.print(misa.getName() + ".");

        }

        Circle circle = new Circle("Кружок света");
        System.out.print(circle.describe());
        circle.run();
        circle.stop();

        try {
            frekensnork.pusre(true);
            System.out.print(dress.describe());
            dress.hung();
            Dress.Sequins sequins = new Dress.Sequins();
            Outbreaks outbreaks = new Outbreaks("вспышки");
            sequins.flicker(true);
            sequins.winked(sequins);
            System.out.print(outbreaks.describe());
            frekensnork.come();
            frekensnork.caress();
            frekensnork.hug();
            frekensnork.burrow();
            frekensnork.press();
            Folds folds = new Folds("складками");
            dress.rustle();
            dress.smell();
            dress.envelop();
            System.out.print(frekensnork.getName() + " " + folds.describe()
                    + "." + "\n");
            System.out.print(frekensnork.release() + dress.getName());
            frekensnork.stand();
        } catch (FrekenSnorkDontPurseException var) {
            System.out.print(var.getMessage());
            System.out.print(" " + "и" + " " + "застыла" + ".");
        }


        System.out.print("Перед обедом");
        misa.sad();
        System.out.print("в углу зала.");
        misa.say();
        System.out.print("Потом" + " ");
        ActionSnorkAndMisa actionSnorkAndMisa = new ActionSnorkAndMisa() {
            @Override
            public void silent() {
                System.out.print(frekensnork.getName() + " " + misa.getName() + " " + "помолчали");
            }

            @Override
            public void see(boolean mean) {
                if (mean == true) {
                    System.out.print(" " + "и" + " " + "смотрели");
                } else {
                    System.out.print(" " + "и" + " " + "отвернулись" + ".");
                }
            }
        };
        actionSnorkAndMisa.silent();
        actionSnorkAndMisa.see(true);
        moomimama.cover();
    }
}