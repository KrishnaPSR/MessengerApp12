package com.example.messengerapp.Fragments;

import com.example.messengerapp.Notifications.MyResponse;
import com.example.messengerapp.Notifications.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService
{
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAGVjwam8:APA91bFj7LTYC2WcTSGJQTaaQmAIRs6MdDMW8HZrIpuRlzGhWZs9j1AHdAQ6pRGoTaJWw6ZOs6IK_FCOhA8QXwTPWZpIk8TflK9TbZ3dimEICON6a8Pk2VtgSVJ7uHgmQLQrbrnznGUc"
    })

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
