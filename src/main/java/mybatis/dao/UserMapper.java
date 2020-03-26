package mybatis.dao;

import mybatis.User;

public interface UserMapper {
    public void insertUser(User user);

    public User getUser(Integer id);
}
