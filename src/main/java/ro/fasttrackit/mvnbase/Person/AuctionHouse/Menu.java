package ro.fasttrackit.mvnbase.Person.AuctionHouse;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Menu {
    public static void main(String[] args) throws FileNotFoundException {


        File text = new File("src/main/resources/level2_1.txt");
        Scanner scanner = new Scanner(text);
        List<String> result = new ArrayList<>();
        while (scanner.hasNextLine()) {
            result.add(scanner.nextLine());
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        float latMin = Float.MAX_VALUE;
        float altitudeMin = Float.MAX_VALUE;
        float longMin = Float.MAX_VALUE;
        float latMax = Float.MIN_VALUE;
        float altitudeMax = Float.MIN_VALUE;
        float longMax = Float.MIN_VALUE;
        int firstNumber = 0;
        int flightCount = 0;
        int flightCountAtoB = 0;
        int flightCountBtoA = 0;

        for (int i = 1; i <= result.size() - 1; i++) {


            String[] tokens = result.get(i).split(",");

            int N = Integer.parseInt(result.get(0));
            firstNumber = N;
            int timestamp = Integer.parseInt(tokens[0]);
            float latitude = Float.valueOf(tokens[1]);
            float longitude = Float.valueOf(tokens[2]);
            float altitude = Float.valueOf(tokens[3]);
            String start = tokens[4];
            String destination = tokens[5];
            int takeoff = Integer.parseInt(tokens[6]);


            ///timestam
            if (min > timestamp) {
                min = timestamp;

            }
            if (max < timestamp) {
                max = timestamp;
            }

            //latitude
            if (latMin > latitude) {
                latMin = latitude;
            }
            if (latMax < latitude) {
                latMax = latitude;
            }
            //longitude
            if (longMin > longitude) {
                longMin = longitude;
            }
            if (longMax < longitude) {
                longMax = longitude;
            }
            //latitude
            if (altitudeMax < altitude) {
                altitudeMax = altitude;
            }

            if (start != destination) {
                flightCountAtoB = 1;
            }

            if (destination != start) {
                flightCountBtoA = 1;
            }




        }
        System.out.println(firstNumber);
        System.out.print("int minTimestamp " + min);
        System.out.print(" int maxMaxstamp " + max);
        System.out.println();
        System.out.print("Min Lat " + latMin);
        System.out.print(" MaxLat " + latMax);
        System.out.println();
        System.out.print("minLong " + longMin);
        System.out.print(" maxLong " + longMax);
        System.out.println();
        System.out.print("maxAltitude " + altitudeMax);
        System.out.println("flightcount " + flightCount);
        System.out.println();

        //--------------------------------------------------
        System.out.println("===================");
        System.out.println(firstNumber);
        System.out.print(min + " ");
        System.out.print(max);
        System.out.println();
        System.out.print(latMin + " ");
        System.out.print(latMax);
        System.out.println();
        System.out.print(longMin + " ");
        System.out.print(longMax);
        System.out.println();
        System.out.print(altitudeMax);

    /*    File text = new File("src/main/resources/file");
        Scanner scanner = new Scanner(text);

        String[] tokens = scanner.nextLine().split(",");
        //  char character = result[0].charAt(0);

        int actualBid=Integer.parseInt(tokens[0]);
        int maxBid=1;

        for (int i = 1; i <= tokens.length - 1; i=i+2) {


            String bidder=tokens[i];

            int bid=Integer.parseInt(tokens[i+1]);

            if (maxBid>actualBid && maxBid>bid){
                 maxBid=maxBid+1;
            }


        }


    }
   */
    }
}