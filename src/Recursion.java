public class Recursion {
    // recursion = when a thing is defined in terms of itself
    //             Apply the result of a procedure, to a procedure.
    //             A recursive method calls itself. Can be a substitute for iteration.
    //             Divide a problem into a sub-problems of the same type as the original.
    //             Commonly used with advanced sorting algorithms and natives trees

    //              Advantages:
    //              -----------------
    //              easier to red/write
    //              easier to debug

    //              Disadvantages
    //              -----------------
    //              sometimes slower -> because it works in call stack = stacks of functions called
    //              uses more memory

        public static void main(String[] args) {
            walk(5);
            System.out.println(factorial(7));
            System.out.println(power(2,8));
        }

    private static int power(int base, int exponent) {
            if(exponent < 1){
                return 1; // base case
            }
            return base * power(base, exponent -1);

    }

    private static int factorial(int num) {
            if(num < 1){
                return 1; // base case
            }
            return num*(factorial(num-1)); //recursive case
    }

    private static void walk(int steps){
            //iteration
            // for(int i = 0; i < steps; i++){
                // System.out.println("You take a step");
            // }
            if(steps<0){
                return; // base case
            }
            System.out.println("You take a step");
            walk(steps-1); // recursive case

        }
}
