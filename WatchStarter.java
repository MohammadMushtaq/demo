class WatchStarter{

public static void main (String[] args)
{
Watch w1= new Watch(456,"rolex");
System.out.println(w1.model);
System.out.println(w1.brand);
int model=w1.model;
String brand=w1.brand;

Light light = w1.light;
System.out.println(light.a);

}
}