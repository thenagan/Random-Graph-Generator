import java.util.Scanner;

// Random seed generation uses random codes and converts it into a actual graph and user profile
// Also, it can be used to create special user profile that can be stored for a long time! (can create a password with it!?)
// also you can convert some of the code on this page to different files containing separate classes!

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the start screen!");
		Scanner settings = new Scanner(System.in);
		char quotes = '"'; // char is in single quotes!
		System.out.println("Type " + quotes + "play" + quotes + " to continue!");
		String play = settings.next();
		
		if (play.contentEquals("read")) {
			System.out.println("Please enter a few numbers here: ");
		}
		
		
		if (play.contentEquals("play")) {
			System.out.println("A graph is about to be generated!");
			System.out.println("Please enter the graph size:");
			System.out.println("Rows: ");
			int rows = settings.nextInt(); // Need a way to enter only integers
		
			
			System.out.println("Columns: ");
			int columns = settings.nextInt();
			
			
			int rand_selector_col_1;
			int selector; // select algorithm bottom, top, side
			
			int[][] rand_graph = new int[rows][columns];
			
			int[][] matrix = new int[5][5];
			int[][] matrix101 = new int[5][5];
			int test101 = 0;
		
			
			
			
			String[][] real_graph = new String[rows][columns]; // rows and colunms are integers
			
			for (int row = 0; row < rand_graph.length; row++) {
				for (int col = 0; col < rand_graph[row].length; col++) { // Row's length!
					rand_graph[row][col] = (int)(Math.random()*9);
					int real_graph_101 = (int)(Math.random()*9);
					real_graph[row][col] = Integer.toString(real_graph_101);
					System.out.print(rand_graph[row][col] + " ");
				}
				System.out.println();
						
			}
			
			
			
			System.out.println("Want to continue? " + "Then, type yes: ");
			String yes101 = settings.next();
			if (yes101.contentEquals("yes")) {
				
				int rand_500 = (int)((Math.random()*rand_graph.length) - 1);
				real_graph[rand_500][0] = "/";
				
				selector = (int)(Math.random()*4);
				
				
				for (int i = 0; i < 5; i++) {
					if (selector == 0) {
						selector = (int)(Math.random()*4);
						int rand_row_01 = rand_500 + 1;
						
						real_graph[rand_row_01][0] = "|";
					} else if (selector == 1) {
						int rand_row_02 = rand_500 + 1;
						int rand_col_02 = rand_500 + 1;
					}
				}
					
			
				for (int row = 0; row < rand_graph.length; row++) {
					for (int col = 0; col < rand_graph[row].length; col++) { // Row's length!
						if (real_graph[row][col].contentEquals("1") || real_graph[row][col].contentEquals("2") ||
							real_graph[row][col].contentEquals("3") || real_graph[row][col].contentEquals("4") ) {
							
							real_graph[row][col] = "/";
							
						} else {
							real_graph[row][col] = "_";
						}
						System.out.print(real_graph[row][col] + " ");
					}
					System.out.println();
							
				}
			}
			
				
			
		}
		
		
	}

}
