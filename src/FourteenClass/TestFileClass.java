package FourteenClass;

import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Java Student PC-3\\Desktop\\1285554\\Java\\Bithy\\muntaha\\muskan");
        System.out.println("Doed it exits? " + file.exists());
        System.out.println("The file has " + file.length() + "bytes");
        System.out.println("can it be read? " + file.canRead());
        System.out.println("can write be written? " + file.canRead());
        System.out.println("is it a dictionary? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is" + file.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
        boolean mkdir = file.mkdir();
        if (mkdir) {
            System.out.println("folder created");
        }else{
            System.out.println("folder exits");
        }
       file.mkdirs();
    }
    }

