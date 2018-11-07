package services;

public class UsalInterestService implements InterestService{
    private Double interestRate;

    public UsalInterestService() {
    }

    public UsalInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
