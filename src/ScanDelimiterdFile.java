import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ScanDelimiterdFile {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            String fileLocation = "src/cars.csv";
            File externalFile = new File(fileLocation);
            Scanner scanner = new Scanner(externalFile);
            ArrayList<String[]> data = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splittedLine = line.split(",");
                data.add(splittedLine);
            }

            data.removeFirst();

            for (String[] tempLine : data) {
                System.out.println("Car name :" + tempLine[0]);
                System.out.println("MPG :" + tempLine[1]);
                System.out.println("Cylinder :" + tempLine[2]);
                System.out.println("Displacement :" + tempLine[3]);
                System.out.println("Horsepower :" + tempLine[4]);
                System.out.println("Weight :" + tempLine[5]);
                System.out.println("Acceleration :" + tempLine[6]);
                System.out.println("Model :" + tempLine[7]);
                System.out.println("Origin :" + tempLine[8]);
                System.out.println("====================================");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }
}
