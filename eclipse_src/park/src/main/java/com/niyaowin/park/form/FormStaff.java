package com.niyaowin.park.form;

//staff_id	serial
//is_super	boolean
//phone	varchar(32)
//mail	varchar(64)
//password_hash	bytea
//salt	bytea
//nickname	varchar(128)
//real_name	varchar(128)


public class FormStaff {

   
	private long staffId;
 
	private boolean isSuper;
    private String phone;
    private String mail;
    private String password;
    private String password2;    
    private String nickname;
    private String realName;

    public long getStaffId() {
		return staffId;
	}
	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}
	public boolean isSuper() {
		return isSuper;
	}
	public void setSuper(boolean isSuper) {
		this.isSuper = isSuper;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

}
