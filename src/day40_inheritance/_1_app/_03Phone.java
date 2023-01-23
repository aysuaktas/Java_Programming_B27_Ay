package day40_inheritance._1_app;

import day40_inheritance._1_app._02Youtube;

public class _03Phone {

    public static void main(String[] args) {

        _02Youtube youtube = new _02Youtube(4.8);
        System.out.println(youtube.name);   // Youtube
        System.out.println(youtube.version);  // 4.8
        youtube.download();   // Youtube is downloading version 4.8
        youtube.watchVideo();  // Watching java tutorial


    }
}
