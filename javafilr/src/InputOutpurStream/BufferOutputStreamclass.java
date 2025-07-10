package InputOutpurStream;

import java.io.*;

public class BufferOutputStreamclass {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt");
        FileOutputStream fos=new FileOutputStream(file,true);
        BufferedOutputStream os=new BufferedOutputStream(fos);
        String s="this is bufferedClass";
        byte[] b=s.getBytes();
        os.write(b);
        os.close();

    }
}
