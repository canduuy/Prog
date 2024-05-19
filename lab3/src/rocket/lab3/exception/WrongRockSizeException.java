package rocket.lab3.exception;

public class WrongRockSizeException extends RuntimeException{
    public WrongRockSizeException(){
        super("хз как может быть скала с размером меньше 0");
    }
}
