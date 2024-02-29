public class Rabbit {
    private String name;
    private int age;
    private String color;
}
public class Tiger {
    private String name;
    private int age;
    private String habitat;

}
public class Cow {
    private String name;
    private int age;
    private String breed;

}
public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng thỏ, hổ và bò
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();

        //thuộc tính cho mỗi đối tượng
        rabbit.setName("Bunny");
        rabbit.setAge(2);
        rabbit.setColor("White");

        tiger.setName("Simba");
        tiger.setAge(5);
        tiger.setHabitat("Jungle");

        cow.setName("MooMoo");
        cow.setAge(3);
        cow.setBreed("Holstein");

        //thông tin của mỗi đối tượng
        System.out.println("Thông tin thỏ:");
        System.out.println("Tên: " + rabbit.getName());
        System.out.println("Tuổi: " + rabbit.getAge());
        System.out.println("Màu sắc: " + rabbit.getColor());

        System.out.println("\nThông tin hổ:");
        System.out.println("Tên: " + tiger.getName());
        System.out.println("Tuổi: " + tiger.getAge());
        System.out.println("Môi trường sống: " + tiger.getHabitat());

        System.out.println("\nThông tin bò:");
        System.out.println("Tên: " + cow.getName());
        System.out.println("Tuổi: " + cow.getAge());
        System.out.println("Giống: " + cow.getBreed());
    }
}
