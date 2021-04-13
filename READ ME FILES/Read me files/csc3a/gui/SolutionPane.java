/**
 * 
 */
package csc3a.gui;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

import com.jwetherell.algorithms.data_structures.Graph;
import com.sun.scenario.effect.light.Light;

import csc3a.models.Component;
import csc3a.models.DeteleHouse;
import csc3a.models.DrawTransform;
import csc3a.models.Household;
import csc3a.models.PaintCanvas;
import csc3a.models.PowerSupplier;
import csc3a.models.Profile;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * @author Mashau P
 *
 */
public class SolutionPane extends GridPane {
	
	Graph grap;
	private Button Delete;
	private Button next;
	private Button light;
	private Button btnloadCapacity;
	private Button btnPowerCapacity;
	private Button btnMagnitudeReduction;
	private TextArea areafield;
	private Label lblloadCapacity;
	private Label lblPowerCapacity;
	private Label lblMagnitude;
	private TextField txtuserloadCapacity;
	private TextField txtuserPowerCapacity;
	private TextField txtuserMagnitude;
	private ArrayList<Graph.Vertex<PowerSupplier>> PSLIST_Vertex = new ArrayList<>();
	private ArrayList<Graph.Edge<PowerSupplier>> edgeLIST = new ArrayList<>();
	private TextArea textarea;
	private ArrayList<Household> house =new ArrayList<Household>();
	private ArrayList<PowerSupplier> PS =new ArrayList<PowerSupplier>();
	
    private ArrayList<Graph.Vertex<Household>> housing_vertex= new ArrayList<Graph.Vertex<Household>>();
    private ArrayList<Graph.Edge<Household>> housing_edge= new ArrayList<Graph.Edge<Household>>();
    private Graph Eskom_Graph;
    
    private int index=0;
    
