package net.setlog.example.auth;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class ApplicationUser implements UserDetails{

	private final Set<? extends GrantedAuthority> grantedAuthorites;
	private final String password;
	private final String username;
	private final boolean isAccountNonExpired;
	private final boolean isAccountNonLocked;
	private final boolean isCredentialNonExpired;
	private final boolean isEnabled;
	
	public ApplicationUser(String usename
							, String password
							, Set<? extends GrantedAuthority> grantedAuthorites
							, boolean isAccountNonExpired
							, boolean isAccountNonLocked
							, boolean isCredentialNonExpired
							, boolean isEnabled) 
	{
		this.grantedAuthorites = grantedAuthorites;
		this.password = password;
		this.username = usename;
		this.isAccountNonExpired = isAccountNonExpired;
		this.isAccountNonLocked = isAccountNonLocked;
		this.isCredentialNonExpired = isCredentialNonExpired;
		this.isEnabled = isEnabled;
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return grantedAuthorites;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return isAccountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return isCredentialNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return isEnabled;
	}

	
	
}
