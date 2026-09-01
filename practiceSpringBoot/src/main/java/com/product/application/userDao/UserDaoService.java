package com.product.application.userDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.product.application.entity.HelloUser;

public class UserDaoService {

	public static int usersCount = 5;

	private static List<HelloUser> users = new ArrayList<>();

	static {
		users.add(new HelloUser(1, "John", new Date()));
		users.add(new HelloUser(2, "Robert", new Date()));
		users.add(new HelloUser(3, "Adam", new Date()));
		users.add(new HelloUser(4, "Andrew", new Date()));
		users.add(new HelloUser(5, "Jack", new Date()));
	}

	public List<HelloUser> findAll() {
		return users;
	}

	public HelloUser save(HelloUser user) {
		if (user.getId() == null) {

			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}

	public HelloUser findOne(int id) {
		for (HelloUser user : users) {
			if (user.getId() == id)
				return user;
		}
		return null;

	}
}
