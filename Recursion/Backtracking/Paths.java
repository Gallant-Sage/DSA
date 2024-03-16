import java.util.Arrays;

public class Paths {
	public static void main(String[] args){
		boolean[][] maze = {
			{true, true, true},
			{true, true, true},
			{true, true, true}
		};

		// allPath("", maze, 0, 0);
		int[][] path = new int[maze.length][maze[0].length];
		allPathPrint("", maze, 0, 0, path, 1);
	}

	static void allPath(String p, boolean[][] maze, int r, int c) {
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(p);
			return;
		}

		if (!maze[r][c]) {
			return;
		}

		// i am considering this path in my way.
		maze[r][c] = false;

		if (r < maze.length - 1) {
			allPath(p + 'D', maze, r + 1, c);
		}

		if (c < maze[0].length - 1) {
			allPath(p + 'R', maze, r, c + 1);
		}

		// for left, row will be (r-1) & c will remain same.
		// can't go left from 0th row.
		if (r > 0) {
			allPath(p + 'U', maze, r - 1, c);
		}

		if (c > 0) {
			allPath(p + 'L', maze, r, c - 1);
		}

		// this line is where function will be over
		// so before function gets removed, also remove the changes made by that function.
		// This is called Backtracking
		maze[r][c] = true;
	}

	static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			path[r][c] = step;
			for (int[] arr : path) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
			System.out.println();
			return;
		}

		if (!maze[r][c]) {
			return;
		}

		// i am considering this path in my way.
		maze[r][c] = false;
		path[r][c] = step;

		if (r < maze.length - 1) {
			allPathPrint(p + 'D', maze, r + 1, c, path, step+1);
		}

		if (c < maze[0].length - 1) {
			allPathPrint(p + 'R', maze, r, c + 1, path, step+1);
		}

		// for left, row will be (r-1) & c will remain same.
		// can't go left from 0th row.
		if (r > 0) {
			allPathPrint(p + 'U', maze, r - 1, c, path, step+1);
		}

		if (c > 0) {
			allPathPrint(p + 'L', maze, r, c - 1, path, step+1);
		}

		// this line is where function will be over
		// so before function gets removed, also remove the changes made by that function.
		// This is called Backtracking
		maze[r][c] = true;
		path[r][c] = 0;
	}	
}