/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void twoCandles() {
		System.out.println("                                           /\\       /\\");
		System.out.println("                                          |__|     |__|");
		candleSide();
		candleSide();
		candleSide();
	}
	
	public static void candleSide() {
		System.out.println("                                           ||       ||");
	}

	public static void layerOne() {
		System.out.print("                                       --------------------");
		System.out.print("\n                                      |\\       /  \\      / |");
		System.out.println("\n                                      | \\     /    \\    /  |");
		System.out.println("                                      |  \\   /      \\  /   |");
		System.out.println("                                      |   ___        __    |");
		layerOneSide();
		layerOneSide();
	}
	
	public static void layerOneSide() {
		System.out.println("                                      |                    |");
	}
	
	public static void layerTwo() {
		System.out.println("                      ------------------------------------------------------");
		System.out.println("                      |       OO      OO        OOOOOO          OOOO        |");
		System.out.println("                      |       OO      OO        OO   OO         O  OO       |");
		System.out.println("                      |       OO      OO        OO   O          O    OO     |");
		System.out.println("                      |       OOOOOOOOOO        OOOOO           O     OO    |");
		System.out.println("                      |       OO      OO        OO  O           O     OO    |");
		System.out.println("                      |       OO      OO        OO   OO         O    OO     |");
		System.out.println("                      |       OO      OO        OOOOOO          OOOOOO      |");
		}
	
	public static void layerThree() {
		System.out.println("            ----------------------------------------------------------------------------");
		System.out.println("            |           \\           /     \\            /     \\           /             |");
		System.out.println("            |            \\         /       \\          /       \\         /              |");
		System.out.println("            |             \\       /         \\        /         \\       /               |");
		System.out.println("            |              \\     /           \\      /           \\     /                |");
		System.out.println("            |               \\   /             \\    /             \\   /                 |");
		System.out.println("            |                __                 __                 __                  |");
		System.out.println("            ----------------------------------------------------------------------------");
	}
	
	
	public static void main (String [] args) {
		twoCandles();
		layerOne();
		layerTwo();
		layerThree();
		System.out.println("                                           Happy Birthday!");
	}
}