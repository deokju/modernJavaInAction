package p_function;

import java.util.List;

public class RequestVo {
    private final String username;
    private final  String password;
    private final  String connectedDevice;
    private final  String connectedIp;

    public RequestVo(String username, String password, String connectedDevice, String connectedIp) {
        this.username = username;
        this.password = password;
        this.connectedDevice = connectedDevice;
        this.connectedIp = connectedIp;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getConnectedDevice() {
        return connectedDevice;
    }

    public String getConnectedIp() {
        return connectedIp;
    }

    @Override
    public String toString() {
        return String.format("RequestVo{username='%s', password='%s', connectedDevice='%s', connectedIp='%s'}",
                             username, password, connectedDevice, connectedIp);
    }

    public static List<RequestVo> getSamples() {
        return List.of(
                  new RequestVo("user1", "password1", "PC", "127.0.0.1")
                , new RequestVo("user2", "password2", "PC", "127.0.0.1")
        );
    }
}