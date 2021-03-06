package sk.upjs.paz1c.homer.dao.mysql;

import sk.upjs.paz1c.homer.mapper.ItemRowMapper;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import sk.upjs.paz1c.homer.Status;
import sk.upjs.paz1c.homer.dao.ItemDao;
import sk.upjs.paz1c.homer.entity.Item;
import sk.upjs.paz1c.homer.entity.ShoppingList;

/**
 *
 * @author dyske
 */
public class MysqlItemDao extends MysqlGenericDao<Item> implements ItemDao {

    /**
     * @see MysqlGenericDao#tableName
     */
    public static final String TABLE_NAME = "items";

    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private ItemRowMapper itemRowMapper = new ItemRowMapper();

   
    
    /**
     * @see MysqlGenericDao
     * @param jdbcTemplate
     */
    public MysqlItemDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate, new ItemRowMapper(), TABLE_NAME);
    }

    /**
     * {@inheritDoc}
     * @param item
     */
    @Override
    public void store(Item item) {
        storeMap.put("id", item.getId());
        storeMap.put("list_id", item.getListId());
        storeMap.put("product_id", item.getProductId());
        storeMap.put("recipe_id", item.getRecipeId());
        storeMap.put("amount", item.getAmount());
        storeMap.put("unit", item.getUnit());
        storeMap.put("status", item.getStatus().toInt());
        super.store(item);
    }

    /**
     * {@inheritDoc}
     * @param item
     */
    @Override
    public void done(Item item) {
        jdbcTemplate.update("UPDATE " + TABLE_NAME + " SET status = ? WHERE id = ?", Status.DONE, item.getId());
    }

    /**
     * {@inheritDoc}
     * @param shoppingList
     * @return
     */
    @Override
    public List<Item> findAll(ShoppingList shoppingList) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
