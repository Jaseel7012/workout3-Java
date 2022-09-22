public class Main {
    int f=9;
    static void eat(){
        System.out.println("PROCESSING");



    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] frts={"papaya","banana","apple"};
        for (String i:frts){
            System.out.println(i);
        }
        for(int i=1;i<13;i++){
            if (i==6){
                continue;
            }
            System.out.println(i);



        }
        Main myobj=new Main();

        System.out.println(myobj.f);
        myobj.eat();


    }
}