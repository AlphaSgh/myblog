package com.ssgh.myblog.entity;

public class AdminUser {

    private Integer adminUserId;

    private String loginUserName;

    private String loginPassword;

    private String nickName;

    private Byte locked;

    public Integer getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(Integer adminUserId) {
        this.adminUserId = adminUserId;
    }

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName == null ? null : loginUserName.trim();
    }

    public String getLoginUserName() {
        return loginUserName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AdminUser{");
        sb.append("adminUserId=").append(adminUserId);
        sb.append(", loginUserName='").append(loginUserName).append('\'');
        sb.append(", loginPassword='").append(loginPassword).append('\'');
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append(", locked=").append(locked);
        sb.append('}');
        return sb.toString();
    }
}
