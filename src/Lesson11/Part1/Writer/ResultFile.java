package Lesson11.Part1.Writer;


import java.io.*;

public class ResultFile implements CustomFile, Content {
    private final String path;
    private StringBuilder content = new StringBuilder();

    public ResultFile(String filePath) {
        path = filePath;
        read();
    }

    @Override
    public void write(String text) {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(path, true)
        )) {
            writer.write(text);
            content.append(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getContent() {
        return content.toString();
    }
//    Метод считывания файла
    private void read() {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(path)
        )) {
            String line = reader.readLine();
            while (line != null) {
                content.append(line).append("\n");
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
