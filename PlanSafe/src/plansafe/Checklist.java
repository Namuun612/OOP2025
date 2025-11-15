/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plansafe;

/**
 *
 * @author Dell
 */
public class Checklist extends PlanSafe implements ProgressTracker{
    private int completed;
    private int listCount;
    private double progress;

    public Checklist(int completed, String disasterType) {
        super(disasterType);
        this.completed = completed;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }
    
    @Override
    public String progressTrack() {
        progress = completed / listCount * 10;
        return "Checklist Progress: " + progress + "%";
    }
    
    @Override
    public String printDetails() {
        return super.printDetails() +"\nNumber of completed checklist: " + completed;
    }
}
