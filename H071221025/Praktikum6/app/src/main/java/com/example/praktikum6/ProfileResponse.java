package com.example.praktikum6;

import com.google.gson.annotations.SerializedName;

public class ProfileResponse {
    private UserResponse data;

    public UserResponse getData(){
        return data;
    }
}
