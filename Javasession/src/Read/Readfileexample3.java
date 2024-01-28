package Read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Readfileexample3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        Path sourceFolder = Paths.get("D:\\SampleDirectory");

        // Create a HashMap to store the file names and their Paths
        Map<String, Path> fileMap = new HashMap<>();

        // Get a DirectoryStream for the source folder
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(sourceFolder)) {

            // Iterate over the DirectoryStream and add each file's name and path to the HashMap
            for (Path path : stream) {
                if (Files.isRegularFile(path)) {
                    String fileName = path.getFileName().toString();
                    fileMap.put(fileName, path);
                }
            }
        } catch (IOException e) {
            System.err.println("Error while reading files: " + e.getMessage());
        }

        // Define the target file name
        String targetFileName = "output.txt";

        // Check if the HashMap contains the specific file
        if (fileMap.containsKey(targetFileName)) {
            Path targetPath = fileMap.get(targetFileName);

            // Read the content of the target file
            try {
                String content = new String(Files.readAllBytes(targetPath), StandardCharsets.UTF_8);
                System.out.println("File found: " + targetFileName);
                System.out.println("Content: " + content);
            } catch (IOException e) {
                System.err.println("Error while reading the target file: " + e.getMessage());
            }
        } else {
            System.out.println("File not found: " + targetFileName);
        }
    }
}
