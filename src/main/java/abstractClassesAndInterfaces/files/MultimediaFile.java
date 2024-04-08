package abstractClassesAndInterfaces.files;

public abstract class MultimediaFile {
    protected String title;
    protected String author;
    protected int duration; // in seconds
    protected String filePath; // Path or location of the file
    protected long fileSize; // Size of the file in bytes

    public abstract void displayMetadata();

    // Concrete methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getDuration() {
        return duration;
    }

    public String getFilePath() {
        return filePath;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void renameFile(String newTitle) {
        System.out.println("Renaming " + title + " to " + newTitle);
        this.title = newTitle;
    }

    public void saveToFile(String filePath) {
        System.out.println("Saving " + title + " to " + filePath);
    }

    void play(){

    }

    void stop(){

    }
}