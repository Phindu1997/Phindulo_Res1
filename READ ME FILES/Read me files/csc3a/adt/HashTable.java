/**
 * 
 */
package csc3a.adt;

/**
 * @author User
 * @param <K>
 * @param <V>
 *
 */
public class HashTable<K, V> implements IMap<K,V> 
{
	Object[] hashtable;
	int size;
	int capacity;
	
	public HashTable()
	{
		this(100);
	}

	public HashTable(int initsize)
	{
		this.capacity = initsize;
		this.hashtable = createArray(this.capacity);
	}
	
	private Object[] createArray(int size)
	{
		Object t_bucket[] = new Object[size];
		for (int i = 0; i < size; i++)
		{
			t_bucket[i] = (Object) new PositionList<Entry<K,V>>();
			
		}
		
		return t_bucket;
	}
	
	public long hash(String string)
	{
		return hash(string.getBytes());
	}

	private long hash(byte[] bytes) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void put(K key, V value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<K> keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
