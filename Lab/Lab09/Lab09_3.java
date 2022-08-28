import java.util.*;
import java.io.*;

public class Lab09_3 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();

        try{
            File myObj = new File("Salary.txt");
            Scanner input = new Scanner(myObj);
            while(input.hasNext()) {
                String[] data = (input.nextLine()).split(" ");
                Double salary = Double.parseDouble(data[3]);
                if(data[2].equals("assistant")) {
                    assistant.add(salary);
                }
                else if(data[2].equals("associate")) {
                    associate.add(salary);
                }
                else if(data[2].equals("full")) {
                    full.add(salary);
                }
            }
            
        }catch (Exception e){}

        double totalAssistant = 0.0, totalAssociate = 0.0, totalFull = 0.0, total;
        for(int i=0; i<assistant.size(); i++) {
            totalAssistant += assistant.get(i);
        }
        for(int i=0; i<associate.size(); i++) {
            totalAssociate += associate.get(i);
        }
        for(int i=0; i<full.size(); i++) {
            totalFull += full.get(i);
        }
        total = totalAssistant+totalAssociate+totalFull;

        System.out.printf("Total salary for assistant professor is %.2f\n", totalAssistant);
        System.out.printf("Total salary for associate professor is %.2f\n", totalAssociate);
        System.out.printf("Total salary for full professor is %.2f\n", totalFull);
        System.out.printf("Total salary for all professors is %.2f\n", total);
        System.out.println("-----------------------------------------------------");
        System.out.printf("Average salary for assistant professor is %.2f\n", totalAssistant/assistant.size());
        System.out.printf("Average salary for associate professor is %.2f\n", totalAssociate/associate.size());
        System.out.printf("Average salary for full professor is %.2f\n", totalFull/full.size());
        System.out.printf("Average salary for all professors is %.2f\n", total/(assistant.size()+associate.size()+full.size()));
    }
}
