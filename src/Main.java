import java.util.*;


public class Main {
    public static void main(String[] args) {

        //ArrayList<Integer> values = new ArrayList<>(Arrays.asList(1,2,3));


        Scanner input = new Scanner(System.in);


        int n , m;
        System.out.println("enter a number of days  = ");
        n = input.nextInt();
//
//        ArrayList<Integer> demand = new ArrayList<>(n);
//        ArrayList<Integer> frequency = new ArrayList<>(n);
//        ArrayList<Double> probability = new ArrayList<>(n);
//        ArrayList<Double> cummulative = new ArrayList<>(n);
//        ArrayList<Integer> interval_1 = new ArrayList<>(n);
//        ArrayList<Integer> interval_2 = new ArrayList<>(n);
//        ArrayList<Integer> interval_3 = new ArrayList<>(n);

//        int value1, value2, value3;
//        int demand_values;
//        int days_freq;
//        int sum_of_days = 0;
////        for (int r1 = 0; r1 < n ; r1++) {
////            System.out.println("enter demand value = ");
////            demand_values = input.nextInt();
////            demand.add(demand_values);
////        }
//        for (int r1 = 0; r1 < n; r1++) {
//            System.out.println("enter frequency value (days by days) = ");
//            days_freq = input.nextInt();
//            frequency.add(days_freq);
//            sum_of_days += days_freq;
//        }
//
//
//        int product;
//        for (int r1 = 0; r1 < n; r1++) {
//
//            probability.add((double) frequency.get(r1) / sum_of_days);
//        }
//
//        double sum_cummulative = 0;
//
//        for (int r1 = 0; r1 < n; r1++) {
//
//            sum_cummulative += probability.get(r1);
//
//            cummulative.add((sum_cummulative));
//
//        }
//        int ii ,iii;
//
//        int [][]interval ;
//        int values = 100 ;
//        interval = new int[n][values];
//        for (int r1 = 0; r1 < n; r1++) {
//            cummulative.add(cummulative.get(r1) * 10);
//        }
        int values = 100 ;
        int [][]interval ;
        interval = new int[n][values];
        for (int raw = 0 ; raw< n ;raw++)
        {
        for (int column = 1 ;column <= values ;column++)
        {
            interval[raw][column]  = column ;
        }
        }
//        int round = 0 ;
//        for (int r1 = 0 ; r1 < n ;r1++) {
//
//            for (int r2 = 0; r2 < n; r2++)
//            {
//                if (round <= cummulative.get(r2) && round <= 100) {
//                    interval[n][round] += cummulative.get(r2);
//                    round ++ ;
//                }
//            }
//        }
//        for (int r1 = 0; r1 < n; r1++)
//       {
//            for (int rounds = 1; rounds <= 100; rounds++) {
//                if ()
//
//            }
//        }
//        for (int r1 = 0 ; r1 < n ; r1++)
//        {
//            for (int round_1 = 1 ; round_1 <= 100  ; round_1++)
//            {
//                if (round_1 <= cummulative.get(r1))
//                {
//
//                    interval_1.get(round_1);
//
//                }
//                else if (cummulative.get(r1) <=cummulative.get(r1+1) )
//                {
//                    interval_2.get(round_1);
//                }
//                for (int swap = 0 ;swap < interval_1.size() ;swap++)
//                {
//                    interval_3.add(interval_2.get(swap));
//                }
//            }
//
//        }

            System.out.println("\n");
        //System.out.println(demand);
//        System.out.println(frequency);
//        System.out.println(sum_of_days);
//        System.out.println(probability);
//        System.out.println(cummulative);
//        System.out.println(interval_1);
//        System.out.println(interval_2);
//        System.out.println(interval_3);

        for (int raw = 0 ; raw< n ;raw++)
        {
            for (int column = 1 ;column <= values ;column++)
            {
                System.out.println(interval[n][values]+ " ");
            }
            System.out.println("\n");
        }

//        Table table_1 = new Table();
//        table_1.setDemand(values);

    }

}




