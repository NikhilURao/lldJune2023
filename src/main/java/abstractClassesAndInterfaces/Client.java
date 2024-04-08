package abstractClassesAndInterfaces;

import abstractClassesAndInterfaces.files.AudioFile;
import abstractClassesAndInterfaces.files.ImageFile;
import abstractClassesAndInterfaces.files.VideoFile;
import abstractClassesAndInterfaces.library.MultimediaLibrary;

public class Client {

    public static void main(String[] args) {
        // Create a multimedia library
        MultimediaLibrary library = new MultimediaLibrary();

        // Add some multimedia files to the library
        AudioFile audioFile1 = new AudioFile("Song1", "Artist1", 180, "MP3", "/path/to/song1.mp3", 5_000_000);
        AudioFile audioFile2 = new AudioFile("Song2", "Artist2", 240, "WAV", "/path/to/song2.wav", 10_000_000);
        VideoFile videoFile = new VideoFile("Movie1", "Director1", 7200, "1080p", 1.78, "/path/to/movie1.mp4", 2_000_000_000);
        ImageFile imageFile = new ImageFile("Photo1", "Photographer1", "png", "/path/to/photo1.jpg", 2);

        library.addFile(audioFile1);
        library.addFile(audioFile2);
        library.addFile(videoFile);
        library.addFile(imageFile);

        // Play all audio files in the library
        System.out.println("Playing all audio files:");
        library.playAllAudio();
        System.out.println();

        // Display metadata for all files in the library
        System.out.println("Displaying metadata for all files:");
        library.displayAllMetadata();
        System.out.println();

        // Rename an audio file
        audioFile1.renameFile("NewSongTitle");
        System.out.println("After renaming audioFile1:");
        audioFile1.displayMetadata();
        System.out.println();

        // Save a video file to a new location
        String newFilePath = "/path/to/new/location/movie1.mp4";
        videoFile.saveToFile(newFilePath);


    }
}

class P {
    protected int d1 = 10;
    protected int d = 100;

    static int d3 = 100;
    protected void fun1(){
        System.out.println("P's fun1");
    } protected void fun(){
        System.out.println("P's fun");
    }
    static protected void sfun(){
        System.out.println("P's sfun");
    }
}
class C extends P{
    protected int d2 = 20;
    protected int d = 200;

    static int d3 = 30;
    protected void fun2(){
        System.out.println("C's fun2");
    }
    protected void fun(){
        System.out.println("C's fun");
    }
    static protected void sfun(){
        System.out.println("C's sfun");
    }
}
class Client1 {
    public static void main(String[] args) {
        P obj = new C();
        System.out.println(obj.d1);
        System.out.println(obj.d);
        obj.fun1();
        obj.fun();
        obj.sfun();
    }
}

class Parent {

    static int d = 100;
    static void staticMethod() {
        System.out.println("Static method from Parent class");
    }
}

class Child extends Parent {
    static int d = 200;
    // This static method hides the staticMethod in Parent class
    static void staticMethod() {
        System.out.println("Static method from Child class");
    }
}

class Main {
    public static void main(String[] args) {
        Parent.staticMethod();
        Child.staticMethod();
        System.out.println(Parent.d);
        System.out.println(Child.d);
    }
}
