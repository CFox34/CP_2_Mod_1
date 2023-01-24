import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonGenerator {
    public static void main(String[] args) {
        ArrayList<Person> personOData = new ArrayList<>();
        ArrayList<String> personCSVData = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\personData.txt");

        boolean done = false;
        String ID = "";
        String firstName = "";
        String lastName = "";
        String title = "";
        String CSVPersonRecord = "";
        int YOB = 0;

        do {
            ID = SafeInput.getNonZeroLenString(in, "Enter the ID [6 digits]:");
            firstName = SafeInput.getNonZeroLenString(in, "Enter the first name:");
            lastName = SafeInput.getNonZeroLenString(in, "Enter the last name: ");
            title = SafeInput.getNonZeroLenString(in, "Enter the title: ");
            YOB = SafeInput.getRangedInt(in, "Enter the year of birth: ", 1000, 9999);

            CSVPersonRecord = ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
            personCSVData.add(CSVPersonRecord);

            personOData.add(new Person(ID, firstName, lastName, title, YOB));


            done = SafeInput.getYNConfirm(in, "Are you done?");
        } while (!done);

        for (String p : personCSVData)
            System.out.print(p);
    }
}

