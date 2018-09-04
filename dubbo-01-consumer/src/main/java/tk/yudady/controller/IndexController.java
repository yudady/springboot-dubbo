package tk.yudady.controller;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.yudady.model.User;
import tk.yudady.service.UserService;

@RestController
public class IndexController {

	@Autowired
	UserService userService;

	@GetMapping("/")
	public Object index() {

		List<User> users = userService.findAll(1);

		users.stream().forEach(e -> {
			String u = ToStringBuilder.reflectionToString(e, ToStringStyle.MULTI_LINE_STYLE);
			System.out.println(u);
		});
		return users;
	}
}
