package Exception;

public class NameTooShortException extends Exception{
    public NameTooShortException(int nameSize){
        super("Name too short, it nedd to be of "+nameSize+
                "characters at least!");
    }
}
