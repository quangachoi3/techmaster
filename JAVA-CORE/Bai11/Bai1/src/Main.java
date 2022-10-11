import com.google.gson.Gson;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        Post post = new Post();
        post.setTitle("Convert Java Object to String Json");
        post.setId("a1514");
        post.setDescription("Use Jackson JSON API");
        post.setContent("HTML content");
        post.setLastUpdateAt(new Date());
        post.setPostedAt(new Date());

        System.out.println(post.toString());

        Gson gson = new Gson();

        //Chuyển đổi từ Object sang JSON
        String result = gson.toJson(post);
        System.out.println(result);

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("D:/workplace/JAVA-TECHMASTER/JAVA-CORE/Bai11/Bai1/src/test.txt");
            outputStream.write(result.getBytes());
//                System.out.println(c);
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

}