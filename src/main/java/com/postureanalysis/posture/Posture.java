package com.postureanalysis.posture;

import java.util.List;

public class Posture {
    private String postureName;
    private List<String> bodySigns;
    private TargetMuscles targetMuscles;

    public String getPostureName() {
        return postureName;
    }

    public List<String> getBodySigns() {
        return bodySigns;
    }

    public TargetMuscles getTargetMuscles() {
        return targetMuscles;
    }

    public void setPostureName(String postureName) {
        this.postureName = postureName;
    }

    public void setBodySigns(List<String> bodySigns) {
        this.bodySigns = bodySigns;
    }

    public void setTargetMuscles(TargetMuscles targetMuscles) {
        this.targetMuscles = targetMuscles;
    }
}
