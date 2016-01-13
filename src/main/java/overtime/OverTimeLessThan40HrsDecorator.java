package overtime;

public class OverTimeLessThan40HrsDecorator extends OverTimeWrapperCalculator {
	
	private OverTimeCalculator decorator;
	
	public OverTimeLessThan40HrsDecorator(OverTimeCalculator decorator) {
		this.decorator = decorator;
	}
	
	public double calculateOverTimeBenefits(int weeklyHours) {
		double benefit = 0.0;
		if(weeklyHours < 40) {
			benefit = 0.0;
		}
		return benefit + decorator.calculateOverTimeBenefits(weeklyHours);
	}

}
