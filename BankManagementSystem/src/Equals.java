public class Equals {
    String name;
    String np;
    Equals(String name,String np)
    {
        this.name=name;
        this.np=np;

    }
    public  boolean equals(Object o)
    {
        Equals ab=(Equals)o;
        if (this.name==ab.name&& this.np==ab.np )
        {return true;}
        else
            return false;
    }

    public static void main(String[] args) {
        Equals a=new Equals("abc","pune");

        Equals b=new Equals("abc","pune");
        System.out.println(a.equals(b));


    }
}
