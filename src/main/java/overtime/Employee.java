package overtime;

public class Employee {
	
	private int weeklyHours;
	private Division division;
	
	public Employee(Division division) {
		this.division = division;
	}

	public int getWeeklyHours() {
		return weeklyHours;
	}

	public void setWeeklyHours(int weeklyHours) {
		this.weeklyHours = weeklyHours;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

}
