package libreria.spring.LibreriaSpring.excepciones;


public class EditorialServiceException extends Exception {

    /**
     * Creates a new instance of <code>EditorialServiceException</code> without detail message.
     */
    public EditorialServiceException() {
    }

    /**
     * Constructs an instance of <code>EditorialServiceException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public EditorialServiceException(String msg) {
        super(msg);
    }
}
