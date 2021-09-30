  
public class fatorial {

    public static void main(String[]args){


        long	fatorial=	1;
        for	(int i = 1;	i <= 100; i++)	{
            fatorial = fatorial * i;
                System.out.println(i+"!=" + fatorial);

        }
    }
}