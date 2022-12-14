package Class;
import Enums.Adjectives;
import Enums.Adverbs;
import Interface.ActionFrekenSnork;
import Interface.Describe;
import OurStory.*;

public class FrekenSnork extends AbstractClass implements ActionFrekenSnork, Describe {
    public FrekenSnork(String name) {
        super(name);
    }

    @Override
    public void slippeout() {
        System.out.print(this.getName() + " " + Adverbs.SILENTLY.toString()
                + " " + "выскользнула" + " " + Adverbs.BACK.toString() + " " + "в коридор" + ".");
    }

    @Override
    public void understand(boolean mean) {
        if (mean == true) {
            System.out.print(this.getName() + " " + "поняла" + "," + "что" + " " + "Мисе" + " "  + "лучше побыть одной.");
        } else {
            System.out.print(this.getName() + " " + "не поняла");
        }
    }

    @Override
    public void go(boolean mean) {
        if (mean == false) {
            System.out.print("Но" + " " + Adverbs.ROUND.toString() + " " + "в зал" + " " +
                    this.getName() + " " + "не пошла" + "." + "\n" + this.getName() + " " + "пошла" +
                    " " + Adverbs.FARTHER.toString() + " " + "по коридору" );
        }else {
            System.out.print("И" + " " + Adverbs.ROUND.toString() + " " + "пошла" + " " +
                    this.getName() + " " + "в зал" + " ");
            throw new FrekenSnorkDontGoException(this, "к" + " ");
        }
    }
    @Override
    public void feel(boolean mean) {
        if(mean==true){
            System.out.print("," + "потому что" + " " + "почувствовала" + " ");
        }
        else{
            System.out.print(".");
        }
    }

    @Override
    public void pusre(boolean mean) throws FrekenSnorkDontPurseException {
        if(mean==true){
            System.out.print(this.getName() + " " + "нажала" + " " + "ручку двери" + " " + "и" + " ");
            System.out.print("вошла" + ".");
        }
        else{
            System.out.print(this.getName() + " " + "осталась" + " " + "в коридоре" + ".");
            throw new FrekenSnorkDontPurseException(this, getName() + " " + "тронула" + " " + "ручку двери");
        }
    }

    @Override
    public void come() {
        System.out.print(" " + Adjectives.STUNNED.toString() + " " + this.getName() + " " + "подошла" + " "
                + Adverbs.NEAR.toString() + "." + "\n");
    }

    @Override
    public String describe() {
        String mean = Adjectives.STUNNED.toString() + " ";
        return mean;
        }
    @Override
    public void caress() {
        System.out.print(this.getName() + " " + "ласкала" + " " + "платья" + ",");
    }

    @Override
    public void hug() {
        System.out.print(" " + "заключала в объятия");
    }

    @Override
    public void burrow() {
        System.out.print("," + " " + "зарывалась мордочкой");
    }

    @Override
    public void press() {
        System.out.print("," + " " + "прижимала к груди" + ".");
    }

    @Override
    public String release() {
        String mean = Adverbs.SUDDENLY.toString() + " " + this.getName() + " " + "выпустила из лапок" + " ";
        return mean;
    }

    @Override
    public void stand() {
        System.out.print(" " + "и" + " " + Adverbs.LITTLE.toString() + " " + "постояла на голове" + ".");
    }
}


