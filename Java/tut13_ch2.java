
class employee {
    private int id;
    private String name;

    public employee() {
        id = 34;
        name = "Your name here";

    }

    public employee(String myname, int myid) {
        id = myid;
        name = myname;

    }

    public String getname() {
        return name;

    }

    public void setname(String n) {
        this.name = n;
    }

    public void setid(int i) {
        this.id = i;

    }

    public int getid() {
        return id;
    }
}

public class tut13_ch2 {
    public static void main(String[] args) {

        employee harry = new employee("CodewithHarry", 12);

        // harry.setname("Harry");
        // harry.setid(69);

        System.out.println(harry.getname());
        System.out.println(harry.getid());

    }
}