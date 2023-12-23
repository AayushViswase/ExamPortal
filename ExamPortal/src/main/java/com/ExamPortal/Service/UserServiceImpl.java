package com.ExamPortal.Service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.ExamPortal.Model.User;
import com.ExamPortal.Model.UserRole;
import com.ExamPortal.Repo.RoleRepository;
import com.ExamPortal.Repo.UserRepository;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User local = this.userRepository.findByUserName(user.getUserName());
		if (local != null) {
			throw new Exception("User already present");
		} else {
			for (UserRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
		}
		return local;
	}

}
