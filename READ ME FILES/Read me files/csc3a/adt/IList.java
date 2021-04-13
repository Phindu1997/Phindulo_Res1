/**
 * 
 */
package csc3a.adt;

import com.jwetherell.algorithms.data_structures.Graph.Vertex;

/**
 * @author Mashau P
 *
 */
public interface IList<T>
{
	public T get(Integer i);
	public void set(Integer i, T element);
	public T remove(Integer i);
	
	public Integer size();
	public boolean isEmpty();

}
//public void add( Vertex[] vertex);
