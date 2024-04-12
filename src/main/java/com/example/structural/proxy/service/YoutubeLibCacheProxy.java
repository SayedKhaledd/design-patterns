package com.example.structural.proxy.service;

import com.example.structural.proxy.model.Video;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@NoArgsConstructor
@AllArgsConstructor
public class YoutubeLibCacheProxy implements YoutubeLib {
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private ThirdPartyLibraryYoutubeLib youtubeLib= new ThirdPartyLibraryYoutubeLib();

    @Override
    public HashMap<String, Video> popularVideos() {

        if (cachePopular.isEmpty()) {
            cachePopular = youtubeLib.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }
}
