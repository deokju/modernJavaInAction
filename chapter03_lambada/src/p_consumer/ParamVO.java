package p_consumer;

public class ParamVO {
    public ParamVO(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    private  String username;
    private  String email;
    private  String password;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ParamVO{");
        sb.append("username='").append(username).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
