package shujia25.day18.UDPTest;

public class Student {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TalkSend(10086, "192.168.23.62", 10001));

    }
}
