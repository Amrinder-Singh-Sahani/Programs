
class employee {
    private int id;
    private String name;

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }

    public void setid(int i) {
        id = i;

    }

    public int getid() {
        return id;
    }
}

public class tut13 {
    public static void main(String[] args) {
        employee harry = new employee();
        // harry.id = 34;
        // harry.name = "Harry"; // This 2 commented tokens will throw an error because
        // we used variables whose access modifier is private.

        harry.setname("Harry");

        harry.setid(34);

        System.out.println(harry.getname());
        System.out.println(harry.getid());

    }
}