package csc3a.models;

import java.util.ArrayList;


import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * 
 * @author Mashau P
 * @student 216o37211
 * 
 * A class to delete a node
 *
 */

public class DeteleHouse extends Canvas {

	private Graph light;

	private int index;

	/**
	 * A constructor
	 * @param  Graph gH_c instance
	 * @param index
	 */
	public DeteleHouse(Graph gH_c, int i)
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
		gc.fillText(drawhouse.get(index).getValue().getName(), drawhouse.get(index).getValue().getX() - 5,
				drawhouse.get(index).getValue().getY() - 5);

		gc.drawImage(new Image(getClass().getResource("ded.png").toExternalForm()),
				drawhouse.get(index).getValue().getX()+45, drawhouse.get(index).getValue().getY()+25, 20, 20);
	}

}
