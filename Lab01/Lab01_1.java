
// The U.S. Census Bureau projects population based on the following assumptions:
// One birth every 7 seconds
// One death every 13 seconds
// One new immigrant every 45 seconds
// Write a program to display the population for each of the next five years. Assume the
// current population is 312,032,486 and one year has 365 days. 

public class Lab01_1 {
    public static void main(String[] args) {
        int birth, death, newim;
        int population;
        population = 312032486;
        int timefiveyear = 365*24*60*60;
        birth = timefiveyear/7;
        death = timefiveyear/13;
        newim = timefiveyear/45;
        System.out.println("The current population is " + population);
        population += (birth+newim-death)*5;
        System.out.println("The population of the next five years is " + population);
    }
}
