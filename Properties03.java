package default2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 使用Properties 类来创建 配置文件, 修改配置文件内容
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
        //使用Properties 类来创建 配置文件, 修改配置文件内容

        Properties properties = new Properties();
        //创建
        //1.如果该文件没有key 就是创建
        //2.如果该文件有key ,就是修改

        properties.setProperty("charset", "utf8");
        properties.setProperty("user", "汤姆1");//注意保存时，是中文的 unicode码值
        properties.setProperty("pwd", "888888");

        //将k-v 存储文件中即可
        properties.store(new FileOutputStream("out\\mysql2.properties"), null);
        System.out.println("保存配置文件成功~");

    }
}
