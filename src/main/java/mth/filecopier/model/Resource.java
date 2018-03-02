package mth.filecopier.model;

import java.io.File;

public class Resource {
    private File source;
    private File destination;

    public Resource(String sourcePath, String destination) {
        this.source = new File(sourcePath);
        this.destination = new File(destination);
    }

    public File getSource( ) {
        return source;
    }

    public File getDestination( ) {
        return destination;
    }
}