package default2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 演示 PrintWriter 使用方式
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {

        //PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("d:\\f2.txt"));
        printWriter.print("hi, 北京你好1~~~~");//也可以用write,但print可以格式化输出
        printWriter.close();//flush + 关闭流, 才会将数据写入到文件..

    }
}
