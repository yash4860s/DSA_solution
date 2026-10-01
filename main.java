import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            int ans = 0;

            for (int i = 0; i < n; i++) {

                boolean first = true;

                for (int j = i + 1; j < n; j++) {

                    if (s.charAt(i) == s.charAt(j)) {
                        first = false;
                    }
                }

                if (first == true) {
                    ans += 2;
                } else {
                    ans += 1;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}