/**
 * @author Patrick Flynn
 */
import java.util.Random;

public class CSThread {
    int execTime;
    int threadID;
    public CSThread(int tid, int time){
        threadID = tid;
        execTime = time;
    }


    public void doWork(int timeSlice){
        // Print Message
        System.out.println("Executing: " + threadID);
        // Subtract timeSlice value
        execTime -= timeSlice;
        // print remaining exact time
        System.out.print("\tTime after execution: " + execTime);
    }
    public int getExecTime(){
        // return CHThread current execution time
        return execTime;
    }

    public static void main(String args[]){
        Random rand = new Random();

        int numThreads = rand.nextInt(10) + 10;
        for (int tid = 0; tid < numThreads; tid++){
            int randTime = rand.nextInt(4990)+10;
            //BAAAAAAAAAAAH I DONT GET IT AT ALLLLLLLLLLL

        }
    }
}
