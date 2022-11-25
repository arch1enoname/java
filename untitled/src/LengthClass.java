public class LengthClass {
    public static int getSumLength(GetLengthable... getLengthables) {
        int sum = 0;
        for (GetLengthable getLengthable:getLengthables) {
            sum += getLengthable.getLength();
        }
        return sum;
    }
}
