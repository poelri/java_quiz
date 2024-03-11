package ch13.Quiz04;

public class Main {
    public static void main(String[] args) {
        MusicThread musicThread= new MusicThread();
        YoutubeThread youtubeThread = new YoutubeThread();

        musicThread.start();
        youtubeThread.start();
    }
}
