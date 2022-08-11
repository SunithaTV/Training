package JavaTraining.src.day6;

public class Students {
    String name;

    public Students(String name) {
        this.name = name;
    }

    public Students() {
        name = "unknown";
    }


    public static void main(String[] args) {
        Students obj= new Students();
        obj.name="Sunitha";
        System.out.println(obj.name);

    }
}
