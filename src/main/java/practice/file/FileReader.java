package practice.file;

import java.io.*;

public class FileReader {
    public static void main(String[] args) {
        File file = new File("src/main/resources/file1.txt");
        try {
            file.createNewFile();
            System.out.println("File Length : " + file.length());
            System.out.println("File Absolute Path : " + file.getAbsolutePath());
            System.out.println("File Canonical Path : " + file.getCanonicalPath());
            byte content[] = new byte[(int) file.length()];
            readUsingInputStream(file);
            readUsingStringStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readUsingStringStream(File file) throws FileNotFoundException {

    }

    private static void readUsingInputStream(File file) throws IOException {
        InputStream inputStream = new FileInputStream(file);
        int byteChar;
        do {
            byteChar = inputStream.read();
            char toChar = (char) byteChar;
            System.out.print(toChar);
        } while (byteChar != -1);
    }

}
