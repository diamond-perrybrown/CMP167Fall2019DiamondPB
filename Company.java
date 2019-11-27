package s1;

public class Company {
		private String name;
		private String owner;
		private double budget;
		private int numEmployee;
		
public Company()
	{
	this.name = "";
	this.owner = "";
	this.budget = 35000.0;
	this.numEmployee = 30;
	}
public Company (String name, String owner, double budget, int numEmployee)
	{
	this.name = name;
	this.owner = owner;
	this.budget = budget;
	this.numEmployee = numEmployee;
	}
public Company (String name)
	{
	this.name = name;
	this.owner = "";
	this.budget = 0;
	this.numEmployee = numEmployee;
	}
public void setName (String n)
	{
	this.name = n;
	}
public void setOwner (String owner)
	{
	this.owner = owner;
	}
public void setBudget (double budget)
	{
	this.budget = budget;
	}
public void setNumEmployee (int numEmployee)
	{
	this.numEmployee = numEmployee;
	}
public String getName()
	{
	return this.name;
	}
public String getOwner()
	{
	return this.owner;
	}
public double getBudget()
	{
	return this.budget;
	}
public int getNumEmployee()
	{
	return this.numEmployee;
	}
public boolean equals (Object mObject) {
	if (this == mObject)
	return true;
	
	if (mObject instanceof Company) {
		Company c1 = (Company) mObject;
		if (this.name == c1.name)
		{
		if (this.owner == c1.owner)
		{
		if (this.budget == c1.budget)
		{
		if (this.numEmployee == c1.numEmployee)
		{
			return true;
		}
		}}
		}
	}
		return false;
}
public String toString() {
	return "Company: name" + getName() + "owner" + getOwner() + "budget" + getBudget() + "NumEmployees" + getNumEmployee();
}
}
