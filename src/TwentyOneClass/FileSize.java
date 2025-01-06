package TwentyOneClass;
import java.io.File;
public class FileSize {
    public static void main(String[] args) {

                String filePath = "C:\\Users\\Java Student PC-3\\Desktop\\1285554\\Java";

                File file = new File(filePath);

                if (file.exists()) {

                    long fileSizeInBytes = file.length();
                    double fileSizeInKB = fileSizeInBytes / 1024.0;
                    double fileSizeInMB = fileSizeInKB / 1024.0;

                    System.out.println("File Size: ");
                    System.out.println("In Bytes: " + fileSizeInBytes + " bytes");
                    System.out.println("In KB: " + String.format("%.2f", fileSizeInKB) + " KB");
                    System.out.println("In MB: " + String.format("%.2f", fileSizeInMB) + " MB");
                } else {
                    System.out.println("File does not exist.");
                }
            }
        }
