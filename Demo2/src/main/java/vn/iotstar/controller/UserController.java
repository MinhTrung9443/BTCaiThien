package vn.iotstar.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import vn.iotstar.Entity.UserInfo;
import vn.iotstar.service.UserService;



@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
	private final UserService userser;
	
	@PostMapping("/new")
	public String addUser(@RequestBody UserInfo user) {
		return userser.addUser(user);
	}
	
}
