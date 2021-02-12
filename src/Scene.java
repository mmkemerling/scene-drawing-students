
import java.util.Scanner;
import java.io.*;
import bridges.connect.Bridges;
import bridges.base.ColorGrid;
import bridges.base.Color;


public class Scene {

    /* Creates a Scene with a maximum capacity of Marks and
	   with a background color.
	   maxMarks: the maximum capacity of Marks
	   backgroundColor: the background color of this Scene
     */
	public Scene(int maxMarks, Color backgroundColor) {

	}

	// returns true if the Scene has no room for additional Marks
	private boolean isFull() {
		return false;
	}

	/* Adds a Mark to this Scene. When drawn, the Mark
	   will appear on top of the background and previously added Marks
	   m: the Mark to add
	 */
	public void addMark(Mark m) {
		if (isFull()) throw new IllegalStateException("No room to add more Marks");

	}

	/*
	Helper method: deletes the Mark at an index.
	If no Marks have been previously deleted, the method
	deletes the ith Mark that was added (0 based).
	i: the index
	 */
	protected void deleteMark(int i) {

	}

	/*
	Deletes all Marks from this Scene that
	have a given Color
	c: the Color
	 */
	public void deleteMarksByColor(Color c) {

	}

	/* draws the Marks in this Scene over a background color
	   onto a ColorGrid. Marks will appear on top of the
	   background, and Marks will overlap other Marks if
	   they were added by a more recent call to addMark.
	   cg: the ColorGrid to draw on
	 */
	public void draw(ColorGrid cg) {

	}
};
