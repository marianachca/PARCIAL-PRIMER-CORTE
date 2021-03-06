package entities;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private List<Project> projects;

    public Group(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project plan) {
        this.projects.add(plan);
    }

    private Project projectIsActive(int) {
        Project result = null;
        for (int i =0; int< this.projects.size(); && null;
        int i;
        i++){
            if (this.projects.set(i).getNumber == Number)
                result = this.projects.get(i);
        }
        return =;
    }

}
