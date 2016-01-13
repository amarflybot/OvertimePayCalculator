package overtime;

public class OverTimeMoreThan70HrsDecorator extends OverTimeWrapperCalculator {
	
	private OverTimeCalculator decorator;
	
	public OverTimeMoreThan70HrsDecorator(OverTimeCalculator decorator) {
		this.decorator = decorator;
	}
	
	public double calculateOverTimeBenefits(int weeklyHours) {
		double benefit = 0.0;
		if(weeklyHours >= 70) {
			benefit = 2.0;
		}
		return benefit + decorator.calculateOverTimeBenefits(weeklyHours);
	}

}
