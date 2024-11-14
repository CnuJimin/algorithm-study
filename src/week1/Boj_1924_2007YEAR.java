package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1924_2007YEAR {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int [] m = {0, 31 ,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String [] d = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        int totalDay = 0;

        for (int i = 0; i <month ; i++) {
            totalDay += m[i];
        }

        totalDay += day -1 ;

        System.out.println(d[totalDay%7]);


        if (month == 1) {
            if (day % 7 == 0) {
                System.out.println("SUN");
            } else if (day % 7 == 1) {
                System.out.println("MON");
            } else if (day % 7 == 2) {
                System.out.println("TUE");
            } else if (day % 7 == 3) {
                System.out.println("WED");
            } else if (day % 7 == 4) {
                System.out.println("THU");
            } else if (day % 7 == 5) {
                System.out.println("FRI");
            } else if (day % 7 == 6) {
                System.out.println("SAT");
            }
        }
        if (month == 2) {
            if (day % 7 == 0) {
                System.out.println("WED");
            } else if (day % 7 == 1) {
                System.out.println("THU");
            } else if (day % 7 == 2) {
                System.out.println("FRI");
            } else if (day % 7 == 3) {
                System.out.println("SAT");
            } else if (day % 7 == 4) {
                System.out.println("SUN");
            } else if (day % 7 == 5) {
                System.out.println("MON");
            } else if (day % 7 == 6) {
                System.out.println("TUE");
            }
        }
        if (month == 3) {
            if (day % 7 == 0) {
                System.out.println("WED");
            } else if (day % 7 == 1) {
                System.out.println("THU");
            } else if (day % 7 == 2) {
                System.out.println("FRI");
            } else if (day % 7 == 3) {
                System.out.println("SAT");
            } else if (day % 7 == 4) {
                System.out.println("SUN");
            } else if (day % 7 == 5) {
                System.out.println("MON");
            } else if (day % 7 == 6) {
                System.out.println("TUE");
            }
        }
        if (month == 4) {
            if (day % 7 == 0) {
                System.out.println("SAT");
            } else if (day % 7 == 1) {
                System.out.println("SUN");
            } else if (day % 7 == 2) {
                System.out.println("MON");
            } else if (day % 7 == 3) {
                System.out.println("TUE");
            } else if (day % 7 == 4) {
                System.out.println("WED");
            } else if (day % 7 == 5) {
                System.out.println("THU");
            } else if (day % 7 == 6) {
                System.out.println("FRI");
            }
        }
        if (month == 5) {
            if (day % 7 == 0) {
                System.out.println("MON");
            } else if (day % 7 == 1) {
                System.out.println("TUE");
            } else if (day % 7 == 2) {
                System.out.println("WED");
            } else if (day % 7 == 3) {
                System.out.println("THU");
            } else if (day % 7 == 4) {
                System.out.println("FRI");
            } else if (day % 7 == 5) {
                System.out.println("SAT");
            } else if (day % 7 == 6) {
                System.out.println("SUN");
            }
        }
        if (month == 6) {
            if (day % 7 == 0) {
                System.out.println("THU");
            } else if (day % 7 == 1) {
                System.out.println("FRI");
            } else if (day % 7 == 2) {
                System.out.println("SAT");
            } else if (day % 7 == 3) {
                System.out.println("SUN");
            } else if (day % 7 == 4) {
                System.out.println("MON");
            } else if (day % 7 == 5) {
                System.out.println("TUE");
            } else if (day % 7 == 6) {
                System.out.println("WED");
            }
        }
        if (month == 7) {
            if (day % 7 == 0) {
                System.out.println("SAT");
            } else if (day % 7 == 1) {
                System.out.println("SUN");
            } else if (day % 7 == 2) {
                System.out.println("MON");
            } else if (day % 7 == 3) {
                System.out.println("TUE");
            } else if (day % 7 == 4) {
                System.out.println("WED");
            } else if (day % 7 == 5) {
                System.out.println("THU");
            } else if (day % 7 == 6) {
                System.out.println("FRI");
            }
        }
        if (month == 8) {
            if (day % 7 == 0) {
                System.out.println("TUE");
            } else if (day % 7 == 1) {
                System.out.println("WED");
            } else if (day % 7 == 2) {
                System.out.println("THU");
            } else if (day % 7 == 3) {
                System.out.println("FRI");
            } else if (day % 7 == 4) {
                System.out.println("SAT");
            } else if (day % 7 == 5) {
                System.out.println("SUN");
            } else if (day % 7 == 6) {
                System.out.println("MON");
            }
        }
        if (month == 9) {
            if (day % 7 == 0) {
                System.out.println("FRI");
            } else if (day % 7 == 1) {
                System.out.println("SAT");
            } else if (day % 7 == 2) {
                System.out.println("SUN");
            } else if (day % 7 == 3) {
                System.out.println("MON");
            } else if (day % 7 == 4) {
                System.out.println("TUE");
            } else if (day % 7 == 5) {
                System.out.println("WED");
            } else if (day % 7 == 6) {
                System.out.println("THU");
            }
        }
        if (month == 10) {
            if (day % 7 == 0) {
                System.out.println("SUM");
            } else if (day % 7 == 1) {
                System.out.println("MON");
            } else if (day % 7 == 2) {
                System.out.println("TUE");
            } else if (day % 7 == 3) {
                System.out.println("WED");
            } else if (day % 7 == 4) {
                System.out.println("THU");
            } else if (day % 7 == 5) {
                System.out.println("FRI");
            } else if (day % 7 == 6) {
                System.out.println("SAT");
            }
        }
        if (month == 11) {
            if (day % 7 == 0) {
                System.out.println("WED");
            } else if (day % 7 == 1) {
                System.out.println("THU");
            } else if (day % 7 == 2) {
                System.out.println("FRI");
            } else if (day % 7 == 3) {
                System.out.println("SAT");
            } else if (day % 7 == 4) {
                System.out.println("SUN");
            } else if (day % 7 == 5) {
                System.out.println("MON");
            } else if (day % 7 == 6) {
                System.out.println("TUE");
            }
        }
        if (month == 12) {
            if (day % 7 == 0) {
                System.out.println("FRI");
            } else if (day % 7 == 1) {
                System.out.println("SAT");
            } else if (day % 7 == 2) {
                System.out.println("SUN");
            } else if (day % 7 == 3) {
                System.out.println("MON");
            } else if (day % 7 == 4) {
                System.out.println("TUE");
            } else if (day % 7 == 5) {
                System.out.println("WED");
            } else if (day % 7 == 6) {
                System.out.println("THU");
            }
        }
    }
}
