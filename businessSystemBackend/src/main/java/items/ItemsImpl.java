package items;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import model.Item;

public class ItemsImpl implements ItemService {
	
	// Get all items from the database. Then put them in a list.
	@Override
	public List<Item> getAllItems(Connection conn) throws SQLException {
		System.out.println("getAllItems ->");
		List<Item> items = new LinkedList<Item>();
		String query = "SELECT * FROM items";
		
		System.out.println("getAllItems Query:| " + query + " |");
		
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(query);
		
		while (result.next()) {
			items.add(new Item(result.getInt("ItemId"),result.getString("Item_name"),result.getLong("Item_quantity"),result.getDouble("Item_price"),result.getString("Item_category"),result.getDouble("Item_weight"),result.getString("Item_supplier"),result.getBoolean("Item_unpacked"),result.getLong("Item_totalSold")));
		}
		if (!statement.getConnection().isClosed()) {
			statement.close();
		}
		System.out.println("Search done: Size of List: " + items.size() + "\nGetAllItems <-");
		return items;
	}
	
	/* Get all items from database, by searching for category name. Returns all the items
	 that got the same category as the search word. */
	@Override
	public List<Item> getAllItemsByCategory(Connection conn, String searchCategory) throws SQLException {
		List<Item> items = new LinkedList<Item>();
		String query = "SELECT * FROM items WHERE Item_category = ?";
		
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setString(1, searchCategory);
		ResultSet result = statement.executeQuery(query);
		
		while (result.next()) {
			items.add(new Item(result.getInt("ItemId"),result.getString("Item_name"),result.getLong("Item_quantity"),result.getDouble("Item_price"),result.getString("Item_category"),result.getDouble("Item_weight"),result.getString("Item_supplier"),result.getBoolean("Item_unpacked"),result.getLong("Item_totalSold")));
		}
		if (!statement.getConnection().isClosed()) {
			statement.close();
		}
		
		return items;
	}


	/* Get all items from database, by searching for supplier name. Returns all the items
	  that got the same supplier as the search word. */
	@Override
	public List<Item> getAllItemsBySupplier(Connection conn, String searchSupplier) throws SQLException {
		List<Item> items = new LinkedList<Item>();
		String query = "SELECT * FROM items WHERE Item_supplier = ?";
		
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setString(1, searchSupplier);
		ResultSet result = statement.executeQuery(query);
		
		while (result.next()) {
			items.add(new Item(result.getInt("ItemId"),result.getString("Item_name"),result.getLong("Item_quantity"),result.getDouble("Item_price"),result.getString("Item_category"),result.getDouble("Item_weight"),result.getString("Item_supplier"),result.getBoolean("Item_unpacked"),result.getLong("Item_totalSold")));
		}
		if (!statement.getConnection().isClosed()) {
			statement.close();
		}
		
		return items;
	}
	
	// Get the item by searching for the name. Returns the item with matching name.
	@Override
	public Item getItemByName(Connection conn, String itemName) throws SQLException {
		String query = "SELECT * FROM Items WHERE Item_name = ?";
		Item item = null;
		
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setString(1, itemName);
		ResultSet result = statement.executeQuery();
		
		if (result.next()) {
			item = new Item(result.getInt("ItemId"),result.getString("Item_name"),result.getLong("Item_quantity"),result.getDouble("Item_price"),result.getString("Item_category"),result.getDouble("Item_weight"),result.getString("Item_supplier"),result.getBoolean("Item_unpacked"),result.getLong("Item_totalSold"));
		}
		return item;
	}
	
	// Get the item by searching for the ID. Returns the item with matching ID.
	@Override
	public Item getItemByID(Connection conn, long itemID) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	// Add new item to the database. 
	@Override
	public void postItem(Connection conn, Item item) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	// Update a current item from the database.
	@Override
	public void updateItem(Connection conn, Item item) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	// Delete item from the database.
	@Override
	public void deleteItem(Connection conn, Item item) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
