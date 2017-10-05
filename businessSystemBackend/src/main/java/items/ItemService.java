package items;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.Item;

public interface ItemService {
	List<Item> getAllItems(Connection conn) throws SQLException;
	List<Item> getAllItemsByCategory(Connection conn) throws SQLException;
	List<Item> getAllItemsBySupplier(Connection conn) throws SQLException;
	
	Item getItemByName(Connection conn, String itemName) throws SQLException;
	Item getItemByID(Connection conn, long itemID) throws SQLException;
	
	void postItem(Connection conn, Item item) throws SQLException;
	void updateItem(Connection conn, Item item) throws SQLException;
	void deleteItem(Connection conn, Item item) throws SQLException;
	
}
