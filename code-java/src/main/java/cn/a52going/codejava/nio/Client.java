package cn.a52going.codejava.nio;


import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Client {
    public static void main (String[] args) throws Exception{
        SocketChannel client = SocketChannel.open();
        InetSocketAddress hostAddress = new InetSocketAddress("127.0.0.1", 8000);
        client.connect(hostAddress);
        ByteBuffer writeBuffer = ByteBuffer.allocate(32);
        ByteBuffer readBuffer = ByteBuffer.allocate(32);
    
    
        writeBuffer.put("hello".getBytes());
        writeBuffer.flip();
        while (true) {
            Thread.sleep(1000);
            writeBuffer.rewind();
            client.write(writeBuffer);
            readBuffer.clear();
            client.read(readBuffer);
            System.out.println(new java.lang.String(readBuffer.array()));
        }
    }
}
