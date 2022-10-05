package school.lesson7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterToCsv {
    private CourseMarks courseMarks;
    private File file;

    public WriterToCsv(CourseMarks courseMarks, File file) {
        this.courseMarks = courseMarks;
        this.file = file;
    }

    public void saveToCsv(CourseMarks courseMarks) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < courseMarks.getCourseParticipantsName().length; i++) {
            writer.write(courseMarks.getCourseParticipantsName()[i] + ";");
        }
        writer.write("\n");
        for (int i = 0; i < courseMarks.getMarks().length; i++) {
            for (int j = 0; j < courseMarks.getMarks()[i].length; j++) {
                writer.write(courseMarks.getMarks()[i][j] + ";");
            }
            if (i != courseMarks.getMarks().length - 1) {
                writer.write("\n");
            }
        }
        writer.close();
    }
}
