package overtime;

public class OverTime40to60HrsDecorator extends OverTimeWrapperCalculator {
	
	private OverTimeCalculator decorator;
	
	public OverTime40to60HrsDecorator(OverTimeCalculator decorator) {
		this.decorator = decorator;
	}
	
	public double calculateOverTimeBenefits(int weeklyHours) {
		double benefit = 0.0;
		if(weeklyHours >= 40 && weeklyHours <= 60) {
			benefit = 1.5;
		}
		return benefit + decorator.calculateOverTimeBenefits(weeklyHours);
	}

}
