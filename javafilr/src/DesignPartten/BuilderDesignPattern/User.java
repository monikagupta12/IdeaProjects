package DesignPartten.BuilderDesignPattern;

public class User {
    private String userName;
    private String userId;
    private String emailId;

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmailId() {
        return emailId;
    }

    private User (UserBuilder ub){
        this.emailId=ub.emailId;
        this.userId=ub.userId;
        this.userName=ub.userName;
    }
    static class UserBuilder{
        public String userName;
        public String userId;
        public String emailId;
        public UserBuilder(){ }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public static UserBuilder getUserBuilder(){
            return new UserBuilder();
        }
        public User getUser(){
            return new User(this);
        }
    }
    @Override
    public String toString(){
        return "[ UserID="+ userId +" UserName="+ userName +" EmailId="+emailId+" ]";
    }
}
