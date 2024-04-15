public class Main
{
    public static void main(String[] args)
    {
        Student handsomeBoy = new Student();
        handsomeBoy.setId("K2358612");
        handsomeBoy.setName("Peter");
        handsomeBoy.setAge(20);

        System.out.println(handsomeBoy.getId());
        System.out.println(handsomeBoy.getName());
        System.out.println(handsomeBoy.getAge());

        Module boyModule = new Module();
        boyModule.setName("Programming 1");

        System.out.println(boyModule.getName());
    }
}