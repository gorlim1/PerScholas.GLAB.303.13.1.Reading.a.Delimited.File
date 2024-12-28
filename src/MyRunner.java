import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {

    public static void main (String[] args) {

        try {
            String fileLocation = "src/CourseData.csv";
            File externalFile = new File(fileLocation);
            Scanner scanner = new Scanner(externalFile);
            ArrayList<course> data = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splittedLine = line.split(",");

                //course cObj1 = new course(splittedLine[0], splittedLine[1], splittedLine[2]);

                course cObj = new course();
                cObj.setCode(splittedLine[0]);
                cObj.setCourse_name(splittedLine[1]);
                cObj.setInstructor_name(splittedLine[2]);

                data.add(cObj);

            }

            for (course c : data) {
                System.out.println(c.getCode() + " | " + c.getCourse_name()
                        + " | " + c.getInstructor_name());
                System.out.println("====================================");

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }
}