package com.fortunateai;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import okhttp3.*;
import org.json.JSONObject;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private OkHttpClient client = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateVideo("A futuristic metropolis at dawn filled with flying cars");
    }

    private void generateVideo(String prompt) {
        try {
            JSONObject jsonBody = new JSONObject();
            jsonBody.put("prompt", prompt);
            jsonBody.put("spicy_mode", true);
            jsonBody.put("moderation_level", 0);
            jsonBody.put("ethical_level", 0);

            RequestBody body = RequestBody.create(jsonBody.toString(), MediaType.get("application/json; charset=utf-8"));
            Request request = new Request.Builder()
                    .url("https://api.grok.ai/v1/generate/video")
                    .addHeader("Authorization", "Bearer xai-BDLiYzwEhxzEm1ro7Hddw1ijJ4dGmzyjZyLVppn5I7TM6KPhDM3u7JP9MKabmrms1KRWjcrXpscsh3pq")
                    .post(body)
                    .build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if (response.isSuccessful()) {
                        String responseData = response.body().string();
                        // TODO: Parse responseData for video URL and update UI
                    }
                }
            });
        } catch (Exception e) {
            e.printStack
