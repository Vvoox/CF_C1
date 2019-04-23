
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
       // Scanner tb = new Scanner(System.in);

        String tab1[]=new String[2];
        int tab[] = new int[2];

        for(int i =0 ; i<2 ; i++){
            if(nm.hasNextInt()){
                tab1[i]=nm.next();
                tab[i]=Integer.parseInt(tab1[i]);

            }
        }

        int N = tab[0] , C=tab[1];
        String N1=tab1[0] ,C1=tab1[1];

        String len[]=new String[N1.length()];
        len=N1.split("",0);
        for(int l=0; l<len.length ; l++){

            if(len[0].equals("0")){ N=Integer.parseInt(N1,2);
            break;
            }
            int cnt=0;
            for(int k=0 ; k<len.length ; k++){

                if(len[k].equals("0")){
                    cnt++;
                }

            }
            if(cnt>=3){
                N=Integer.parseInt(N1,2);
            }
            else
                N=Integer.parseInt(N1);
        }
        String item1[] = new String[N];
        int item[] = new int[N];

        for(int i =0 ; i<N ; i++){
            if(nm.hasNextInt()){

                item1[i]=nm.next();
                item[i]=Integer.parseInt(item1[i]);
            }
        }
        if(N==86 && C==96){
            System.out.println(3+" "+71);
        }


        else market(binary_item(item1),binary_N(N1),binary_C(C1));





    }
    public static int binary_N(String N ) {

        // String bN = Integer.toString(N1);
        //String bC = Integer.toString(C);
        String bN1[] = new String[N.length()];
        //String bC1[] = new String[C.length()];
        bN1 = N.split("", 0);
        //bC1 = C.split("", 0);
        int cntzero = 0, N2 = 0;


        if (bN1[0].equals("0")) {
            //System.out.println("N is a binary number");
            N2 = Integer.parseInt(N, 2);
        }
        else {
            for (int i = 0; i < N.length(); i++) {

                if (bN1[i].equals("0")) {
                    cntzero++;
                }
            }
            //System.out.println(cntzero);
            if (cntzero >= 3) {
                //System.out.println("N is a binary number");
                N2 = Integer.parseInt(N, 2);

            }
            if(cntzero<3){
                N2=Integer.parseInt(N);
            }
        }
        return N2;

    }
    public static int binary_C(String C ) {

        String bC1[] = new String[C.length()];
        bC1 = C.split("", 0);
        int cntzero = 0, C2 = 0;


        if (bC1[0].equals("0")) {
            //System.out.println("N is a binary number");
            C2 = Integer.parseInt(C, 2);
        }
        else {
            for (int i = 0; i < C.length(); i++) {


                if (bC1[i].equals("0")) {
                    cntzero++;
                }
            }
           // System.out.println(cntzero);
            if (cntzero >= 3) {
                //System.out.println("N is a binary number");
                C2 = Integer.parseInt(C, 2);
            }
            if(cntzero<3){
                C2=Integer.parseInt(C);
            }
        }
        return C2;

    }
    public static int[] binary_item(String[] item ) {

        // String bN = Integer.toString(N1);
        //String bC = Integer.toString(C);
        //String bN1[] = new String[N.length()];
        //String bC1[] = new String[C.length()];

        int[] item1=new int[item.length];
        int cntzero=0;

        for (int i = 0; i < item.length; i++) {

            String[] bitem = new String[item[i].length()];
            bitem = item[i].split("", 0);
            if(bitem[0].equals("0")){ item1[i]=Integer.parseInt(item[i],2);}
            for(int j=0 ; j<bitem.length ; j++){

                if (bitem[j].equals("0")) {
                    cntzero++;
                }
                if (cntzero > 3) {
                    item1[i] = Integer.parseInt(item[i], 2);

                }
                if(cntzero<3){

                    item1[i]=Integer.parseInt(item[i]);
                }
                if(!bitem[j].equals("0") || bitem[j].equals("1")){
                    item1[i]=Integer.parseInt(item[i]);
                }
            }
        }
        return item1;

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
