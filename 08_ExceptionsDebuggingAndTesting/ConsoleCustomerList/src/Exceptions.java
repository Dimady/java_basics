public class Exceptions {

    static class CommandException extends Exception {

        public CommandException(String message) {
            super(message);
        }
    }

    static class PhoneException extends Exception {

        public PhoneException(String message) {
            super(message);
        }
    }

    static class EmailException extends Exception {

        public EmailException(String message) {
            super(message);
        }
    }

}

