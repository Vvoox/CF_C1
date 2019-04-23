
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        Scanner tb = new Scanner(System.in);

        int tab[] = new int[2];

        for(int i =0 ; i<2 ; i++){
            if(nm.hasNextInt()){

                tab[i]=nm.nextInt();

            }
        }

        int N = tab[0] , C=tab[1];
        int item[] = new int[N];

        for(int i =0 ; i<N ; i++){
            if(nm.hasNextInt()){

                item[i]=nm.nextInt();
            }
        }
        market(item,N,C);
    }

    public static void market(int[] item , int N , int C){

        int tab[] = new int[N];
        int cost[] = new int[N];
        int l=0;
        for(int i=N ; i>0 ;i--){
            int result=0;
            for(int j=0 ; j<N; j++){

                tab[j]=item[j] + i*(j+1);

            }
            for(int j=0 ; j<i ; j++){

                result+=tab[j];

            }
            cost[l]=result;
            l++;

        }
        int cnt=0;
        for(int i=0; i<N; i++){

            if(cost[i]<=C){

                cnt++;

            }
        }
        //System.out.println(cnt);
        int min[] = new int[cnt];
        int max=0 ;
        int p=0;
        for(int i =0 ; i<N ; i++){

                if(cost[i]<=C){

                    min[p]=cost[i];
                    p++;
                }
        }

        for(int i=0 ; i<cnt ; i++){
            if(max<= min[i]){
                max=min[i];
            }
        }

        int index=0;

        for(int i=0 ; i<N ;i++){

            if(cost[i]==max){

                index=N-i;

            }
        }
        System.out.println(index+" "+max);


    }
}
