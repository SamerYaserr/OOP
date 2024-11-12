public class Main{
    static void display( Showable s){
        s.display();
    }

    public static void main(String[] args) {
        RewardClass c1 = new RewardClass();
        RewardClass c2 = new RewardClass(){
            @Override
            public void print (){
                System.out.println("your reward is $20");
            }
        };

        c1.print();
        c2.print();

        //------------------------------------------------

        Showable s1 = new Showable() {
            @Override
            public void display() {
                System.out.println("Showable inner");
            }
        };

        s1.display();

        //------------------------------------------------

        s1 = () ->{
            System.out.println(" lambda1 ");
        };
        s1.display();


        s1 = () -> System.out.println(" lambda2 ");
        s1.display();

        //------------------------------------------------

        display(  new Showable() {
            @Override
            public void display() {
                System.out.println(" inner as argument");
            }
        } );

        //------------------------------------------------

        TestClass t = new TestClass() {
            @Override
            public void testMethod() {
                System.out.println(" Anonymous inner class2");
            }
        };
        t.testMethod();

        //------------------------------------------

        t = new TestClass(5) {
            @Override
            public void testMethod() {
                System.out.println(" Anonymous inner class2");
            }
        };
        t.testMethod();

        //------------------------------------------

        t = new TestClass() {
            {
                System.out.println("Block");
            }
            @Override
            public void testMethod() {
                System.out.println(" Anonymous inner class3");
            }
        };

        //--------------------------------------------

        var t2 = new TestClass(){
            public void testMethod() {
                System.out.println(" Anonymous inner class4");
            }

            public void testMethod2(int x){
                System.out.println("x= " + x );
            }

        };
        t2.testMethod2( 7 );
    }
}