import java.util.*;
//APCSA Question 1, Part a)
public void updateRecentlyUsedApps(){
    for (int i = 0; i < allApps.size(); i++){
        App app = allApps.get(i);
        if (app.getUsed()){
            app.setNumTimes(app.getNumTimes() + 1);
        }
    }
}

//APCSA Question 1, Part b)
public ArrayList<App> updateAppStatus(){
    ArrayList<App> list = new ArrayList<App>();
    for (int i = 0; i < allApps.size(); i++){
        App app = allApps.get(i);
        if (app.getNumTimes() > 5){
            app.setRemovable(false);
        } else {
            app.setRemovable(true);
            list.add(app);
        }
    }
    return list;
}

//APCSA Question 1, Part c)
The method header for this app would be as follows: public App
getMostExpensiveApp(). Inside the App class, there would have to be
a new private instance variable (type int) created called "cost" that would 
contain how expensive the App was to download. Then, there also has 
to be an accessor function inside the App class with the following 
method header: public int getCost(), that returns the instance variable
"cost" when called. When instantiating the class, there must also be a
parameter that asks for the cost of the app, and the private instance variable "cost"
would be equal to this parameter. Furthermore, inside the getMostExpensiveApp method, it would check
whether the allApps arraylist's size is 0; if it is, then it would return null.
Then, inside the getMostExpensiveApp method, there has to be two variables
("max" and "maxApp"). "Max" (type int) would contain the maximum cost
as it iterates through allApps, but would first be initialized to 
Integer.MIN_VALUE.The "maxApp" (type App) would be initialized to the first App in the
allApps arraylist by calling allApps.get(0). After iterating through the allApps
arraylist, "max" should be the maximum cost of all the apps in allApps, while
"maxApp" should be the App object that had that maximum cost. In the ending
after the for loop, you would return "maxApp" to get the application that costed the most.
