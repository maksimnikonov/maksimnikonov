package sef.ATestTask.SecondActivity;



public class Operations {
    private int x;
    private int y;
    public int sum(int x, int y){
       int sum = x + y;
        return  sum ;
    }
    public int substract(int x, int y){
        int value;
        if(x>y){
            return value = x-y;
        }else{
            return value = y-x;
        }
    }
    public int multiply(int x, int y){
        int multiplication = 0;
        return multiplication = x*y;
    }
    public int divide(int x, int y){

        int value;
        if(y == 0)
            value = 0;
        else{
            value =  x/y;

        }
    return value;
    }
public void setSum(int x, int y){
        this.x = x;
        this.y = y;
}
public int getSum(){
        return sum(x, y);
}
    public void setSubstraction(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getSubstract(){
        return substract(x, y);
    }
    public void setMultiply(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getMultiply(){
        return multiply(x, y);
    }
    public void setDivide(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getDivide(){
        return divide(x, y);
    }

}
