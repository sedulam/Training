class Solution{
    public static void main(String []arg)
    {
        int size = Integer.parseInt(arg[0]);

        for(int i=0;i<size;i++)
        {

            try
            {
                long x=Long.parseLong(arg[i+1]);
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127) System.out.println("* byte");
                if(x>=-32768 && x<=32767) System.out.println("* short");
                if(x>= Math.pow(-2,31) && x<= (Math.pow(2,31))-1 ) System.out.println("* int");
                System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(arg[i+1]+" can't be fitted anywhere.");
            }

        }
    }
}
