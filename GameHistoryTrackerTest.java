public class GameHistoryTrackerTest {
    public static void main(String[] args){
        GameHistoryTracker tracker = new GameHistoryTracker();

        //Null Test
        //1.) Set up base TotalScore to show null score awarded wont change it.
        //2.) Show score before and after null case
        //3.) Manually show that test pass or failed based on what score looks like after null exception
        tracker.recordPlay("test",999);
        tracker.displayHistory();
        tracker.recordPlay("test",null);
        tracker.displayHistory();

    }
}
