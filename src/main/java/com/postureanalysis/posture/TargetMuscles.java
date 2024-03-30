package com.postureanalysis.posture;

import java.util.List;

public class TargetMuscles {
    private List<String> strengthen;
    private List<String> relax;

    public List<String> getStrengthen() {
        return strengthen;
    }

    public List<String> getRelax() {
        return relax;
    }

    public void setStrengthen(List<String> strengthen) {
        this.strengthen = strengthen;
    }

    public void setRelax(List<String> relax) {
        this.relax = relax;
    }
}
