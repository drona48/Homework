class Important
{
    public void Display1() 
    {
        System.out.println("Venue - Mangal Pandey Ghat");
        System.out.println("Place - The School Premises");
        System.out.println("Reporting Time - 9:45 A.M. ");
    }
}
class Important2
{
    public void Display2()
    {
        System.out.println("No of Students - 25");
        System.out.println("Name of Teacher - Sarbani Banerjee");
        System.out.println("Bus Number - WB 39A9510");
    }
}
public class Picnic
{
    public static void main (String args [])
    {
        Important DisplayA = new Important();
        Important2 DisplayB = new Important2();
        DisplayA.Display1();
        DisplayB.Display2();
    }
}