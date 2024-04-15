public class Module extends Student
{
    private String name;
    private int duration;

    public void setName(String name)
    {
        if (name == "Programming 1" || name == "System Environments" || name == "Flower Arranging" || name == "Neutron Bomb Juggling")
        {
            this.name = name;
        }
        else
        {
            this.name = "unknown";
        }
    }

    public String getName()
    {
        return this.name;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public int getDuration()
    {
        return this.duration;
    }
}