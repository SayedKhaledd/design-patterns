package com.example.structural.proxy.service;

import com.example.structural.proxy.model.Video;

import java.util.HashMap;

public interface YoutubeLib {

    HashMap<String, Video> popularVideos();
}
