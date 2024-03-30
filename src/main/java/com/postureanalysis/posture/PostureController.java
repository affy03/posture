package com.postureanalysis.posture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController

public class PostureController {

    @GetMapping("/postures")
    public Map<String, String> postures() {
        Map<String, String> postureMap = new LinkedHashMap<>();
        postureMap.put("【姿勢①】ロードシス", "【状態】反り腰　【鍛えたい筋肉】腹筋、ハムストリングス　【緩めたい筋肉】腸腰筋");
        postureMap.put("【姿勢②】カイホロードシス", "【状態】反り腰かつ猫背　【鍛えたい筋肉】腹筋、ハムストリングス、帽筋下部　【緩めたい筋肉】腸腰筋、大胸筋");
        postureMap.put("【姿勢③】フラットバック", "【状態】腰が丸まっている　【鍛えたい筋肉】腸腰筋　【緩めたい筋肉】大殿筋、ハムストリングス");
        postureMap.put("【姿勢④】スウェイバック", "【状態】腰が丸まっているかつ猫背　【鍛えたい筋肉】腸腰筋、僧帽筋下部　【緩めたい筋肉】ハムストリングス、腹筋");
        postureMap.put("【姿勢⑤】ニュートラルポジション", "【状態】理想的な姿勢。全身の筋バランスが整っている。");
        return postureMap;
    }
}
