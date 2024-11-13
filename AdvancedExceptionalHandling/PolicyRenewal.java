package RealTime;

class PolicyExpiredException extends Exception{
    String message;

    PolicyExpiredException(String message){
        this.message=message;
    }

    public String getMessage(){
        return message;
    }
}

class PaymentPendingException extends Exception{
    String message;

    PaymentPendingException(String message){
        this.message=message;
    }

    public String getMessage(){
        return message;
    }
}

class NonComplianceException extends Exception{
    String message;

    NonComplianceException(String message){
        this.message=message;
    }

    public String getMessage(){
        return message;
    }
}

public class PolicyRenewal {
    boolean isPolicyActive;
    boolean isPaymentComplete;
    boolean isCompliant;

    public PolicyRenewal(boolean isPolicyActive, boolean isPaymentComplete, boolean isCompliant) {
        this.isPolicyActive = isPolicyActive;
        this.isPaymentComplete = isPaymentComplete;
        this.isCompliant = isCompliant;
    }

    public void renewPolicy() throws PolicyExpiredException, PaymentPendingException, NonComplianceException {
        if (!isPolicyActive) {
            throw new PolicyExpiredException("The policy has expired.");
        }

        if (!isPaymentComplete) {
            throw new PaymentPendingException("Payment is pending for the policy.");
        }

        if (!isCompliant) {
            throw new NonComplianceException("Policyholder is not compliant with renewal terms.");
        }

        System.out.println("Policy renewed successfully!");
    }

    public static void main(String[] args) {
        PolicyRenewal policy1 = new PolicyRenewal(false, true, true); 
        PolicyRenewal policy2 = new PolicyRenewal(true, false, true); 
        PolicyRenewal policy3 = new PolicyRenewal(true, true, false); 
        PolicyRenewal policy4 = new PolicyRenewal(true, true, true);  

        handlePolicyRenewal(policy1);
        handlePolicyRenewal(policy2);
        handlePolicyRenewal(policy3);
        handlePolicyRenewal(policy4);
    }

    public static void handlePolicyRenewal(PolicyRenewal policy) {
        try {
            policy.renewPolicy();
        } catch (PolicyExpiredException e) {
            System.out.println("Notification to policyholder: " + e.getMessage());
        } catch (PaymentPendingException e) {
            System.out.println("Notification to policyholder: " + e.getMessage());
        } catch (NonComplianceException e) {
            System.out.println("Notification to policyholder: " + e.getMessage());
        }
    }
}
