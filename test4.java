public class test4
{
public static void main(String[] args)
{
    
circle2 c2=new circle2(54,"blue",true);
System.out.println(c2.toString());
c2.getArea();
c2.getPerimeter();
    rectangle2 r2=new rectangle2(24.87,11.5,"blue",true);
    System.out.println(r2.toString());

    r2.getArea();
    r2.getPerimeter();
    square2 s2=new square2(45,98,12);
        System.out.println(s2.toString());
s2.getArea();
    s2.getPerimeter();
}
}