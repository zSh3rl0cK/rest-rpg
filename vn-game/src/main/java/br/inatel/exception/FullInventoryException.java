package br.inatel.exception;

public class FullInventoryException extends RuntimeException {
    public FullInventoryException(String message) {
        super(message);
    }
}
