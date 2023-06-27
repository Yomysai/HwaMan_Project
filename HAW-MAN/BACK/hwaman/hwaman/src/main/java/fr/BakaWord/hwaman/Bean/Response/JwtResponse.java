/**
 * 
 */
package fr.BakaWord.hwaman.Bean.Response;

import java.util.List;

/**
 * @author aly_d
 *
 */
public class JwtResponse {
	private String token;

	private String type = "Bearer";

	private int id;

	private String email;
	private String fullName;

	private List<String> roles;

	public JwtResponse(String accesstoken, int id, String email, List<String> roles) {
		this.token = accesstoken;
		this.id = id;
		this.email = email;
		this.roles = roles;
	}
	public JwtResponse(String accesstoken, int id, String email, String fullName, List<String> roles) {
		this.token = accesstoken;
		this.id = id;
		this.email = email;
		this.fullName = fullName;
		this.roles = roles;
	}

	/**
	 * @return the token
	 */
	public String getAccessToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setAccessToken(String accesstoken) {
		this.token = accesstoken;
	}

	/**
	 * @return the type
	 */
	public String getTokenType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setTokenType(String tokentype) {
		this.type = tokentype;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the roles
	 */
	public List<String> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
