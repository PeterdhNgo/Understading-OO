public class Student
{
    private String id;
    private String name;
    private String address;
    private int age;
    private Module module;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return this.id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setAge(int age)
    {
        if (age < 18)
        {
            this.age = 18;
        }
        else
        {
            this.age = age;
        }
    }

    public int getAge()
    {
        return this.age;
    }

    public void setModule(Module module)
    {
        this.module = module;
    }

    public Module getModule()
    {
        return this.module;
    }
}