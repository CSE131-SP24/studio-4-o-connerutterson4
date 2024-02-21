package studio4;

import java.awt.Color;
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
		Scanner in = new Scanner(f); //making Scanner with a File
		
		StdDraw.setPenColor(100, 150, 230);
		double[] x5 = {0,0,1,1};
		double[] y5 = {0,1,1,0};
		StdDraw.filledPolygon(x5, y5);
		
		StdDraw.setPenColor(Color.black);
		double[] x3 = {.1, .9, .9, .1};
		double[] y3 = {.2, .2, .8, .8};
		StdDraw.filledPolygon(x3, y3);
		
		StdDraw.setPenColor(Color.orange);
		StdDraw.filledCircle(.5, .5, .30);
		
		StdDraw.setPenColor(Color.black);
		double[] x1 = {.3, .35, .35, .4, .4, .45, .45, .4, .4, .35, .35, .3};
		double[] y1 = {.3, .3, .45, .45, .3, .3, .7, .7, .55, .55, .7, .7};
		StdDraw.filledPolygon(x1, y1);
		
		StdDraw.setPenColor(Color.black);
		double[] x2 = {.7, .65, .65, .6, .6, .55, .55, .6, .6, .65, .65, .7};
		double[] y2 = {.3, .3, .45, .45, .3, .3, .7, .7, .55, .55, .7, .7};
		StdDraw.filledPolygon(x2, y2);
		
		StdDraw.setPenColor(Color.red);
		double[] x = {.2, .8, .2, .8};
		double[] y = {.2, .2, .8, .8};
		StdDraw.filledPolygon(x,y);
		
		StdDraw.setPenColor(Color.gray);
		double[] x4 = {.05, .1, .1, .05};
		double[] y4 = {0, 0, .8, .8};
		StdDraw.filledPolygon(x4, y4);
		
	}
}
