import java.util.Scanner;

class Poly{
    double[] arr;
    int degree;
    Poly(double[] arr){
        this.arr= arr;
        degree= arr.length-1;
    }
    double f_x(double x){
        double result =0;
        for(int i=0; i<= degree; i++)
        {
            result+= arr[i]*Math.pow(x,i);
        }
        return result;
    }
    @Override
    public String toString(){
        String s="";
        if(arr[degree]!=0){
            s+=(Double.toString(arr[degree]));
            s+=("x^");
            s+=(Integer.toString(degree));
        }
            
        for(int i= degree-1; i>=0; i--){
            if(arr[i]!=0){
                if(arr[i]<0){
                    s+=(Double.toString(arr[i]));
                }
                else{
                    s+=" +";
                    s+=(Double.toString(arr[i]));
                }
                if(i!=0){
                s+=("x^");
                s+=(Integer.toString(i));
                }
            }
        }   
        return s;
    }
}
public class as20_1 {
    public static void main(String[] args){
        Poly p;
        Scanner ip =new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = ip.nextDouble();

        System.out.print("Enter polynomial degree: ");
        int n = ip.nextInt();

        double[] arr = new double[n+1];
        //a^n -- a^0
        for(int i = n; i>= 0 ; i--){
            System.out.print("Enter "+ i + " power coefficent: ");
            arr[i] = ip.nextDouble();
        }
        p= new Poly(arr);
        System.out.println("result="+p.f_x(x));
        System.out.println(p.toString());
        ip.close();
    }
}
