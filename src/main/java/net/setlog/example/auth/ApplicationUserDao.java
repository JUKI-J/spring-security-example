package net.setlog.example.auth;

import java.util.Optional;

public interface ApplicationUserDao {

	public Optional<ApplicationUser> selectApplicationuserByUsername(String username);
	
}
