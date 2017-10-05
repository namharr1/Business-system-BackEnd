package items;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.Item;

public class ItemsImpl implements ItemService {

	@Override
	public List<Item> getAllItems(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getAllItemsByCategory(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getAllItemsBySupplier(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getItemByName(Connection conn, String itemName) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getItemByID(Connection conn, long itemID) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void postItem(Connection conn, Item item) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateItem(Connection conn, Item item) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(Connection conn, Item item) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
