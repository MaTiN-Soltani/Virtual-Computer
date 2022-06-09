import java.util.Timer;
import java.util.TimerTask;

public class Vclock extends Timer {

    private Synchronizable[] slist = new Synchronizable[5];
    private int counter;


    public Vclock()
    {
        counter = 0;
    }

    public void register(Synchronizable s)
    {
        slist[counter++] = s;
    }

    public void start(long delay, long period)
    {
        Sort sorter = new Sort();
        
        sorter.setList(slist);
        sorter.operate();

        TimerTask ts = new TimerTask() 
        {
            int timestamp = 1;

            @Override
            public void run() 
            {
                System.out.println("-----Tick #"+ (timestamp++) +"-----");

                for (int i = 0; i < slist.length; i++)
                {
                    slist[i].run();
                }
            }
        };
        
        schedule(ts, delay, period);
        }

}

