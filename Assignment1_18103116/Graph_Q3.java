import java.util.*;
public class Graph_Q3{
	static class Edge{
		int source, dest, cost;
		Edge(int s, int d, int c){
			source = s;
			dest = d;
			cost = c;
		}
	}
	
	public static String bellmanFord(ArrayList<Edge> edges, int n, int source, int dest){
		int m = edges.size();
		int dist[] = new int[n];
		Arrays.fill(dist,Integer.MAX_VALUE);
		dist[source] = 0;
		for(int i = 1;i<n;i++){
			for(Edge edge:edges){
				int u = edge.source;
				int v = edge.dest;
				int w = edge.cost;
				if(dist[u]!=Integer.MAX_VALUE&&dist[v]>dist[u]+w){
					dist[v] = dist[u]+w;
				}
			}
		}
		for(Edge edge:edges){
			int u = edge.source;
			int v = edge.dest;
			int w = edge.cost;
			if(dist[u] != Integer.MAX_VALUE && dist[u]+w<dist[v]){
				return "Graph contains negative weight cycle";
			}
		}
		return dist[dest]==Integer.MAX_VALUE?"No path":String.valueOf(dist[dest]);
	}
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter no. of vertices in graph:\n");
    	int n = sc.nextInt();
    	System.out.print("Enter no. of edges in graph:\n");
    	int m = sc.nextInt();
    	ArrayList<Edge> edges = new ArrayList<Edge>(m);
    	System.out.print("Enter the edges in the format:\nSource Destination Cost\n");
    	for(int i = 0;i<m;i++){
    		edges.add(new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    	}
    	System.out.print("Enter source vertex:\n");
    	int source = sc.nextInt();
    	System.out.print("Enter destination vertex:\n");
    	int dest = sc.nextInt();
    	System.out.print(bellmanFord(edges,n,source,dest)+"\n");
    }   
                             
}