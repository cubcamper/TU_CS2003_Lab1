
/**
 * CS 2003 - Lab 1. Code to compute the average of doubles from an input
 * file.  NOTE: add data members and methods at your convenience. Use
 * the most accurate data types. You can reuse bits of code from
 * the class Lab1a.
 *
 * @author GeorgePatterson
 * @version 1.8
 * @since 1.8
 * 
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Lab1b {
    
    // data members
	/** stores the data retrieved from the file */

	
	Scanner input = new Scanner(System.in);

    /** Constructor: calls method readFile that reads the doubles
     * contained in the file "<code>filename</code>" and computes the
     * average of the elements.
     @param filename name of the file containing doubles.
    */
    public Lab1b(String filename) {
	readFile(filename);
    }

    /** Reads double from a file named <code>filename</code> and
     * computes the average of the elements contained in the file 
     * @param filename name of the file containing the doubles 
     */
    public void readFile(String filename) {
	//  -- TO COMPLETE -- Method description here 
    	
    	try {
			File inputFile = new File("Lab1b.dat");
			Scanner input = new Scanner(inputFile);
	
			int count = 0;
			double sum = 0.0;
			
			while (input.hasNextDouble()) {
				count++;
				sum+=input.nextDouble();
			}


			// Calculate the average
			double avg = sum/count;

			// output results
			System.out.println("The average of all the doubles from the file is: " + avg + "!");
			input.close();
		} catch (IOException e) {
			System.err.println("IOException in reading input file!!!");
		}
    	
    	
    	
    	
    } //end readFile()
    
    
    
    
    
    
    
    

    /** main : creates a Lab1b Object with the filename passed in
     * argument*/
    public static void main(String args[]) {
	if (args.length == 0)
	    System.err.println("enter the data file name!");
	else
	    new Lab1b(args[0]);
    } //end main
    
} //end class Lab1b
