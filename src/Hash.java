import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("inputs/a_example.in"));
            Read rd = new Read();
            int[] firstline = rd.scanfirst(sc);
            Map mp = new Map(firstline[0], firstline[1], firstline[2], firstline[3], firstline[4], firstline[5]);
            ArrayList<Ride> rides = rd.scanRide(sc);
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }


}
