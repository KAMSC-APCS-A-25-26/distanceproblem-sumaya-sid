/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 * 
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */


import java.util.Scanner;


public class DistanceMultiple {
    public static void main(String[] args) {
        // Read in scanning object
        Scanner scan = new Scanner(System.in);

        // Assign primitive type and initialize variables
        int numRuns;

        // Signature
        System.out.println("Sumaya\nAPCS-A\nLewis 2.8 Arithmetic Program\n");

        // Prompt user for number of runs
        System.out.print("How many runs?: ");
        numRuns = scan.nextInt();
        scan.nextLine();

        for(int j=0; j<numRuns; j++)
        {
            // Prompt user to enter coordinates and scan them in
            System.out.print("\nEnter your 2 coordinates: ");
            String input = scan.nextLine();

            // Removes parentheses
            input = input.substring(1, input.length() - 1);

            // Split each point by the middle parentheses ) and (
            String[] pt = input.split("\\)\\(");

            // Split the coordinate point string by comma
            String [] p1 = pt[0].split(",");
            String [] p2 = pt[1].split(",");

            // Convert x and y coordinates from String to a double
            double x = Double.parseDouble(p1[0]);
            double y = Double.parseDouble(p1[1]);
            double x1 = Double.parseDouble(p2[0]);
            double y1 = Double.parseDouble(p2[1]);

            // Calculate the distance
            double distance = Math.sqrt(Math.pow(x1-x,2) + Math.pow(y1-y,2));

            // Print out the distance
            System.out.println("\nDistance: " + distance + "\n");
        }
    }

}
