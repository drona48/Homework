class Mango 
{
    public void Season()
    {
        System.out.println("Mango is the king of fruits.");
        System.out.println("They are available during Summer season.");
    }
}
class Apple 
{
    void Season()
    {
        System.out.println("Apples are produced in Kashmir.");
        System.out.println("They are available during Winter season."); 
    }
}
class Grape 
{
    void Season() 
    {
        System.out.println("Grapes are produced in Maharashtra.");
        System.out.println("They are available during Winter season.");
    }
}
public class Sample_Fruits 
{
    public static void main (String args [])
    {
        Mango Fruit1 = new Mango();
        Apple Fruit2 = new Apple();
        Grape Fruit3 = new Grape();
        Fruit1.Season();
        Fruit2.Season();
        Fruit3.Season();
    }
}