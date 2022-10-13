package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); // making Scanner with a File

		String shapeType = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double P1 = in.nextDouble();
		double P2 = in.nextDouble();
		double P3 = in.nextDouble();
		double P4 = in.nextDouble();
	

		
		StdDraw.setPenColor(red, green, blue);
		if (isFilled == true) {
			if (shapeType.equals ("rectangle")) {
				StdDraw.filledRectangle(P1,P2,P3,P4);
			} else if (shapeType.equals ("ellipse")) {
				StdDraw.filledEllipse(P1,P2,P3,P4);
			}
		}

	}
}
