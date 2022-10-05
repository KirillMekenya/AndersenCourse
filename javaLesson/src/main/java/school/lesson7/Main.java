package school.lesson7;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File csv = new File("output.csv");

        CourseMarks courseMarks = new CourseMarks(new String[]{"name1", "name2", "name3"}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        CourseMarks courseMarks1 = new CourseMarks(new String[]{"name4", "name5", "name6"}, new int[][]{{10, 5, 8}, {9, 8, 3}, {7, 6, 10}});

        try {
            WriterToCsv writerToCsv = new WriterToCsv(courseMarks, csv);
            writerToCsv.saveToCsv(courseMarks);
            //файл перезапишется значениями из объекта courseMarks1
            writerToCsv.saveToCsv(courseMarks1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Чтение с файла по строкам
        try {
            ReaderFromCsv readerFromCsv = new ReaderFromCsv();
            readerFromCsv.readFromCsvByLines(csv);
            System.out.println(readerFromCsv.getCourseMarks());

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

        //Чтение с файла целиком
        try {
            ReaderFromCsv readerFromEntireCsv = new ReaderFromCsv();
            readerFromEntireCsv.readEntireFileFromCsv(csv);
            System.out.println(readerFromEntireCsv.getCourseMarks());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
