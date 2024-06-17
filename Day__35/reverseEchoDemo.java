import java.net.*;
import java.io.*;

public class reverseEchoDemo {

    public static void main(String[] args) throws Exception {

        ServerSocket s = new ServerSocket(2000);
        Socket skt = s.accept();

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