    /*
     * default constructor
     */
	public SolutionPane() 
	{
		
		house = Generate();
		PS = PowerStation();
		
		// Go through vertices list to find vertex
		for(int k =0;k<house.size();k++)
		{
			Graph.Vertex<Household> node= new Graph.Vertex<>(house.get(k),new Random().nextInt(5));
			housing_vertex.add(node);
		}
		Random rand= new Random();
		for(int k=0;k<housing_vertex.size()-1;k++)
		{
			Graph.Edge<Household> node= new Graph.Edge<Household>(new Random().nextInt(5),housing_vertex.get(rand.nextInt(housing_vertex.size())),housing_vertex.get(rand.nextInt(housing_vertex.size())));
			housing_edge.add(node);
		}
		Eskom_Graph=new Graph(housing_vertex,housing_edge);
		for(int i=0;i<PowerStation().size();i++)
		{
			Graph.Vertex<PowerSupplier> pan=new Graph.Vertex<>(PowerStation().get(i),2);
			PSLIST_Vertex.add(pan);
		}
	    
		GridPane Display = new GridPane();
		Display.setPrefSize(400, 800);
		Display.setStyle("-fx-background-color:Purple;");
		
		Display.setGridLinesVisible(true);
		GridPane Powersupply = new GridPane();
		Powersupply.setPrefSize(800, 800);
		Powersupply.setStyle("-fx-background-color:Green;");
		Powersupply.setGridLinesVisible(true);
		
		Powersupply.setVgap(30);
		Powersupply.setHgap(30);
		btnloadCapacity = new Button("Load Balabce");
		btnloadCapacity.setOnAction(e->{
			
		});
		GridPane House_grid = new GridPane();
		House_grid.setPrefSize(600, 800);
		House_grid.setStyle("-fx-background-color:purple;");
		House_grid.setGridLinesVisible(true);
		btnloadCapacity.setPrefSize(120, 120);
		btnloadCapacity.setStyle("-fx-background-color:pink;");
		btnPowerCapacity = new Button("Power");
		btnPowerCapacity.setPrefSize(120, 120);
		btnPowerCapacity.setStyle("-fx-background-color:pink;");
		btnMagnitudeReduction = new Button("Load Balabce");
		btnMagnitudeReduction.setPrefSize(120, 130);
		btnMagnitudeReduction.setStyle("-fx-background-color:Green;");
		HBox buttons = new HBox();
		buttons.setSpacing(30);
		
		//set button for delete
		Delete = new Button("Delete");
		Delete.setPrefSize(120,120);
		Delete.setStyle("-fx-background-color:Red;");
		Delete.setOnAction(e->{
			TextInputDialog Delte = new TextInputDialog();
			Delte.setHeaderText("House ID");
			Delte.setContentText("Enter the house Id to delete");
			Delte.setTitle("Delete");
			Optional<String> Index = Delte.showAndWait();
			if(Index.isPresent()) {
				
			
			boolean mycondition=true;
			int n=0;
			while(mycondition==true)
					{
				if(housing_vertex.get(n).getValue().getId().equals(Integer.parseInt((Index.get()))))
				{
					House_grid.add(new DeteleHouse(Eskom_Graph, n), 0, 0);
					mycondition=false;
					housing_vertex.remove(n);
					areafield.appendText(" \n House name : "+housing_vertex.get(n).getValue().getId()+" was removed succesful");
					
				}else {
				
				}
				n++;
					}
			}else
			{
				
				
			}
			
		});
		//set button for light
		light = new Button("Light");
		light.setPrefSize(120, 120);
		light.setStyle("-fx-background-color:Yellow;");
		light.setOnAction(e->{
			
			index++;
			House_grid.add(new csc3a.models.Light(Eskom_Graph, index),0,0);
			if(index==housing_vertex.size()-1)
			{
				index=0;
			}
			
		});
		next = new Button(">> Next");
		next.setPrefSize(120, 120);
		next.setStyle("-fx-background-color:Blue;");
		HBox menuhouse=new HBox();
		menuhouse.getChildren().addAll(Delete,light,next); // adding children to the root
		menuhouse.setSpacing(40);
		Display.add(menuhouse, 0, 1);
		
		next.setOnAction(e->{
		
		
			//Display.add(new Profile(Phindulo_Graph, index),0,0);
			
		
			
		});
		buttons.getChildren().addAll(btnloadCapacity, btnPowerCapacity, btnMagnitudeReduction);
		
     Display.add(buttons, 0, 2);
		areafield = new TextArea();
		
		areafield.setPrefSize(200, 300);
		areafield.appendText(DisplayHouse());
		Display.setVgap(10);
		Display.add(areafield, 0, 0);
		Powersupply.add(Display, 2, 0);
		
		House_grid.add(new Component(Eskom_Graph), 0, 0);
		House_grid.add(new DrawTransform(PSLIST_Vertex), 0, 0);
		
		this.add(House_grid, 1, 0);

		this.add(Display, 0, 0);


	}

	private void setupGUI()
	{
	
	
		
	}
		public ArrayList<Household> Generate()
		{
			
			ArrayList<Household> house =new ArrayList<Household>();
			
			
			for(int i=0;i<15;i++)
			{
				
				Household housedd= new Household("House" + new Random().nextInt(203), new Random().nextInt(52), new Random().nextInt(600), new Random().nextInt(600));
				house.add(housedd);
			}
			
			return house;
		}

			
	

public ArrayList<PowerSupplier> PowerStation()
{
	
	ArrayList<PowerSupplier> PS =new ArrayList<PowerSupplier>();
	
	
	for(int i=0;i<3;i++)
	{
		
		PowerSupplier hhn= new PowerSupplier("DS234"+i, new Random().nextInt(40000), 100+(i*40), 350+(i*80) );
		PS.add(hhn);
	}
	
	return PS;
}
 public String DisplayHouse()
 {
	 String house="";
	 
	for(int i=0;i<housing_vertex.size();i++)
	{
		
		house+="_________________________________\n Name :"+housing_vertex.get(i).getValue().getName() +" House id :"+housing_vertex.get(i).getValue().getId()+"\n____________________________________";
	}
	
	house+="###############\n Total house : "+housing_vertex.size()+"\n##############\n";
	return house;
 }
	
}
