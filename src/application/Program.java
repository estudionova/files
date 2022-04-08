package application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);


        System.out.println("getName: "+ path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());






        sc.close();
        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] foldes = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");

        for (File folder : foldes){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        for (File file : files){
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\subdir").mkdir() ;
        System.out.println("Directory crated sucessfully " + sucess);

        sc.close();

        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};
        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
        }


        String path = "c:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        }


        String path = "c:\\temp\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {

            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            if (sc != null) {

                sc.close();
            }
        }
*/
    }
}
