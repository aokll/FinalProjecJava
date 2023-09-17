package Model;

import java.io.File;
import java.io.FileOutputStream;

public class FileEntry {
    public void write(Toy toy) throws Exception {
            String way = "D:\\test-file\\name.txt";
            String h = String.format("id: %d; mass of toy: %d; naming the toy: %s\n",toy.getId(), toy.getMassOfToy(),toy.getNamingTheToy());
            File myFile = new File(way);
            try (FileOutputStream outputStream = new FileOutputStream(myFile,true))
            {
                byte[] buffer = h.getBytes();
                outputStream.write(buffer);
            }catch (Exception e){
                e.printStackTrace();
            }

    }
}
