package school.lesson7;

import java.io.Serializable;
import java.util.Arrays;

public class CourseMarks implements Serializable {

    private String[] courseParticipantsName;
    private int[][] marks;

    public CourseMarks(String[] courseParticipantsName, int[][] marks) {
        this.courseParticipantsName = courseParticipantsName;
        this.marks = marks;
    }

    public CourseMarks() {
    }

    public int[][] getMarks() {
        return marks;
    }

    public String[] getCourseParticipantsName() {
        return courseParticipantsName;
    }

    public void setCourseParticipantsName(String[] courseParticipantsName) {
        this.courseParticipantsName = courseParticipantsName;
    }

    public void parseMarksToInt(StringBuilder stringBuilder) {
        String[] marksString = stringBuilder.toString().split("\\s");
        String[][] stringArrLines = new String[marksString.length][];
        for (int i = 0; i < marksString.length; i++) {
            stringArrLines[i] = marksString[i].split(";");
        }
        marks = new int[marksString.length][stringArrLines[0].length];
        for (int i = 0; i < stringArrLines.length; i++) {
            for (int j = 0; j < stringArrLines[i].length; j++) {
                marks[i][j] = Integer.parseInt(stringArrLines[i][j]);
            }
        }
    }

    public void parseMarksToIntFromEntireFile(String[] strings) {
        String[][] stringArrLines = new String[strings.length - 1][];
        for (int i = 1; i < strings.length; i++) {
            stringArrLines[i - 1] = strings[i].split(";");
        }
        marks = new int[strings.length - 1][stringArrLines[0].length];
        for (int i = 0; i < stringArrLines.length; i++) {
            for (int j = 0; j < stringArrLines[i].length; j++) {
                marks[i][j] = Integer.parseInt(stringArrLines[i][j]);
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(courseParticipantsName) + "\n" +
                Arrays.deepToString(marks);
    }
}
