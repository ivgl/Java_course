public class MyFirstException extends Exception {
    // Конструктор по умолчанию
    public MyFirstException() {
        super();
    }

    // Конструктор с сообщением об ошибке
    public MyFirstException(String message) {
        super(message);
    }

    // Конструктор с сообщением об ошибке и причиной
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }

    // Конструктор с причиной
    public MyFirstException(Throwable cause) {
        super(cause);
    }
}

/*
Конструктор по умолчанию:
public MyFirstException(): Вызывает конструктор по умолчанию суперкласса Exception.

Конструктор с сообщением об ошибке:
public MyFirstException(String message): Вызывает конструктор суперкласса Exception с сообщением об ошибке.

Конструктор с сообщением об ошибке и причиной:
public MyFirstException(String message, Throwable cause): Вызывает конструктор суперкласса Exception с сообщением об ошибке и причиной.

Конструктор с причиной:
public MyFirstException(Throwable cause): Вызывает конструктор суперкласса Exception с причиной.
 */