package com.jekyllpark.designpattern.structural.facade.example.e1;

import com.jekyllpark.designpattern.structural.facade.example.e1.facade.VideoConversionFacade;

import java.io.File;

public class FacadeService {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4 = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
