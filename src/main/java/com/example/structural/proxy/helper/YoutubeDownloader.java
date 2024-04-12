package com.example.structural.proxy.helper;

import com.example.structural.proxy.service.YoutubeLib;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class YoutubeDownloader {

    private YoutubeLib api;


    public void renderPopularVideos() {
        var list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on Youtube (imagine fancy HTML)");
        for (var video : list.values()) {
            System.out.println("ID: " + video.getId() + " / Title: " + video.getTitle());
        }
        System.out.println("-------------------------------\n");
    }
}
