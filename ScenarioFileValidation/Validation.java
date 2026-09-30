package ScenarioFileValidation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import Exception.*;

public class Validation {

    private static final List<String> validAircraft = List.of("Balloon", "JetPlane", "Helicopter");

    public static boolean getValidScenario(String[] args) {

        if (args.length != 1)
            throw new RuntimeException("Only 1 argument allowed (scenario.txt)");


        String content = getContent(args[0]);
        content = content.replaceAll("\r\n\r\n", "\r\n");



        int iterations = getIterations(content);


        for (int i = 1; i <= split.length; i++)
        {
            String[] parts = split[i].split(" ");
            if (parts.length != 5)
                throw new InvalidScenarioFileException("Missing Attributes in following line detected: \n\t" + split[i]);

            if (!validAircraft.contains(parts[0]))
                throw new InvalidScenarioFileException("The Aircraft Type has to be one of: 'Balloon', 'Helicopter', 'JetPlan'. Found violation in following line:\n\t"+split[i]);


        }


        return true;
    }

    private static int getIterations(String content) {
        String[] split = content.split("\r\n");
        int iterations;

        try
        {
            iterations = Integer.parseInt(split[0]);
            if (iterations < 0)
                throw new InvalidScenarioFileException("Amount of Iterations has to be a positive integer.");
            return iterations;
        }
        catch (Exception e)
        {
            throw new InvalidScenarioFileException("Amount of Iterations are required in the scenario file!");
        }
    }

//    private static Integer strToInt (String str)
//    {
//        try
//        {
//            return Integer.parseInt(str);
//        }
//        catch (Exception e)
//        {
//            throw new
//        }
//    }



    private static String getContent(String filePath)
    {
        if (filePath.isBlank())
            throw new RuntimeException("File Path can not be empty");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null)
            {
                if (line.isBlank())
                {
                    line = br.readLine();
                    System.out.println(" Just FYI don't use Newlines next time!");
                    continue;
                }
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException("Unable to extract content from file Path: ", e);
        }
    }
}
