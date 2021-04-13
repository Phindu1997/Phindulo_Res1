/**
 * 
 */
package csc3a.models;

import java.util.ArrayList;

import com.jwetherell.algorithms.data_structures.Graph;

import csc3a.adt.HashTable;
import csc3a.adt.IMap;
import csc3a.adt.Map;
import csc3a.adt.PositionList;

/**
 * @author Mashau P
 *
 */
public class Transversal  {
	
	private Graph graph;

	HashTable<Household, Boolean> visit = new HashTable<>();
	HashTable<Household, Graph.Vertex<Household>> vertex = new HashTable<>();
	
	public void printDepthFirstSearch(Household vertices)
	{
		ArrayList<Graph.Vertex<Household>> vertex = ( ArrayList<Graph.Vertex<Household>>) graph.getVertices();
		visit = new HashTable<>();
	}
	
	public void DepthFirstSearchh(Graph g, Graph.Vertex<Household> v)
	{
		if(visit.equals(v.getEdges()))
		{
			
		}
	}
	
	public  <T>  void DepthFirstSearch(Graph g, Graph.Vertex<Household> v, Graph.Edge<ElectricityCost> e, IMap<Graph.Vertex<Household>,Graph.Edge<ElectricityCost>> tree)
	{
		
	}
	
	/**
	 * 
	 * @param <T>
	 * @param Graph g
	 * @param v vertex 
	 * @param tree
	 * @return path: ordered list of the edges
	 */
	public static <T> PositionList<Graph.Edge<ElectricityCost>> createpath(Graph g,Graph.Vertex<Household> v,
			 IMap<Graph.Vertex<Household>, Graph.Edge<ElectricityCost>> tree)
	{
		PositionList<Graph.Edge<ElectricityCost>> path = new PositionList<>();
		
		Graph.Vertex<Household> vertx = v;
		while(vertx != v )
		{
			Graph.Edge<ElectricityCost> edge = tree.get(vertx);
			path.addLast(edge);
		
		}

		return path;
		
	}
	
	/**
	 *  Depth first search for the entire graph
	 * @param <T>
	 * @param g
	 * @return tree as a map
	 */
	public static <T> IMap<Graph.Vertex<Household>, Graph.Edge<ElectricityCost>> 
	DepthFirstSerachCompleteVisit(Graph g)
	{
		
    IMap<Graph.Vertex<Household>, Graph.Edge<ElectricityCost>> tree = new Map<>();	
    for (Graph.Vertex<Household> vert : ( ArrayList<Graph.Vertex<Household>>) g.getVertices())
    {
    	
    	return null;
    }
		
	
    return tree;
	}

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
