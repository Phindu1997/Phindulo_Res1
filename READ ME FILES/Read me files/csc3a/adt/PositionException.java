/**
 * 
 */
package csc3a.adt;

/**
 * @author User
 *
 */
public class PositionException extends RuntimeException
{
   private static final long serialVersionUID = 1L;
   
   public PositionException()
   {
	   super();
   }
   
   public PositionException(String message)
   {
	   super(message);
   }
   public PositionException(String message , Throwable cause)
   {
	   super(message, cause);
   }
   public PositionException(Throwable cause)
   {
	   super(cause);
   }
}
