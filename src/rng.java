public class rng {
    private int counter;
    private String target;
    private String[] targetList = {"A", "B", "C", "D", "E"};
    private int bal;

    public rng(){ //default
        target = targetList[((int)(Math.random()*5))];
        bal = 100;
    }

    public rng(String target) { //custom attempts
        this.target = target;
        bal = 100;
    }

    public rng(String item1, String item2,String item3, String item4, String item5){
        targetList = targetList[item1, item2, item3, item4, item5];
    }

    public int randomNum(){ //generates number for outcome
        int random = (int)(Math.random()*100+1);
        if (random == 1){
            if ((int)(Math.random()*2) == 1)
                return 1;
            else return 2;
        }else if (random <= 5){
            return 3;
        }else if (random <= 25){
            return 4;
        }else return 5;
    }

    public void outcome(){
        bal--;
        String obtained = targetList[randomNum()];
        if (obtained.equals(target)){
            System.out.println("You have obtained your target!");
        }else{
            System.out.println("You did not obtain your target...");
        }
    }
}
