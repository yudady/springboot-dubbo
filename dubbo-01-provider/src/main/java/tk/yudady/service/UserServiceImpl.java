package tk.yudady.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import tk.yudady.model.User;

@Service
@Component
public class UserServiceImpl implements UserService {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<User> findAll(int id) {
		List<User> users = new ArrayList<>();
		users.add(new User(1, "tommy"));
		users.add(new User(2, "kevin"));
		users.add(new User(3, "ginger"));

		logger.info("findAll => {} ", users);

		return users;
	}
}
