package overtime;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static final void main(String args[]) {
		
		OverTimeCalculator ot1 = new OverTimeMoreThan70HrsDecorator(new OverTime40to60HrsDecorator(new OverTimeLessThan40HrsDecorator(new SimpleOverTimeCalculator())));
		Division division = new Division(ot1);
		List<Division> divisionList = new ArrayList<Division>();
		Company c = new Company();
		c.setDivision(divisionList);
		Employee e = new Employee(division);
		e.setWeeklyHours(75);
		
		System.out.println(division.getOverTimeBenefits(e.getWeeklyHours()));
	}

}
