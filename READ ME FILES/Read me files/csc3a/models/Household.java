/**
 * 
 */
package csc3a.models;

/**
 * @author Mashau P
 * 
 * A class Household as a node class
 *
 */
public class Household implements Comparable<Household>
{
    private String Name;
    private Object id;
    private int x;
    private int y;
    
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public Household(String name, Object id, int x, int y) 
	{
		super();
		Name = name;
		this.id = id;
		this.x = x;
		this.y = y;
	}


	/**
	 * @param name
	 * @param id
	 */
	public Household(String name, Object id)
	{
		Name = name;
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() 
	{
		return Name;
	}


	/**
	 * @return the id
	 */
	public Object getId()
	{
		return id;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		Name = name;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Object id)
	{
		this.id = id;
	}


	@Override
	public int compareTo(Household arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
    
	
    
}
