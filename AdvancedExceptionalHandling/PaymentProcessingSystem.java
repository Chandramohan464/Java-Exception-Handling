package RealTime;

class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

class InvalidPaymentDetailsException extends RuntimeException {
    public InvalidPaymentDetailsException(String message) {
        super(message);
    }
}

public class PaymentProcessingSystem {
    public void processPayment(String paymentMethod, double amount) throws PaymentFailedException {
        try {
            validatePaymentDetails(paymentMethod, amount);

            boolean transactionSuccessful = performTransaction(paymentMethod, amount);

            if (transactionSuccessful) {
                System.out.println("Payment of $" + amount + " via " + paymentMethod + " was successful.");
            } else {
                throw new PaymentFailedException("Payment transaction failed due to insufficient funds.");
            }

        } catch (InvalidPaymentDetailsException e) {
            logError("Invalid payment details: " + e.getMessage());
            throw e; 
        } catch (PaymentFailedException e) {
            logError("Payment transaction failed: " + e.getMessage());
            throw e; 
        }
    }

    private void validatePaymentDetails(String paymentMethod, double amount) {
        if (paymentMethod == null || paymentMethod.isEmpty()) {
            throw new InvalidPaymentDetailsException("Payment method is not provided.");
        }

        if (amount <= 0) {
            throw new InvalidPaymentDetailsException("Payment amount must be greater than zero.");
        }

        if (!paymentMethod.equalsIgnoreCase("credit card") && 
            !paymentMethod.equalsIgnoreCase("debit card") && 
            !paymentMethod.equalsIgnoreCase("net banking")) {
            throw new InvalidPaymentDetailsException("Unsupported payment method: " + paymentMethod);
        }
    }

    private boolean performTransaction(String paymentMethod, double amount) {
        return amount <= 1000;
    }

    private void logError(String errorMessage) {
        System.err.println("LOG (AUDIT): " + errorMessage); 
    }

    public static void main(String[] args) {
        PaymentProcessingSystem paymentSystem = new PaymentProcessingSystem();

        try {
            paymentSystem.processPayment("credit card", 500);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            paymentSystem.processPayment("paypal", 200);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            paymentSystem.processPayment("debit card", -100);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            paymentSystem.processPayment("net banking", 1500);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
