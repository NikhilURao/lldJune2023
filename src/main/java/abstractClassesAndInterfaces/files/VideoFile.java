package abstractClassesAndInterfaces.files;

import abstractClassesAndInterfaces.interfaces.Playable;

public class VideoFile extends MultimediaFile implements Playable {
    private String videoQuality;
    private double aspectRatio;

    public VideoFile(String title, String author, int duration, String videoQuality, double aspectRatio, String filePath, long fileSize) {
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.videoQuality = videoQuality;
        this.aspectRatio = aspectRatio;
        this.filePath = filePath;
        this.fileSize = fileSize;
    }


    @Override
    public void displayMetadata() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Duration: " + duration + " seconds");
        System.out.println("Video Quality: " + videoQuality);
        System.out.println("Aspect Ratio: " + aspectRatio);
        System.out.println("File Path: " + filePath);
        System.out.println("File Size: " + fileSize + " bytes");
    }

    @Override
    public void play() {
        System.out.println("Playing audio: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopping audio: " + title);
    }

    public void rename(String newTitle) {
        renameFile(newTitle);
    }
}