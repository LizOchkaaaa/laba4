package OurStory;
import Class.*;

public class FrekenSnorkDontPurseException extends Exception{
    private FrekenSnork frekenSnork;
    public FrekenSnorkDontPurseException(FrekenSnork freken, String message){
        super(message);
        this.frekenSnork = freken;
    }
}
