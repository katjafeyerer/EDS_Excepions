
    import java.io.File;

    public class FileApp {
        public static int printAndGetSize(File folder) {
            int totalSize = 0;
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName() + " (" + file.length() + " bytes)");
                        totalSize += file.length();
                    } else if (file.isDirectory()) {
                        totalSize += printAndGetSize(file);
                    }
                }
            }
            return totalSize;
        }

        public static void main(String[] args) {
            File folder = new File("C:\\Users\\katja\\OneDrive\\Dokumente");
            int totalSize = printAndGetSize(folder);
            System.out.println("Total size of " + folder.getAbsolutePath() + " is " + totalSize + " bytes.");
}

    }

