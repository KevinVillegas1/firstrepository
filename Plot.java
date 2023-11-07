/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Write a Class that contains instance variables to represent the x and y coordinates of the upper left corner of the location,
 * and depth and width to represent the vertical and horizontal extents of the plot. It also has methods to check if the plots overlap or are encompassed by one another,
 * as well as a toString method to display the plot's information. 
 * Due: 11/07/23
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: _Kevin Villegas_
 */
public class Plot {
	private int x,y,width,depth;
	
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	public Plot(Plot otherPlot) {
		this.x = otherPlot.getX();
		this.y = otherPlot.getY();
		this.width = otherPlot.getWidth();
		this.depth = otherPlot.getDepth();
	}
	public boolean overlaps(Plot plot) {
		int a = plot.getX();
		int b = plot.getY();
		int c = plot.getWidth();
		int d = plot.getDepth();
		if (this.x == a && this.y == b && this.width == c && this.depth == d)
		{
			return true;
		}
		else if ((b + d) <= (this.y + this.depth) && (this.x + this.width) >= (a + c) && this.x <= a && this.y < b)
		{
			return true;
		}
		else if ((this.x + this.width) <= (a + c) && (this.y + depth) > b)
		{
			return true;
		}
		else if ((this.x + this.width) >= (a + c) && (this.y + depth) > b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean encompasses(Plot plot) {
		int a = plot.getX();
		int b = plot.getY();
		int c = plot.getWidth();
		int d = plot.getDepth();
		if (a > this.x + this.width || b > this.y + this.depth || (a + c) > this.x + this.width || (b + d) > this.y + this.depth)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getWidth() {
		return this.width;
	}
	public int getDepth() {
		return this.depth;
	}
	public String toString() {
		return this.x + "," + this.y + "," + this.width + "," + this.depth;
	}
}
