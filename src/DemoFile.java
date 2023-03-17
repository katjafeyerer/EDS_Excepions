import java.io.File;

public class DemoFile {

    public static void main(String[] args) {
        File folder = new File("C:\\Users\\katja\\OneDrive\\Dokumente");

        System.out.println("folder.isDirectory() = " + folder.isDirectory());
        System.out.println("folder.isFile() = " + folder.isFile());
        System.out.println("folder.length() = " + folder.length());
        //System.out.println(folder.isFile());
        //System.out.println(folder.isDirectory());
        //System.out.println(folder.length());
        System.out.println();
        System.out.println("printandGetSize(folder) = " + printandGetSize(folder));
        for (File f: folder.listFiles()) {
            System.out.println(f.getName() + " " + f.length());
        }



    }
    public static long printandGetSize(File f){
        if(f.isFile()){
            System.out.println(f.getName() + " " + f.length());
            return f.length();
        }
        long result = 0;

        for(File files: f.listFiles()) {
            result += files.length();

            if(files.isDirectory()){
                result += printandGetSize(files);
            }
        }
        return result;
    }

}
