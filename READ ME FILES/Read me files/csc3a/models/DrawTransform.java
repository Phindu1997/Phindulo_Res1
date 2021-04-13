/**
 * 
 */
package csc3a.models;

import java.util.ArrayList;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * @author Mashau P
 *
 */
public class DrawTransform extends Canvas{
	
private ArrayList<Graph.Vertex<PowerSupplier>> power;

	public DrawTransform(ArrayList<Graph.Vertex<PowerSupplier>> gH_c) 
	{
		super();
		setHeight(900);
		setWidth(600);
		power = gH_c;
		DrawTrans();
	}
		public  void DrawTrans()
		{
			
		GraphicsContext gc=super.getGraphicsContext2D();
		ArrayList<Graph.Vertex<PowerSupplier>> drawhouse= power;
		for(int i=0;i<drawhouse.size();i++)
			
		{
			gc.setFill(Color.BLUE);
			gc.setStroke(Color.RED);
			
	      System.out.println(drawhouse.get(i).getValue().getX()+" "+drawhouse.get(i).getValue().getY());
	      
			gc.fillText( drawhouse.get(i).getValue().getName(),
					drawhouse.get(i).getValue().getX(),
					drawhouse.get(i).getValue().getY());


			gc.drawImage(new Image(getClass().getResource("trabfor.png").toExternalForm()), drawhouse.get(i).getValue().getX(),
					drawhouse.get(i).getValue().getY() , 50, 50);
		}

		}
}
