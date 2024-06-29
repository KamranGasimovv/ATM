package exceptions;

import enums.Exceptions;

public class GeneralException extends RuntimeException {
    public GeneralException(Exceptions exception){
        super(exception.toString());
    }
}
