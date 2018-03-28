package pl.mdolat.vlexfood.vlexfood;

import org.springframework.stereotype.Component;

@Component
public class Opinion {

    private String name;
    private String description;
    private String dateIns;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateIns() {
        return dateIns;
    }

    public void setDateIns(String dateIns) {
        this.dateIns = dateIns;
    }
}
