import csc3a.gui.SolutionPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 */

/**
 * @author User
 *
 */
public class Main extends Application{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		launch(args);
		
         //System.out.println("hello");;
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		SolutionPane root = new SolutionPane();
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("Power Allocation");
		primaryStage.setScene(scene);
		primaryStage.setWidth(700);
		primaryStage.setHeight(600);
		
		primaryStage.show();
		
		
	
		
	}

}
