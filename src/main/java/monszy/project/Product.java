package monszy.project;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {

	public String name;
	public ProductType productType;
	public int releaseYear;
	public int price;
	
	
	public String productTypeString;

	public Product(String name, ProductType productType, int releaseYear, int price) {
		this.name = name;
		this.productType = productType;
		this.releaseYear = releaseYear;
		this.price = price;
		this.productTypeString = productTypeString;
	}
/*
	public void printGame() {
		System.out.println("Name: " + name + "\tGame type: " + productType
				+ "\tRelease year: " + releaseYear + "\tPrice: " + price);
	}
*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	@Min(1950)
	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Min(0)
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public String getProductTypeString() {
		return productTypeString;
	}

	public void setProductTypeString(String productTypeString) {
		this.productTypeString = productTypeString;
	}

}
