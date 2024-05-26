package exception.ex0;

public class NetworkClientV0 {

    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println("Connecting to " + address);
        return "success";
    }

    public String send(String data) {
        System.out.println(address + " Sending  " + data);
        return "success";
    }
    public void disconnect() {
        System.out.println(address + " Disconnected");

    }
}
