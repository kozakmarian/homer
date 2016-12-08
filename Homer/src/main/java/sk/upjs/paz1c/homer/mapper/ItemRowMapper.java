package sk.upjs.paz1c.homer.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import sk.upjs.paz1c.homer.entity.Item;

/**
 *
 * @author dyske
 */
public class ItemRowMapper implements RowMapper<Item> {

    /**
     *
     * @param rs
     * @param i
     * @return
     * @throws SQLException
     */
    @Override
    public Item mapRow(ResultSet rs, int i) throws SQLException {
        Item item = new Item();
        item.setAmount(rs.getFloat("amount"));
        item.setProduct_id(rs.getLong("product_id"));
        item.setId(rs.getLong("id"));
        item.setList_id(rs.getLong("list_id"));
        item.setStatus(rs.getInt("status"));
        item.setUnit(rs.getString("unit"));

        return item;
    }

}
