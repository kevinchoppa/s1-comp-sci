public class StepTracker{           
        int step;                                                           //global variable
        int day;
        int activeDays;
        
         public StepTracker(int x){         
                step = x;                                                   //constructor
        }
     public int activeDays(){
                return activeDays;                                          //method
        }
         public double averageSteps(){
            return (step/day)*1.0;
        }
            public void addDailySteps(int x){
                step = step + x;
                    if(x>10000){
                        activeDays++
                }
                        day++;
        }
    }