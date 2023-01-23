package day26_multi_dimensional_array;

import java.util.Arrays;
import java.util.Scanner;

public class _08Dynamic_Groups {

    /*
    We did the group task together, try to make it completely dynamic with Scanner inputs.
        Ask the number of groups, the number of people in group1, group2, group3, etc... and ask for the name of each person on the group and assign into the array
     */

    public static void main(String[] args) {

        /*
        // Zirwan Ahmed Salih's solution:

        Scanner scan = new Scanner(System.in);
        System.out.println("How many groups are there?");
        int groupNums = scan.nextInt();

        for (int i = 1; i <= groupNums; i++) {
            String allNames = "";
            System.out.println("How many people in group " + i);
            int numsOfPeople = scan.nextInt();
            System.out.println("What is everyone's name in group " + i);


            String[] arr = new String[0];
            for (int j = 0; j < numsOfPeople; j++) {
                String names = scan.next().trim();
                allNames += names + " ";

            }
            arr = allNames.split(" ");
            System.out.println("Group number " + i + ":" + Arrays.toString(arr));
        }
         */

        // Merve's solution:

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of groups");
        int size = input.nextInt();

        String[][] groups = new String[size][];
        System.out.println(Arrays.deepToString(groups));

        for (int i = 0; i < groups.length; i++) {
            System.out.println("enter the size of " +  (i+1) + ". group: ");  // 0.grup demesin diye i+1 yapmis
            int eachGroupSize = input.nextInt();
            input.nextLine();
            groups[i]= new String[eachGroupSize];
            for (int j = 0; j < groups[i].length; j++) {
                System.out.println("Enter the " + (j+1) + ". name:");
                groups[i][j]=input.nextLine();
            }
        }
        System.out.println(Arrays.deepToString(groups));


    }
}
