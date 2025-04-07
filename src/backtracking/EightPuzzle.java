package backtracking;

import java.util.*;

class EightPuzzle {

    // Goal state
    private static final int[][] goalState = {
            {1, 2, 3},
            {8, 0, 4},
            {7, 6, 5}
    };

    // Directions: up, down, left, right
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};

    // State representation
    static class State {
        int[][] board;
        int x, y; // Position of the blank tile (0)
        State parent;

        State(int[][] board, int x, int y, State parent) {
            this.board = board;
            this.x = x;
            this.y = y;
            this.parent = parent;
        }

        // Check if current state matches the goal state
        boolean isGoal() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] != goalState[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        // Create a copy of the state (for moving the blank tile)
        State copy() {
            int[][] newBoard = new int[3][3];
            for (int i = 0; i < 3; i++) {
                System.arraycopy(board[i], 0, newBoard[i], 0, 3);
            }
            return new State(newBoard, x, y, parent);
        }
    }

    // Generate valid neighbors by sliding the blank tile
    public static List<State> getNeighbors(State current) {
        List<State> neighbors = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int newX = current.x + dx[i];
            int newY = current.y + dy[i];

            if (newX >= 0 && newX < 3 && newY >= 0 && newY < 3) {
                State neighbor = current.copy();
                // Swap blank tile with adjacent tile
                neighbor.board[current.x][current.y] = neighbor.board[newX][newY];
                neighbor.board[newX][newY] = 0;
                neighbor.x = newX;
                neighbor.y = newY;
                neighbors.add(neighbor);
            }
        }
        return neighbors;
    }

    // Depth-First Search (DFS) Algorithm
    public static List<int[][]> depthFirstSearch(int[][] startState) {
        Stack<State> stack = new Stack<>();
        Set<String> visited = new HashSet<>();

        int startX = 0, startY = 0;
        // Find the position of the blank tile (0) in the start state
        outer: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (startState[i][j] == 0) {
                    startX = i;
                    startY = j;
                    break outer;
                }
            }
        }

        State start = new State(startState, startX, startY, null);
        stack.push(start);

        while (!stack.isEmpty()) {
            State current = stack.pop();

            // If goal is found, reconstruct the solution path
            if (current.isGoal()) {
                List<int[][]> path = new ArrayList<>();
                while (current != null) {
                    path.add(current.board);
                    current = current.parent;
                }
                Collections.reverse(path);
                return path;
            }

            visited.add(Arrays.deepToString(current.board));

            for (State neighbor : getNeighbors(current)) {
                if (!visited.contains(Arrays.deepToString(neighbor.board))) {
                    stack.push(neighbor);
                }
            }
        }
        return null; // No solution found
    }

    // Utility function to print a state
    public static void printState(int[][] state) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(state[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example Start State
        int[][] startState = {
                {1, 2, 3},
                {8, 0, 4},
                {7, 6, 5}
        };

        System.out.println("Start State:");
        printState(startState);

        List<int[][]> solution = depthFirstSearch(startState);

        if (solution != null) {
            System.out.println("\nSolution Path:");
            for (int[][] state : solution) {
                printState(state);
            }
        } else {
            System.out.println("No solution exists.");
        }
    }
}
