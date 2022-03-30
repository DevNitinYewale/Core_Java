package com.chg.exmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoodItem {
	/*declare variables*/
	private String food_name;
	private double grams_fat;
	private double grams_carbohydrates;
	private double gram_protein;
	private double cal;
	
	/*default constructor*/
	public FoodItem() {
		food_name="None";
		grams_fat=0.0;
		grams_carbohydrates=0.0;
		gram_protein=0.0;
		cal=1.0;
	} 

	/*parameterized constructor: */
	public FoodItem(String food_name, double grams_fat, double grams_carbohydrates, double gram_protein, double cal) {
		super();
		this.food_name = food_name;
		this.grams_fat = grams_fat;
		this.grams_carbohydrates = grams_carbohydrates;
		this.gram_protein = gram_protein;
		this.cal=cal;
	}
	
	/*display details on console*/
	
	public void display() {
		/*here calculate calories of carbohydrates and protein 
		 * carbohydrates and protein 1 gram= 4 calories
		 */
		double carboProtein=(grams_carbohydrates+gram_protein)*4;
		
		/*calculate calories of protein
		 * fat  1 gram= 9 calories
		 */
		double fat=(grams_fat)*9;
		
		/*calculate total calories */
		double totalCaloreis=carboProtein+fat;
		
		System.out.println("Nutritional information per serving of: "+food_name);
		System.out.println("Fat: "+grams_fat);
		System.out.println("Carbohydrates: "+grams_carbohydrates);
		System.out.println("Protein: "+gram_protein);
		System.out.println("Number of calories for " + cal +" serving(s): "+totalCaloreis+"\n");
	}

	/*Driver code*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*is used for getting input from user:*/
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String name=br.readLine();
		double fat=Double.parseDouble(br.readLine());
		double carbohydrates=Double.parseDouble(br.readLine());
		double protein=Double.parseDouble(br.readLine());
		double cal=Double.parseDouble(br.readLine());
		
		/*create instance of FoodItem*/
		FoodItem fItem; 
		
		/*call default constructor*/
		fItem=new FoodItem();
		/*print default constructor values:*/
		fItem.display();
		
		/*pass value in parameterized constructor*/
		fItem=new FoodItem(name, fat, carbohydrates, protein, cal);
		/*print parameterized constructor values:*/
		fItem.display();
	}
}
