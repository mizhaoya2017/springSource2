package task;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ：mizhaoya
 * @date ：2020/3/26 15:35
 * @description：
 */
public class UserRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet set, int index) throws SQLException {
        User person = new User(set.getInt("id"), set.getString("name"), set.getInt("age"), set.getString("sex"));
        return person;
    }
}
