/**
 * 
 */
package csc3a.adt;

import java.util.Iterator;

/**
 * @author Mashau P
 *
 */
public interface IMap<K,V> 
{
	
	 public V remove(K key);
	public V get(K key);
	public void put(K key, V value);
	
	public Iterable<K> keys();
	public Iterable<V> values();
	
	
	public int size();
	public boolean isEmpty();
	
}                                                         


	//Iterable<AbstractMap.MapEntry<K,V>> entries();
	
	



