package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class SabanaResearch {

    private List<Group> groups;
    private List<Summary> summaries;
    private BinaryOperator<Integer> identy;

    public SabanaResearch(List<Group> groups) {
        this.groups = groups;
        this.summaries = new ArrayList<>();
    }

    public int countOfGroups() {
        return this.groups.size();
    }

    public int countOfSummaries() {
        return this.summaries.size();
    }

    /**
     * Create a summary entry in the current date.
     * - Calculate the count of active projects.
     *
     * @return The new Summary entry.
     */
    public Summary createSummaryEntry() {
         int activeProjects = this.groups.stream().map(g -> g.countActiveProjects()).reduce(identy: 0,(a,b));

         for (Group g: this.groups){
             activeProjects += g.countActiveProjects();
         }
         Summary summary = new summary (activeProjects, LocalDate.now());
        final boolean add = this.summaries.add(summary);

        return summary;
    }
}
