package cn.itrover.dao;

import cn.itrover.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao implements IUserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Transactional
	@Override
	public User getUserById(Integer id) {
		String sql = "select * from t_user where id = ?";
		return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
			User user = new User();
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			return user;
		}, id);
	}
}
