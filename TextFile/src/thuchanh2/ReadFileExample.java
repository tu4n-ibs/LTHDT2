package thuchanh2;

import java.io.*;

public class ReadFileExample {
        public void readerFileText (String path){

            File file = new File("thuchanh1.txt");
            try {
                file.createNewFile();
            if (!file.exists()) {
                throw new RuntimeException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
                bufferedReader.close();
                System.out.println("tong : " + sum);
            } catch (Exception e) {
                System.out.println("xu li loi file");
            }

        }

}
