public class rng {
    private int counter;
    private int times;
    private String target;
    private String[] targetList = {"A", "B", "C", "D", "E"};

    public rng(){ //default
        times = 1;
        target = targetList[((int)(Math.random()*5))];
    }

    public rng(int times){ //custom attempts
        this.times = times;
    }

    public int randomNum(){ //generates number for outcome
        int random = (int)(Math.random()*100);
        if (random == 1){
            if ((int)(Math.random()*2) == 1)
                return 1;
        }else if (random <= 5){
            return 2;
        }else if (random <= 25){
            return 3;
        }else return 4;
    }

    public void outcome(){

    }
}
