package exercise;

/**
 * Created by Suba Srini on 22-12-2016.
 */
public class newClass {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        newClass obj = new newClass();
        obj.add(a,b);
    }

    public void add(int i,int j){
        int sum =0;
        if ((i >10 ) || (j>10)){
            if(i<j){
                sum = j-i;
            }
            else{
                sum = i-j;
            }

        }
        System.out.println(sum);

}
}
