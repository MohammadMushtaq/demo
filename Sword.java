class Sword 
{
String sw1="Strong";
static String sw2= "sharp";
void kill()
{
System.out.println("invoke instance method");
System.out.println(sw1);

hunt();
sharp();
}
void hunt()
{
System.out.println("invoke another instance method");	
}

static void sharp()
{
System.out.println("invoke  method");
System.out.println(sw2);
cut();
}
static void cut()
{
System.out.println("static invoke  method");
}
}