package com.fastcampus.de.java.clip18;

import retrofit2.Call;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Call<Object> retrofitTest = RetrofitClient.getApi().retrofitTest(2);

        try {
            System.out.println(retrofitTest.execute().body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
