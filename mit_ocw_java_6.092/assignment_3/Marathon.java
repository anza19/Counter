class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
        System.out.println(shortestTime(times));
    }

    /**
     * The following method gets the fastest runner from a run of run times for the marathon runners
     * It takes as an input an array of integers, and returns the index corresponding to the person with
     * the lowest time.
     */

     public static int shortestTime(int[] runTimes){
         //To get the shortest time, I implement a simple sorting algorithm and will return the first array element

         //this temp variable will be used during swapping
         int temp;
         //Size of the array
        int size = runTimes.length;

        //So as mentioned above, we perform a simple sorting aka Bubble Sort to get shortest run
        //We cycle through each item in the list and bubble them along until we get a fully sorted list from smallest to largest values (ascending order)
        for(int i = 0; i < size-1; i++){
            for(int j = 0; j < size-1; j++){

                //over here we perform swapping
                //we check if the current element is larger then the next element in the list
                //if so, we swap
                if(runTimes[j] > runTimes[j+1]){

                    //temp stores the smaller value
                    //and then it gets swapped into ith positon, and the larger values goes in the i+1th position
                    temp = runTimes[j+1];
                    runTimes[j+1] = runTimes[j];
                    runTimes[j] = temp;
                }
            }
        }
        //we finally return the smallest element
        return (runTimes[0]);
     };
} 