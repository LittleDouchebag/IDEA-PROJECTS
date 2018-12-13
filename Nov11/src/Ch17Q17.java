import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ch17Q17 {
    public static void main(String[] args)throws FileNotFoundException {
        BitOutputStream bitOutputStream = new BitOutputStream(new File("Q17output.txt"));
        for (int i=0;i<10;i++){
            bitOutputStream.writeBit('0');
            bitOutputStream.writeBit('1');
        }
//        bitOutputStream.close();
        bitOutputStream.writeBit("01010101010101011");
        bitOutputStream.close();
    }
}

class BitOutputStream {
    short Bitbuffer=0;
    int BitCount=0;
    PrintWriter printWriter;
    public BitOutputStream(File file) throws FileNotFoundException {
        this.printWriter = new PrintWriter(file);
    }

    public void writeBit(char bit){
        BitCount++;
        Bitbuffer <<=1;
        if (bit == '1')
            Bitbuffer++;
        if (BitCount==8) {
            System.out.print((char)(Bitbuffer));
            printWriter.print((char)(Bitbuffer));
            Bitbuffer=0;
            BitCount=0;
        }
    }
    public void writeBit(String inputString){
        for (int i=0;i<inputString.length();i++){
            writeBit(inputString.charAt(i));
        }
    }
    public void close(){
        for (;BitCount<8;BitCount++)
            Bitbuffer<<=1;
        System.out.print((char)(Bitbuffer));
        printWriter.print((char)(Bitbuffer));
        printWriter.close();、
        Bitbuffer=0;
        BitCount=0;
    }
}