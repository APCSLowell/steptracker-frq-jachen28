import java.util.ArrayList;
public class StepTracker
{
private int num1; 
private ArrayList <Integer> arr;

public StepTracker(int steps) {
num1 = steps; 
ArrayList <Integer> arr = new ArrayList<Integer>();
}

public void addDailySteps(int num){
 arr.add(num);
}

public int activeDays(){
int days = 0;
 if(arr.size() == 0)
  return 0;
for(int i = 0; i < arr.size(); i++){
 if(arr.get(i) >= num1)
days++;
}
 return days;
}

 public double averageSteps(){
  if(arr.size() == 0)
return (double) 0;
  int numSteps = 0; 
  for(int i = 0; i < arr.size(); i++){
   numSteps += arr.get(i);
  }
  return (double) numSteps/arr.size();
 }
 
}

