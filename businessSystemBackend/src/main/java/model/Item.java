package model;

public class Item {
	private int id;
	private String name;
	private long quantity;
	private double price;
	private String category;
	private double weight;
	private String supplier;
	private boolean unpacked;
	private long totalSold;

	public Item(int id, String name, long quantity, double price, String category, double weight, String supplier,
			boolean unpacked, long totalSold) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
		this.weight = weight;
		this.supplier = supplier;
		this.unpacked = unpacked;
		this.totalSold = totalSold;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public boolean isUnpacked() {
		return unpacked;
	}

	public void setUnpacked(boolean unpacked) {
		this.unpacked = unpacked;
	}

	public long getTotalSold() {
		return totalSold;
	}

	public void setTotalSold(long totalSold) {
		this.totalSold = totalSold;
	}
}
