import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/**TCP 网络程序是指利用 Socket 编写的通信程序。*/
/**利用 TCP 协议进行通信的两个应用程序是有主次之分的，一个是服务器程序，一个是客户端程序，两者的功能和编写方法不太一样。*/
public class MyTomcat1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);/**其中 ServerSocket 类表示 Socket 服务器端。ServerSocket(int port)：创建绑定到特定端口的服务器套接字。*/
        System.out.println("Server startup in 1428ms");/**Socket 类表示 Socket 客户端*/
        Socket s = ss.accept();/**服务器调用 accept() 方法等待客户端来连接*/


        InputStream is = s.getInputStream();
/**Socket两个关键的方法，一个是getInputStream方法，另一个是getOutputStream方法。
 getInputStream方法可以得到一个输入流，即从服务器端发回的数据流。
 GetOutputStream方法得到一个输出流，即将要发送到服务器端的数据流.
 其实是一个缓冲区，暂时存储将要发送过去的数据。*/

        InputStreamReader isr = new InputStreamReader(is);

        BufferedReader br = new BufferedReader(isr);

        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        /** BufferedReader从一个输入的字符流中读取文本，为字符、数组、一行文本的高效读取提供字符缓冲功能。
         BufferedReader的read()方法，功能：读取单个字符的个数。readLine()方法功能：读取一个文本行。*/
    }}




        /** 服务器套接字一次可以与一个套接字连接。
         如果多台客户端同时提出连接请求，服务器套接字会将请求连接的客户端存入队列中，然后从中取出一个套接字与服务器新建的套接字连接起来。
         若请求连接大于最大容纳数，则多出的连接请求被拒绝。
         默认的队列大小是 50。*/





//服务器端创建一个 ServerSocket（服务器端套接字）。
//客户端程序创建一个 Socket，请求与服务器建立连接。
//服务器接收客户的连接请求，同时创建一个新的 Socket 与客户建立连接，服务器继续等待新的请求。










