package service;

public class UsaInterestService implements InterestService {
	
	private Double interestRate;

	public UsaInterestService(Double interesrRate) {
		this.interestRate = interesrRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
	

}
