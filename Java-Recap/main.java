class Main{
    public static void main(String[] args) {

        System.out.println(hello("Jai", 18));

        cat.catts(); // it's from another class cat.java. It can be called like this because it has static on it

        cat myCat = new cat(); // need to make an object because it doesn't have a static,
        System.out.println(myCat.hays());
    }

    
    private static String hello(String myName, int age){
        // return "hello " + myName + ", you are " + age + " years old";

        if(age >= 18 && myName.equals("Jai")){
            return "hello " + myName + ", you are " + age + " years old";
        }else{
            return "Wrong";
        }
    }

} 