package abstractClassesAndInterfaces.files;

import abstractClassesAndInterfaces.interfaces.Playable;

public class ImageFile extends MultimediaFile {
    private String format;

    public ImageFile(String title, String author, String format, String filePath, long fileSize) {
        this.title = title;
        this.author = author;
        this.format = format;
        this.filePath = filePath;
        this.fileSize = fileSize;
    }

    public void rename(String newTitle) {
        renameFile(newTitle);
    }

    @Override
    public void displayMetadata() {

    }
}