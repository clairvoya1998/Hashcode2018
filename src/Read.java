import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Read {
    public int[] scanfirst(Scanner sc) throws FileNotFoundException{
        int[] info = new int[6];
        if (sc.hasNext()) {
            String firstline = sc.nextLine().toString();
            Scanner str = new Scanner(firstline);
            for (int i = 0; i < 6; i++) {
                info[i] = Integer.parseInt(str.next());
//                System.out.println(info[i]);
            }
        }
        return info;
    }
    public ArrayList<Ride> scanRide(Scanner sc) {
        ArrayList<Ride> rides = new ArrayList<>();
        while (sc.hasNext()) {
            int[] My_ride = new int[6];
            String ride = sc.nextLine().toString();
            Scanner Ride = new Scanner(ride);
            for (int i = 0; i < 6; i++){
                My_ride[i] = Integer.parseInt(Ride.next());
            }
            Ride rd = new Ride(new Intersection(My_ride[0], My_ride[1]), new Intersection(My_ride[2], My_ride[3]), My_ride[4], My_ride[5]);
            rides.add(rd);
        }
    return rides;
    }

}
