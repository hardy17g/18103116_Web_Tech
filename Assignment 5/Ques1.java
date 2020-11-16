public class Ques1 extends Thread
{
    public static void main(String[] args)
    {
        Ques1 c = new Ques1();
        c.start();
    }

    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }

}