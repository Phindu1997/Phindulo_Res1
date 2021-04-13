/**
 * 
 */
package csc3a.adt;

/**
 * @author User
 *
 */
public class Node<T> 
{
  T element;
  Node<T> next;
  Node<T> prev;
  
/**
 * @param element
 * @param next
 * @param prev
 */
public Node(T element, Node<T> next, Node<T> prev) 
{
	
	this.element = element;
	this.next = next;
	this.prev = prev;
}

/**
 * @return the element
 */
public T getElement()
{
	return element;
}

/**
 * @return the next
 */
public Node<T> getNext() 
{
	return next;
}

/**
 * @return the prev
 */
public Node<T> getPrev() 
{
	return prev;
}

/**
 * @param element the element to set
 */
public void setElement(T element) 
{
	this.element = element;
}

/**
 * @param next the next to set
 */
public void setNext(Node<T> next) 
{
	this.next = next;
}

/**
 * @param prev the prev to set
 */
public void setPrev(Node<T> prev) 
{
	this.prev = prev;
}


  
  
  
}
