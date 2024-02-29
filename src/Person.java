import util.RandomUtil;

public abstract class Person {

    private int id;
    private String name;
    private int age;
    private static int personCounter=0;

    public Person( String name, int age) {
        this.id = ++personCounter;
        this.name = "Person" + this.id;
        this.age = RandomUtil.getRandomAge(18, 121);
    }

    @Override
    public String toString() {
        return "Person with " +
                "id:" + id +
                ", name:'" + name +
                ", age:" + age;
    }
}
