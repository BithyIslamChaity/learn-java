package TwentyOneClass;
import java.io.File;
import java.text.SimpleDateFormat;
public class DateFile {
    public static void main(String[] args) {
                String filePath = "C:\\Users\\Java Student PC-3\\Desktop\\1285554\\Java";

                File file = new File(filePath);

                if (file.exists()) {

                    long lastModified = file.lastModified();

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String formattedDate = sdf.format(lastModified);


                    System.out.println("Last modified date of the file: " + formattedDate);
                } else {
                    System.out.println("File does not exist.");
                }
            }
        }



