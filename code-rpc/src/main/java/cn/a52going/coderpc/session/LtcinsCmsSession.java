package cn.a52going.coderpc.session;
public class LtcinsCmsSession extends LoginSession {
    private static final long serialVersionUID = 1L;
    private Long userId;
    private String account;
    private String avatar;
    private String fullname;
    private boolean systemAdmin = false;
    private Long orgId;
    private Integer orgLevel;
    private String orgLinks;
    private boolean withOption = false;

    public LtcinsCmsSession() {
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public boolean isSystemAdmin() {
        return this.systemAdmin;
    }

    public void setSystemAdmin(boolean systemAdmin) {
        this.systemAdmin = systemAdmin;
    }

    public Long getOrgId() {
        return this.orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Integer getOrgLevel() {
        return this.orgLevel;
    }

    public void setOrgLevel(Integer orgLevel) {
        this.orgLevel = orgLevel;
    }

    public String getOrgLinks() {
        return this.orgLinks;
    }

    public void setOrgLinks(String orgLinks) {
        this.orgLinks = orgLinks;
    }

    public boolean isWithOption() {
        return this.withOption;
    }

    public void setWithOption(boolean withOption) {
        this.withOption = withOption;
    }

    public String toString() {
        return "[account:" + this.account + ",userId:" + this.userId + "]";
    }
}
