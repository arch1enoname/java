public class Cat implements Meowable{
    private String name;
    public Cat(String name) {
        this.name = name;
    }

    void getName(String name) {
        this.name = name;
    }



    public void meow() {
        System.out.println(name + ":" + "meow");
    }

    public void meowNTimes(int n) {
        String s = "";
        for (int i = 0; i < n-1; i++) {
            s += "meow-";
        }
        s += "meow!";
        System.out.println(name + ":" + s);
    }
}
