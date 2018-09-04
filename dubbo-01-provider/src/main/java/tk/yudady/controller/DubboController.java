package tk.yudady.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.alibaba.dubbo.config.annotation.Service;

import tk.yudady.model.User;
import tk.yudady.service.UserService;

@Controller
public class DubboController {

	@Autowired
	private UserService userService;

	public List<User> findAll(int id) {
		return userService.findAll(1);
	}
}
