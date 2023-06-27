package class20;

class AgeNotEligibleException extends Exception {
    public AgeNotEligibleException(String message) {
        super(message);
    }
}

public class VotingExample {
    public static void main(String[] args) {
        try {
            vote(17);
        } catch (AgeNotEligibleException e) {
            throw new RuntimeException(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }

    public static void vote(int age) throws AgeNotEligibleException,ArrayIndexOutOfBoundsException {
        if (age < 18) {
            throw new AgeNotEligibleException("test message");
        }
        System.out.println("Voting...");
    }
}

