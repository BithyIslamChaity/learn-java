package FourteenClass;

public class WriteData {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("scores.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }

        

    }
}
