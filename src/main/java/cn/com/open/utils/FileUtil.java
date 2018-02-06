package cn.com.open.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * Created by lucky on 2017/6/28.
 */
public class FileUtil {
    /**
     * Gets file content.
     *
     * @param url the url
     * @return the file content
     */
    public static String getFileContent(URL url) {
        File file = new File(url.getFile());
        BufferedReader reader = null;
        StringBuilder sb = new StringBuilder();
        try {
            //System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                sb.append(tempString);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }

        return sb.toString();
    }
}
