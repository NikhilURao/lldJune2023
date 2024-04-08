package abstractClassesAndInterfaces.files;

import abstractClassesAndInterfaces.interfaces.Playable;

public class AudioFile extends MultimediaFile implements Playable {
    private String format;
    private float qualityScore ;

    public AudioFile(String title, String author, int duration, String format, String filePath, long fileSize) {
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.format = format;
        this.filePath = filePath;
        this.fileSize = fileSize;
    }

    @Override
    public void displayMetadata() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Duration: " + duration + " seconds");
        System.out.println("Format: " + format);
        System.out.println("File Path: " + filePath);
        System.out.println("File Size: " + fileSize + " bytes");
        System.out.println(""); // qualityScore
    }

    @Override
    public void play() {
        System.out.println("Playing audio: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopping audio: " + title);
    }

//    public void rename(String newTitle) {
//        renameFile(newTitle);
//    }
}