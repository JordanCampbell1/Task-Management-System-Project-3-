import java.util.ArrayList;
import java.time.LocalTime;
//import java.time.temporal.ChronoUnit;



public class Tasks //implements Comparable<Tasks>
{
    public static ArrayList<Tasks> ArrofTasks = new ArrayList<Tasks>();
    public static ArrayList<Person> ArrofNames = new ArrayList<Person>(); //adjust the program to implement the arraylist names in it to allow for 2 dependent lists
    
    private String name, taskOutline,endTime;
    private boolean completed;
    private LocalTime startTime;
    private int ETF; //Expected time to finish the tasks in minutes

    /**
     * Default constructor for Tasks class
     */
    public Tasks(){}

    /**
     * Constructor for Tasks class
     * @param name name of the person associated with task.
     * @param startTime start time in Hours and Minutes in the format HH:MM
     * @param taskOutline name of task
     * @param ETF is the expected time for the person to finish task.
     */
    public Tasks(String name, String taskOutline, String startTime,int ETF)
    {
        this.name = name;
        this.taskOutline = taskOutline;
        this.startTime = LocalTime.parse(startTime);
        this.ETF = ETF;
        setEndTime();
        this.completed = false;
    }
    /**
     * Constructor for task class used when 
     * tasks is loaded to determine if it has been completed
     * @param name name of the person associated with task.
     * @param taskOutline name of task
     * @param startTime start time in Hours and Minutes in the format HH:MM
     * @param ETF is an expected time for the person to finish task
     * @param completed is the determinator if the task has been finished.
     */
    
    public Tasks(String name, String taskOutline, String startTime, int ETF, boolean completed)
    {
        this.name = name;
        this.taskOutline = taskOutline;
        this.startTime = LocalTime.parse(startTime);
        this.ETF = ETF;
        setEndTime();
        this.completed = completed;
    }
    /**
     * getter method for name
     * @return the name of the person associated to the task.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * getter method for the name of the task.
     * @return the name of the task
     */
    public String getTaskOutline()
    {
        return taskOutline;
    }
    /**
     * getter method for the start time.
     * @return the start time of the task.
     */
    public String getStartTime()
    {
        return ""+startTime;
    }
    /**
     * getter method for expected time.
     * @return the expected time for task completion.
     */
    public int getExpectedTime()
    {
        return ETF;
    }
    /**
     * getter method for the end time.
     * @return the time the task should be finished
     */
    public String getEndTime(){
        return endTime;
    }

    /**
     * getter method stating if a task is completed.
     * @return a boolean stating if the task was completed.
     */
    public boolean getCompleted()
    {
        return completed;
    }
    /**
     * setter method for the name. 
     * @param name is the new name of the tasks.
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * setter method for the taskoutline.
     * @param taskOutline is new name of the tasks.
     */
    public void setTaskOutline(String taskOutline)
    {
        this.taskOutline = taskOutline;
    }
    /**
     * setter method for the start time.
     * @param startTime is the new starttime.
     */
    
    public void setStartTime(String startTime)
    {
        this.startTime = LocalTime.parse(startTime);
    }
    /**
     * setter method for completed.
     * @param completed is the new completed boolean.
     */
    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }
    /**
     * setter method for end time.
     */
    public void setEndTime() //assumes the start date and the expected time to finish are correctly entered beforehand
    {
        this.endTime = ""+this.startTime.plusMinutes(ETF);
    }
    /**
     * setter method for expected time.
     * @param ETF the new expected time to finish.
     */
    public void setExpectedTime(int ETF)
    {
        this.ETF = ETF;
    }

    
}   
