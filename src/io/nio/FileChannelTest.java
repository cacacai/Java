package io.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelTest {
    public static void main(String[] args){

        try{
            File file=new File("/home/cai/test.txt");
            FileOutputStream outputStream=new FileOutputStream(file);
            FileChannel channel=outputStream.getChannel();//获取channel
            ByteBuffer buffer=ByteBuffer.allocate(1024);//分配空间大小
            String string="hello world";
            buffer.put(string.getBytes());
            buffer.flip();
            channel.write(buffer);//此处必须要调用在write前 必须要调用 buffer的flip方法
            channel.close();
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
