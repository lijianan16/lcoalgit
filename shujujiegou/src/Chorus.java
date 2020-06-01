
import java. util . Scanner;



public class Chorus {

    private final static int MAX = 100;

    private static int[] a = new int[ MAX] ;

    private static int[] b =new int[ MAX] ;

    private static int[ ] c = new int[ MAX] ;

    public static void main (String[] args) {

        Scanner sc = new Scanner (System. in) ;



        System. out.println("请输入队列长度:") ;

        int n = sc.nextInt() ;

        System. out.println("请输入队列的数:") ;

        for(int i =1; i<=n;i++) {

            a[i] = sc.nextInt();

        }
            b[1] = 1;

            for (int i = 2; i <= n; i++) {

                int max = 0;

                for (int j = i - 1; j >= 1; j--) {

                    if (a[i] > a[j] && b[j] > max) {

                        max = b[j];
                    }
                   }
                b[i]=max+1;
                }
                    c[n] = 1;

                    for(int i=n-1;i>0;i--) {

                        int max = 0;

                        for (int j = i + 1; j <= n; j++) {

                            if (a[i] > a[j] && c[j] > max) {
                                max = c[j];

                            }
                        }
                        c[i]=max+1;

                            }


                            int max = b[1] + c[1];

                            int flag = 0;

                            for (int i = 2; i <= n; i++) {
                                if (b[i] + c[i] > max) {

                                    max = b[i] + c[i];

                                    flag = i;
                                }
                            }
                                System.out.println("需要出列人数: " + (n - max + 1));

                            }
                        }
