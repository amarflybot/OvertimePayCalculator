package overtime;

public class Division {

	private OverTimeCalculator overTimeCalculator;
	
	public Division(OverTimeCalculator overTimeCalculator) {
		this.overTimeCalculator = overTimeCalculator;
	}

	public OverTimeCalculator getOverTimeCalculator() {
		return overTimeCalculator;
	}

	public void setOverTimeCalculator(OverTimeCalculator overTimeCalculator) {
		this.overTimeCalculator = overTimeCalculator;
	}
	
	public double getOverTimeBenefits(int weeklyHours) {
		return overTimeCalculator.calculateOverTimeBenefits(weeklyHours);
	}

}
