/**
 * 
 */
package csc3a.models;

/**
 * @author Mashau P
 * 
 * A class ElectricityCost as an edge of the graph
 *
 */
public class ElectricityCost implements Comparable<ElectricityCost>
{
	private String Name;
	private int Number;
	private double costValue = 0.0;
	
	public ElectricityCost(String name, int number, double value )
	{
		this.Name = name;
		this.Number = number;
		this.costValue = value;
		
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return this.Name;
	}

	/**
	 * @return the number
	 */
	public int getNumber() 
	{
		return this.Number;
	}

	/**
	 * @return the value
	 */
	public double getValue()
	{
		return this.costValue;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.Name = name;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) 
	{
		this.Number = number;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) 
	{
		this.costValue = value;
	}

	@Override
	public int compareTo(ElectricityCost electricitycost )  {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
