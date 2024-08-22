import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileUtils 
{

    protected void createFile(String directoryPath, String filePath)
    {
        File directory = new File(directoryPath);
        File file = new File(filePath);

        try
        {
            if(!directory.exists())
            {
                directory.mkdir();
            }

            if(!file.exists())
            {
                file.createNewFile();
            }
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }

    protected void writeFile(String filePath, String writeContent)
    {
        try
        {
            FileWriter writer = new FileWriter(filePath);
            writer.write(writeContent);
            writer.close();
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }
}
