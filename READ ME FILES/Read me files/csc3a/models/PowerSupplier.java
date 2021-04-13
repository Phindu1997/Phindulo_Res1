/**
 * 
 */
package csc3a.models;

/**
 * @author Mashau P
 *  A class powersupplier as a node class
 *  implements comparable of the graph type
 *
 */
public class PowerSupplier implements Comparable<PowerSupplier>
{
	private String name;
    private double Electricity_capacity;
    private int x,y;
    
	public PowerSupplier(String name, double electricity_capacity, int x, int y) 
	{
		super();
		this.name = name;
		Electricity_capacity = electricity_capacity;
		this.x = x;
		this.y = y;
	}

	public int getX() 
	{
		return x;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public int getY() 
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public PowerSupplier(String name, double electricity_capacity)
	{
		super();
		this.name = name;
		Electricity_capacity = electricity_capacity;
	}

	public PowerSupplier(String name)
	{
		this.name = name;
	}
	
	public double getElectricity_capacity() 
	{
		return Electricity_capacity;
	}

	public void setElectricity_capacity(double electricity_capacity) 
	{
		Electricity_capacity = electricity_capacity;
	}

	public String getName()
	{
		return this.name;
	}
   
    public void setName(String name)
    {
    	this.name = name;
    	
    }

	@Override
	public int compareTo(PowerSupplier o) 
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
