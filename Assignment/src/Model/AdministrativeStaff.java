package Model;

public class AdministrativeStaff extends Employee implements ModelInterface{
	
	private String rule;

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

		
	public AdministrativeStaff(String rule,String id, String name, Integer age, String email, String address, Long salary) {
		super(id, name, age, email, address, salary);
		// TODO Auto-generated constructor stub
		this.rule = rule;
		this.calculateInCome();
	}

	@Override
	public String toString() {
		return "Rule: " + this.getRule() + ", Id=" + this.getId() + ", Name=" + this.getName() + ", Age=" + this.getAge()
				+ ", Email=" + this.getEmail() + ", Address=" + this.getAddress() + ", Salary=" + this.getSalary() + ", Income=" + this.getIncome() + "]";
	}
	@Override
	public Long calculateInCome() {
		this.income = this.getSalary();
		if (this.income < 9000000) return this.income;
		if (this.getSalary() >= 9000000 && this.getSalary() <= 15000000) this.income = (long) (this.getSalary()*0.9);
		if (this.getSalary() > 15000000) this.income = (long) (this.getSalary()*0.88);
		return this.income;
	}
}
