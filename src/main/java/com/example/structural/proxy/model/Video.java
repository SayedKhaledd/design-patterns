package com.example.structural.proxy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Video {
    private String id;
    private String title;
    private String data = "Random video.";

    public Video(String id, String title) {
        this.id = id;
        this.title = title;
    }
}
