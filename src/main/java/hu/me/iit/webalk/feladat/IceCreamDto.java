package hu.me.iit.webalk.feladat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class IceCreamDto {
	
	@NotNull
	private int id;
	@NotNull
	@NotBlank
	private String flavour;
	@NotBlank
	private String type; //pl.: Gelato, Sorbet, Non-Dairy, etc...
	@Min(1)
	@Max(5)
	private int numberOfIngredients;
	public int getId() {
		return id;
	}
	public String getFlavour() {
		return flavour;
	}
	public String getType() {
		return type;
	}
	public int getNumberOfIngredients() {
		return numberOfIngredients;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setNumberOfIngredients(int numberOfIngredients) {
		this.numberOfIngredients = numberOfIngredients;
	}
	
	@Override
	public String toString() {
		return "IceCreamDto (id: " + id + ", flavour: " + flavour + ", type: " + 
							type + ", numberOfIngredients: " + numberOfIngredients + ")";
	}

}

