import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("inputs/a_example.in"));
            Read rd = new Read();
            int[] firstline = rd.scanfirst(sc);
            ArrayList<Ride> rides = rd.scanRide(sc);
            // read from file

            Map mp = new Map(firstline[0], firstline[1], firstline[2], firstline[3], firstline[4], firstline[5]);
            mp.setRides(rides);
            // set the map:)

            PrintWriter writer = new PrintWriter(new File("output/output.out"));
            Vehicle[] vc = mp.vehicles;

            for (int i = 0; i < vc.length; i++) {
                String out = i + " ";
                for (int j = 0; j < vc[i].rides.size(); j++ ) {
                    out = out + " " + vc[i].rides.get(j).getId();
                }
                writer.println(out);
            }
            writer.flush();
            writer.close();

        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }


}
