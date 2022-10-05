package school.lesson7;

import java.io.*;
import java.nio.file.Files;

public class ReaderFromCsv {

    private CourseMarks courseMarks;

    public ReaderFromCsv() {
        this.courseMarks = new CourseMarks();
    }

    public CourseMarks getCourseMarks() {
        return courseMarks;
    }

    //Метод для чтения с файла по строкам
    public void readFromCsvByLines(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String read;
        read = reader.readLine();
        if (!read.isBlank()) {
            courseMarks.setCourseParticipantsName(read.split(";"));
        }
        StringBuilder stringBuilder = new StringBuilder();
        while ((read = reader.readLine()) != null) {
            if (!read.isBlank()) {
                stringBuilder.append(read).append(" ");
            }
        }
        reader.close();
        courseMarks.parseMarksToInt(stringBuilder);
    }

    //Метод для чтения с файла целиком
    public void readEntireFileFromCsv (File file) throws IOException {
        String[] fileStringLines = Files.readString(file.toPath()).split("\n");
        courseMarks.setCourseParticipantsName(fileStringLines[0].split(";"));
        courseMarks.parseMarksToIntFromEntireFile(fileStringLines);
    }
}
