package core.user;

class UserTest {
    public static void main (String[] args) {
        User user = new User.Builder()
                .nickname("Nick")
                .level(1)
                .points(10)
                .build();

        System.out.println(user.toString());
    }
}