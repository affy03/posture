package com.postureanalysis.posture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class PostureController {

    @GetMapping("/postures")
    public List<Posture> getAllPostures() {
        TargetMuscles targetMuscles1 = new TargetMuscles();
        targetMuscles1.setStrengthen(Arrays.asList("腹筋", "ハムストリングス"));
        targetMuscles1.setRelax(Arrays.asList("腸腰筋"));

        TargetMuscles targetMuscles2 = new TargetMuscles();
        targetMuscles2.setStrengthen(Arrays.asList("腹筋", "ハムストリングス", "僧帽筋下部"));
        targetMuscles2.setRelax(Arrays.asList("腸腰筋", "大胸筋"));

        TargetMuscles targetMuscles3 = new TargetMuscles();
        targetMuscles3.setStrengthen(Arrays.asList("腸腰筋"));
        targetMuscles3.setRelax(Arrays.asList("大殿筋", "ハムストリングス"));

        TargetMuscles targetMuscles4 = new TargetMuscles();
        targetMuscles4.setStrengthen(Arrays.asList("腸腰筋", "僧帽筋下部"));
        targetMuscles4.setRelax(Arrays.asList("ハムストリングス", "腹筋"));

        Posture posture1 = new Posture();
        posture1.setPostureName("ロードシス");
        posture1.setBodySigns(Arrays.asList("反り腰"));
        posture1.setTargetMuscles(targetMuscles1);

        Posture posture2 = new Posture();
        posture2.setPostureName("カイホロードシス");
        posture2.setBodySigns(Arrays.asList("反り腰", "猫背"));
        posture2.setTargetMuscles(targetMuscles2);

        Posture posture3 = new Posture();
        posture3.setPostureName("フラットバック");
        posture3.setBodySigns(Arrays.asList("腰が丸まっている"));
        posture3.setTargetMuscles(targetMuscles3);

        Posture posture4 = new Posture();
        posture4.setPostureName("スウェイバック");
        posture4.setBodySigns(Arrays.asList("腰が丸まっている", "猫背"));
        posture4.setTargetMuscles(targetMuscles4);

        Posture posture5 = new Posture();
        posture5.setPostureName("ニュートラルポジション(理想的な姿勢)");
        posture5.setBodySigns(Arrays.asList("全身の筋バランスが整っている"));
        // posture5のTargetMusclesは省略する


        return Arrays.asList(posture1, posture2, posture3, posture4, posture5);
    }
}
