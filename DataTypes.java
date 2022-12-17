package B.DataTypes;

public class DataTypes {

    public static void main(String[] args) {

        //Integer Family
        //the range of byte is -128 to 127

        byte a = -20;
        System.out.println("a: "+a);  // the plus is called concatenation

        //shirt range is -32768 to 32767
        short b = -368;
        System.out.println("b: "+b);

        //int range is -2,147,483,648 to 2,147,483,647
        int c = 30000;
        System.out.println("c: "+c);

        //long range is -9,223,372,036,854,778,808 to 9,223,372,036,854,778,807
        long d = 155600;
        System.out.println("d: "+d);

        //Float family
        //float range is 3.4E-38 to3.4E+38

        float e = 1.4546f;
        System.out.println("f: " +e);

        //Double range
        double f = 262650.777777777777777;
        System.out.println("f: "+f);

        //Character family
        //range is unicode value in bracket (single range value)

        char g = 'g';
        System.out.println("g: " + g);

        //Boolean Family
        // true or false value

        boolean h = true;
        boolean i = false;

        System.out.println("h: "+h);
        System.out.println("i: "+i);

        //String family
        //string range is 2,147,483,647

        String j = "Software Testing is fun :P ";
        System.out.println("j: "+j);

        String k = "software testing";
        String l = "is fun :P ";
        System.out.println(k + " " + l);
    }

}