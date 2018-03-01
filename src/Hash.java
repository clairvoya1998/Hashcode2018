import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        try {
            xx("a_example");
            xx("b_should_be_easy");
            xx("c_no_hurry");
            xx("d_metropolis");
            xx("e_high_bonus");

        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    public static void xx(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("inputs/" + filename + ".in"));
        Read rd = new Read();
        int[] firstline = rd.scanfirst(sc);
        ArrayList<Ride> rides = rd.scanRide(sc);
        // read from file

        Map mp = new Map(firstline[0], firstline[1], firstline[2], firstline[3], firstline[4], firstline[5]);
        mp.setRides(rides);
        // set the map:)
        mp.run();

        PrintWriter writer = new PrintWriter(new File("output/" + filename + ".out"));
        Vehicle[] vc = mp.vehicles;

        for (int i = 1; i <= vc.length; i++) {
            String out = vc[i - 1].ids.size() + "";
            for (int j = 0; j < vc[i - 1].rides.size(); j++ ) {
                out = out + " " + vc[i - 1].ids.get(j);
            }
            writer.println(out);
        }
        writer.flush();
        writer.close();
    }


}
