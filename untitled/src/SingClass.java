public class SingClass {
    public static void singEveryBird(Bird... birds) {
        for (Bird bird : birds) {
            bird.sing();
        }
    }
}
