import java.io.*;

public class Lab09_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");
        if (file.exists()) {
			System.out.println("File " + file.getName() + " already exists");
			System.exit(0);
		}
        String rank = "";
        double salary=0;
        try(PrintWriter out = new PrintWriter(file)) {
            for(int i=1; i<=1000; i++) {
                out.print("FirstName"+i+" LastName"+i);
                rank = getRank();
                salary = getSalary(rank);
                out.printf(" "+rank+" %.2f\n",salary);
            }
        }
    }

    public static String getRank() {
        String[] rank = {"assistant", "associate", "full"};
        return rank[(int)(Math.random()*rank.length)];
    }

    public static double getSalary(String rank) {
        if(rank.equals("assistant")) {
            return 50000 + (double)(Math.random()*30001);
        }
        else if(rank.equals("associate")) {
            return 60000 + (double)(Math.random()*50001);
        }
        else if(rank.equals("full")) {
            return 75000 + (double)(Math.random()*55001);
        }
        return 0;
    }
    
}
