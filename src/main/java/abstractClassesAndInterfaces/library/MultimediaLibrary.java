package abstractClassesAndInterfaces.library;

import abstractClassesAndInterfaces.files.MultimediaFile;
import abstractClassesAndInterfaces.interfaces.Playable;

import java.util.ArrayList;
import java.util.List;

public class MultimediaLibrary {
    // types of files => audio, image, video
    private List<MultimediaFile> files;

    public MultimediaLibrary() {
        files = new ArrayList<>();
    }

    public void addFile(MultimediaFile file) {
        files.add(file);
    }

    public void displayAllMetadata() {
        for (MultimediaFile file : files) {
            file.displayMetadata();
        }
    }

    public void playAllAudio() {
        for (MultimediaFile file : files) {
            if (file instanceof Playable) {
                Playable playable = (Playable) file;
                playable.play();
            }
        }
    }
}
