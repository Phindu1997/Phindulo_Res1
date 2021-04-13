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

public class PaintCanvas extends Canvas {
	
	private int index;
    private Graph light;
    
	public PaintCanvas(Graph gH_c, int i) 
	{
		super();
		setHeight(400);
		setWidth(300);
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

		gc.clearRect(0, 0, getWidth(), getHeight());
		
	}
}
