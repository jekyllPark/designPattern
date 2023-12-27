package com.jekyllpark.designpattern.structural.facade.example.e1.complex_media_library;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("codecFactory >> extracting mpeg audio");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("codecFactory >> extracting ogg audio");
            return new OggCompressionCodec();
        }
    }
}
