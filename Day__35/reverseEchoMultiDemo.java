import java.net.*;
import java.io.*;

public class reverseEchoMultiDemo extends Thread {

    Socket skt;

    public reverseEchoMultiDemo(Socket st)

    {
        skt = st;
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            PrintStream ps = new PrintStream(skt.getOutputStream());

            String msg;

            StringBuilder sb;

            do {
                msg = br.readLine();
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();
                ps.println(msg);

            } while (!msg.equals("dne"));

        } catch (Exception e) {
        }
    }

    public static void main(String[] args) throws Exception {
        int count = 1;
        ServerSocket s = new ServerSocket(2000);
        Socket skt;
        reverseEchoMultiDemo re;

        do {
            skt = s.accept();
            System.out.println("Client Connected: " + count++);
            re = new reverseEchoMultiDemo(skt);
            re.start();
        } while (true);

    }

}

class Client {

    public static void main(String[] args) throws Exception {

        Socket skt = new Socket("Localhost", 2000);

        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
        PrintStream ps = new PrintStream(skt.getOutputStream());

        String msg;

        do {
            msg = k.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From Server: " + msg);

        } while (!msg.equals("dne"));
        skt.close();
    }

}
