/**
 * 
 */
package csc3a.models;

import java.util.ArrayList;
import java.util.Random;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;

import csc3a.adt.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * @author Mashau P
 *
 */
public class Component extends Canvas
{
  
  private Graph GH_c;

  public Component(Graph gH_c) 
  {
	super();
	setHeight(900);
	setWidth(600);
	GH_c = gH_c;
	Piant_component();
}
	public  void Piant_component()
	{
		
	GraphicsContext gc=super.getGraphicsContext2D();
	ArrayList<Graph.Vertex<Household>> drawhouse= (ArrayList<Vertex<Household>>) GH_c.getVertices();
	for(int i=0;i<drawhouse.size();i++)
	{
		gc.setFill(Color.YELLOW);
		gc.setStroke(Color.RED);
System.out.println(drawhouse.get(i).getValue().getX()+" "+drawhouse.get(i).getValue().getY());
		gc.fillText("Nzhele" + drawhouse.get(i).getValue().getName(),
				drawhouse.get(i).getValue().getX()- 5,
				drawhouse.get(i).getValue().getY()- 5);


		gc.drawImage(new Image(getClass().getResource("house2.png").toExternalForm()), drawhouse.get(i).getValue().getX(),
				drawhouse.get(i).getValue().getY() , 50, 50);
	}
	
	
	for(int i=0;i<drawhouse.size();i++)
	{
		gc.setFill(Color.BLUE);
		gc.setStroke(Color.RED);
		gc.setLineWidth(2);
        System.out.println(drawhouse.get(i).getValue().getX()+" "+drawhouse.get(i).getValue().getY());
		gc.strokeLine(drawhouse.get(i).getValue().getX(), drawhouse.get(i).getValue().getY(), drawhouse.get(new Random().nextInt(2)).getValue().getX(), drawhouse.get(new Random().nextInt(2)).getValue().getY());
	}
}
  
 
  
}
