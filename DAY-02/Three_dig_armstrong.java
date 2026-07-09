
public class Three_dig_armstrong {
    public static void main(String[] args){
        for(int i=100;i<1000;i++){
            if(armstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean armstrong(int i){
        int ori=i;
        int arm=0;
        while(i!=0){
            int rem=i%10;
            arm+=(int)(Math.pow(rem,3));
            i=i/10;
        }
        if(arm==ori){
            return true;
        }
        else{
            return false;
        }
    }
}
