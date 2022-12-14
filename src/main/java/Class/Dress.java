package Class;
import Enums.Adjectives;
import Enums.Adverbs;
import Interface.*;

public class Dress extends AbstractClass implements Describe, ActionDress {
    private static int count = 1000;
    public Dress(String name) {
        super(name);
    }
    @Override
    public String describe() {
        String mean = "Платья" + "," + " " + Adverbs.EVERYWHERE.toString() + " " + "платья" + " ";
        return mean;
    }

    private class Brocade {
        public void describe() {
                System.out.print(Adjectives.HEAVY.toString() + "," + " "  + Adjectives.SPARKLING.toString() + " " + "парча" + ",");
            }
        }

     private class Tulle{
         public void describe1() {
             System.out.print(" " + Adjectives.EASY.toString() + " " + "облачка тюля" + " ");
         }
     }
    private class Fluff{
        public String describe() {
            String mean = "и" + " " + Adjectives.SWAN.toString() + " " + "пух" + "," + "\n";
            return mean;
        }
    }
    private class Silk{
        public void describe2() {
            System.out.print(Adjectives.PRINTED.toString() + "," + " " + Adjectives.MULTICOLORED.toString()
                    + " " + "шелк" + " " + "и");
        }
    }

    private class Velvet{
        public void describe3() {
            System.out.print(" " + Adjectives.BLACK.toString() + " " + "бархат" + ".");
        }
    }
    @Override
    public void hung() {
        Brocade brocade = new Brocade();
        Tulle tulle = new Tulle();
        Fluff fluff = new Fluff();
        Silk silk = new Silk();
        Velvet velvet = new Velvet();
        System.out.print("висели" + " " + Adverbs.ENDKESS.toString() +  " " + Adverbs.FIRST.toString() + " "
                +  "за" + " " + Adverbs.SECOND.toString() + ":");
        brocade.describe();
        tulle.describe1();
        System.out.print(fluff.describe());
        silk.describe2();
        velvet.describe3();
    }

    public static class Sequins implements ActionSequins {
        private static boolean flicker = true;

        @Override
        public void flicker(boolean mean) {
            if (mean == true) {
                System.out.print(Adverbs.EVERYWHERE.toString() + " " + Adjectives.MULTICOLORED.toString() + " " + "блестки" + " ");
                System.out.print("мерцали" + " " + count + " " + "огнями" + "," + " ");
            } else {
                System.out.print("");
            }
        }
        @Override
        public void winked(Sequins flicker) {
            if (Sequins.flicker==true) {
                System.out.print("перемигивались" + " ");
            }else{
                System.out.print("не перемигивались" + " ");
        }
    }

}
    @Override
    public void rustle() {
        System.out.print(" " + this.getName() + " " + "шуршали" + " ");
    }

    @Override
    public void smell() {
        System.out.print("и" + " " + "пахли пылью и духами");
    }

    @Override
    public void envelop() {
        System.out.print(" " + "и" + " " + "окутывали" + " ");
    }
}
