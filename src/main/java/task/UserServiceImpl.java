package task;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;

/**
 * @author ：mizhaoya
 * @date ：2020/3/26 15:41
 * @description：
 */
public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(User user) throws Exception {
        jdbcTemplate.update("insert into user(name, age, sex) values(?, ?, ?)",
                new Object[]{user.getName(), user.getAge(), user.getSex()},
                new int[] {Types.VARCHAR, Types.INTEGER, Types.VARCHAR});
        throw new RuntimeException("aa");
    }
}
