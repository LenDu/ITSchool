package basics.task_2;

/**
 * Created by Lena on 11/20/2017.
 */
public class Task25Result {
    int result1;
    int result2;

    public Task25Result(int result1, int result2) {
        this.result1 = result1;
        this.result2 = result2;
    }

    @Override
    public String toString() {
        return "5a. Amount of numbers that contain only Even digits: " +
                result1 + '\n' +
                "5b. Amount of numbers that contain equal amount of Even and Odd digits: " + result2;
    }
}
