package OurStory;
import Class.*;
public class FrekenSnorkDontGoException extends RuntimeException{
    private FrekenSnork frekenSnork;
    public FrekenSnorkDontGoException(FrekenSnork freken, String message){
        super(message);
        this.frekenSnork = freken;
    }
}
