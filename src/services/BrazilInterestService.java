package services;

import java.security.InvalidParameterException;

public class BrazilInterestService {
    private Double interestRate;

    public BrazilInterestService() {
    }

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double payment(double ammount, int months){
        if(months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }

        return ammount * Math.pow(1.0 + interestRate / 100.0, months);
    }
}
