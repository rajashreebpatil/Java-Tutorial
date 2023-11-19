package com.corejava;

public class V14_Ch3_Stringd {
    public static void main(String[] args) {
  //1.  name.length() = length of the strings
        String name = "Harry";
        int n = name.length();

       // System.out.println(name.length()); output =5
        //System.out.println(n);  output =5;

        //2. name.toLowerCase():
        String lstring=name.toLowerCase();
        System.out.println(lstring);
        // output = harry

        //3. name.toUpperCase();
          String ustring = name.toUpperCase();
        System.out.println(ustring);
        //output = HARRY

        //4. name.trim();
        String g =  "        Harry";
        System.out.println(g);
        //output=         Harry


        String h = g.trim();
        System.out.println(h);
        // output =  Harry

        //6.name. substring(int start)
        System.out.println(name.substring(2));
        //output= rry

        //7. name.substering(in start, int end)

        System.out.println(name.substring(1,4));
        // output= arr;

        //8. name.replace('r' ,'p')
        System.out.println(name.replace("rry","ier"));
        // output= Haier

        System.out.println(name.replace('r','p'));
      //  output = Happy

      //  9.name.startWith()
        System.out.println(name.startsWith("Ha"));
        // output = true

        //10.name.endsWith()
        System.out.println(name.endsWith("ry"));
        // output= true

        //11. name.charAt()
        System.out.println(name.charAt(1));
        // OUTPUT = a

        //12. name.indexof()
        System.out.println(name.indexOf("ry"));
        // output = 3

        //13. name.indexOf("s",3)
        System.out.println(name.indexOf("ry",3));
        // output =3

        //14. name.lastIndexOf()
        System.out.println(name.lastIndexOf("rry"));
     //   output =2

        //15. name.lastIndexOf()
        System.out.println(name.lastIndexOf("rry",3));

        // output=2

        //16. name.equals()
        System.out.println(name.equals("harry"));

        // false

        //17. name.equalsIgnoreCase("harRY")

        System.out.println(name.equalsIgnoreCase("haRRY"));
        // true





    }
}
