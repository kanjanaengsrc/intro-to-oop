package Composition;

public class TestFile {
    public static void main(String[] args) {
        File f = new File("output.txt");
        System.out.printf("%s is created\n",f.getFilename());
    }
}