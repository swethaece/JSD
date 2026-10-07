public class Strfun {
    public static void main(String[] args) {
      //String 18 methods 
        String name="KarTHika";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);
        //control+shift+~
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("H"));
        System.out.println(name.equals("karthika"));
        System.out.println(name.equalsIgnoreCase("karthika"));
        System.out.println(name.substring(5));
        System.out.println(name.substring(4, 7));
        System.out.println(name.concat("karur"));
        System.out.println(name.compareTo("arivu"));
        System.out.println(name.compareTo("serlin"));
        System.out.println("g".hashCode());
        System.out.println("a".hashCode());
        //replace method of string 
        String namet="ashika";
        //when ever "a" apperars replace the "o"
        System.out.println(namet.replace('a', 'o'));
        //checking the starting word as we declared on it both the cps also checking 
        System.out.println("start with:"+namet.startsWith("Ashi"));
        System.out.println("start with:"+namet.startsWith("ash"));
        //checking the last of the the declared string 
        System.out.println("ends with :"+namet.endsWith("ka"));
        System.out.println("ends with:"+namet.endsWith("er"));
        //Repeat method
        System.out.println(""+name.repeat(10));
        //when we declared a same variable as declared in above,it acceptoble from another time and replace after declared variable
        name="kal,vi,edu,cat,tion";

        String arr[]=name.split(",");
        System.out.println(arr[0]);
        System.out.println(arr[3]);
        System.out.println(name);

        //array length finding length not be using parathesis for array using in string
        System.out.println(arr.length); //op 5
        name="eat";
        //it check the maches as we check on it,it dont botherate the "."leters only check the variables 
        System.out.println(name.matches(".at"));
    }

}
