package task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Files {

    HashMap<String, String> hashMap = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    List<File> fileList = new ArrayList<>();
    HashSet<String> hashSet = new HashSet<>();

    public void createFileList() throws IOException {
        int n = 1;
        while(n != 0){
            String namefile = scanner.nextLine();
            if(namefile.equals("0")){
                System.out.println("Работа завершена");
                break;
            }
            String documentnumber = scanner.nextLine();
            hashSet.add(documentnumber);
            try {
                File file = new File(namefile);
                fileList.add(file);
                if (file.createNewFile()) {
                    Writeer(documentnumber,namefile);
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                n = 0;
                System.out.println("Заполнение закончено");
            }

        }
    }

    public static void Writeer(String docnum, String filename) throws IOException {
        String documentnum = docnum;
        FileWriter fileWriter = new FileWriter(filename, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(docnum);
        writer.close();
    }
    public void Writeer(String filename) throws IOException {
        FileWriter fileWriter = new FileWriter(filename, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        System.out.println(hashMap);
        writer.write(hashMap.toString());
        writer.close();
    }

    public void Valid(){
        for (String s:hashSet) {
            if(s.length() != 15) {
                String massage = "length != 15(invalid)";
                hashMap.put(s,massage);
            }else if(!s.startsWith("docnum")){
                String massage = "!docnum(invalid)";
                hashMap.put(s,massage);
            }else{
                String massage = "valid";
                hashMap.put(s,massage);
            }
        }
    }

    public void Otchet() throws IOException {
        Writeer("otchet.txt");
    }
}
