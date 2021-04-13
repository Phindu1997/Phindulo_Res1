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
 */

public class Light extends Canvas {
	
	private Graph light;

	private int index;

	public Light(Graph gH_c, int i) 
	{
		super();
		setHeight(900);
		setWidth(600);
		index = i;
		light = gH_c;
		Piant_component();
	}

	public void Piant_component() 
	{
		GraphicsContext gc = super.getGraphicsContext2D();
		ArrayList<Graph.Vertex<Household>> drawhouse = (ArrayList<Vertex<Household>>) light.getVertices();

		gc.setFill(Color.YELLOW);
		gc.setStroke(Color.RED);
		System.out.println(drawhouse.get(index).getValue().getX() + " " + drawhouse.get(index).getValue().getY());
		

		gc.drawImage(new Image(getClass().getResource("light.png").toExternalForm()),
				drawhouse.get(index).getValue().getX()-28, drawhouse.get(index).getValue().getY()+25, 25, 28);
	}
}
