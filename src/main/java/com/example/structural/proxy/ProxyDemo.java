package com.example.structural.proxy;

import com.example.structural.proxy.helper.YoutubeDownloader;
import com.example.structural.proxy.service.ThirdPartyLibraryYoutubeLib;
import com.example.structural.proxy.service.YoutubeLibCacheProxy;

public class ProxyDemo {

    public static void main(String[] args) {
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyLibraryYoutubeLib());
        long naive = test(naiveDownloader);
        System.out.println("Time for naive downloader: " + naive + "ms");

        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeLibCacheProxy());
        long smart = test(smartDownloader);
        System.out.println("Time for smart downloader: " + smart + "ms");

        System.out.println("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        downloader.renderPopularVideos();
        downloader.renderPopularVideos();

        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
}
