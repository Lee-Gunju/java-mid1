package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {

    private final String address;
    public boolean connectError;
    public boolean sendError;


    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 {
        if (connectError) {
            throw new ConnectExceptionV3(address, address + "서버 연결 실패");
        }
        System.out.println("Connecting to " + address);
    }

    public void send(String data) throws SendExceptionV3 {
        if (sendError) {
            throw new SendExceptionV3(data, address + "서버에 데이터 전송 실패" + data);
            // 중간에 다른 예외가 발생했다고 가정
            //throw new RuntimeException("ex");
        }
        System.out.println(address + " Sending  " + data);
    }

    public void disconnect() {
        System.out.println(address + " Disconnected");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
