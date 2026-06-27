class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0,counter=0;

        for(String event:events){
            if(counter==10){
                break;
            }
            if(event.equals("W")){
                counter++;
            }else if(event.equals("WD")||event.equals("NB")){
                score+=1;
            }else{
                score+=Integer.parseInt(event);
            }
        }
        return new int[]{score,counter};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna