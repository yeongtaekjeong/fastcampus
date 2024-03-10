package com.fastcampus.de.java.clip12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResourceStatement {

    public static void main(String[] args) throws IOException {
        try(FileOutputStream out = new FileOutputStream("test.txt")) {
            out.write("Hello World!".getBytes(StandardCharsets.UTF_8));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Try-With-Resource 를 사용하지 않을 때 close를 해줘야함.
//        out.close();

    }
}
