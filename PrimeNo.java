public class PrimeNo{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int f=0;
            for(int i=2; i<=n/2; i++)
            {
                if(n%i==0){
                System.out.print(" and the number is not Prime");
                f=1;
                break;
                }
            }
            
            if(f==0){

    
                System.out.print(" and the number is Prime");
            }
        }
        }
    