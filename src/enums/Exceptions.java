package enums;

import java.time.LocalDateTime;

public enum Exceptions {
    INVALID_CHOICE("____Invalid choice. Please choose again!_____");

    INCORRECT_PIN("____Incorrect PIN code. Card blocked after 3 incorrect attempts!_____") {
        
    }

    INVALID_IBAN("____Invalid IBAN. Card not found!_____");


        private String message;
        private int status;
        private final LocalDateTime timestamp = LocalDateTime.now().withNano(0);

      Exceptions (String message){
          this.message=message;
      }

        public String getMessage() {
            return message;
        }


        public LocalDateTime getTimestamp() {
            return timestamp;
        }

        @Override
        public String toString() {
            return "Exceptions{" +
                    "message='" + message + '\'' +
                    ", timestamp=" + timestamp +
                    '}';
        }
    }

