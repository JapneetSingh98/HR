/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
*/
    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        Arrays.sort(magazine);
        Arrays.sort(note);


        int cur = 0;
        for(int i = 0; i < magazine.length; i++) {
            
            if(cur == note.length) {
                break;
            }
            //System.out.println(" " + magazine[i]);
            //System.out.println(" " + note[cur]);

            if (magazine[i].compareTo(note[cur]) == 0) {
                //System.out.println("   equal");
                cur++;
            } else if (magazine[i].compareTo(note[cur]) < 0) {
                //System.out.println("   not yet");
                continue;
            } else if (magazine[i].compareTo(note[cur]) > 0) {
                //System.out.println("   missing");
                System.out.println("No");
                return;
            }
        }
        if(cur == note.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        return;




        /*String mag = "";
        for(String word : magazine) {
            mag = mag + word;
        }
        char sortedMag[] = mag.toCharArray(); 
        Arrays.sort(sortedMag);

        String not = "";
        for(String word : note) {
            not = not + word;
        }
        char sortedNote[] = not.toCharArray(); 
        Arrays.sort(sortedNote);

        int cur = 0;
        for(int i = 0; i < sortedMag.length; i++) {
            if(cur == sortedNote.length) {
                break;
            } else if (sortedMag[i] == sortedNote[cur]) {
                cur++;
            } else if (sortedMag[i] < sortedNote[cur]) {
                continue;
            } else if (sortedMag[i] > sortedNote[cur]) {
                System.out.println("No");
                return;
            }
        }
        if(cur == sortedNote.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        return;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
*/