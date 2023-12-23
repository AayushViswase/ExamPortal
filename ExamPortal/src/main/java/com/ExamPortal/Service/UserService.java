package com.ExamPortal.Service;

import java.util.Set;

import com.ExamPortal.Model.User;
import com.ExamPortal.Model.UserRole;

public interface UserService {
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;

	public User getUser(String userName);

	public void deleteUser(Long userId);

}
