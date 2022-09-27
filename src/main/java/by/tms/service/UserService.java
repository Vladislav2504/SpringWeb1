package by.tms.service;

import by.tms.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Component
public class UserService {

	public void save(User user){
		System.out.println(user);
	}

}
