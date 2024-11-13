package RealTime;

class FraudulentClaimException extends RuntimeException {
    public FraudulentClaimException(String message) {
        super(message);
    }
}

class InvalidClaimAmountException extends RuntimeException {
    public InvalidClaimAmountException(String message) {
        super(message);
    }
}

class ClaimProcessingSystem {

    public void validateClaimAmount(double claimAmount, double policyCoverage) {
        if (claimAmount <= 0 || claimAmount > policyCoverage) {
            throw new InvalidClaimAmountException("Claim amount is invalid. Must be positive and within policy coverage.");
        }
    }

    public void validateClaimDate(String claimDate, String policyStartDate, String policyEndDate) {
        if (claimDate.compareTo(policyStartDate) < 0 || claimDate.compareTo(policyEndDate) > 0) {
            throw new FraudulentClaimException("Claim date is outside of the policy coverage period.");
        }
    }

    public void processClaim(double claimAmount, double policyCoverage, String claimDate, String policyStartDate, String policyEndDate) {
        validateClaimAmount(claimAmount, policyCoverage);
        
        validateClaimDate(claimDate, policyStartDate, policyEndDate);

        System.out.println("Claim processed successfully!");
    }
}

public class Main {
    public static void main(String[] args) {
        ClaimProcessingSystem system = new ClaimProcessingSystem();

        try {
            system.processClaim(5000, 10000, "2024-01-15", "2023-01-01", "2024-12-31");

            system.processClaim(15000, 10000, "2024-05-10", "2023-01-01", "2024-12-31");
        } catch (InvalidClaimAmountException e) {
            System.err.println("Error: " + e.getMessage());
            System.out.println("Notification: Claims department alerted for invalid claim amount.");
        } catch (FraudulentClaimException e) {
            System.err.println("Error: " + e.getMessage());
            System.out.println("Notification: Claims department alerted for fraudulent claim.");
        }

        try {
            system.processClaim(3000, 10000, "2025-01-01", "2023-01-01", "2024-12-31");
        } catch (InvalidClaimAmountException e) {
            System.err.println("Error: " + e.getMessage());
            System.out.println("Notification: Claims department alerted for invalid claim amount.");
        } catch (FraudulentClaimException e) {
            System.err.println("Error: " + e.getMessage());
            System.out.println("Notification: Claims department alerted for fraudulent claim.");
        }
    }

    
}
