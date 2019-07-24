package com.ityousee.boot;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        try{
            StringBuilder stringBuilder = new StringBuilder();
//            Files.readAllLines(Paths.get("F:\\worksoftwore\\QQ\\1427428134\\FileRecv\\MobileFile\\fininst5.txt")).stream().forEach(str->stringBuilder.append(str));
            String str = new String(Files.readAllBytes(Paths.get("F:\\worksoftwore\\QQ\\1427428134\\FileRecv\\MobileFile\\fininst5.txt")));
            JSONObject jsonObject = (JSONObject) JSON.parse(str);
            List<Map<String , String >> list = (List)jsonObject.get("obj");
            String outPath = "F:\\worksoftwore\\QQ\\1427428134\\FileRecv\\MobileFile\\";
            for (Map map : list){
                String content = (String)map.get("content");
                String contractname = (String)map.get("contractName");
                Path fpath=Paths.get(outPath+contractname);
                if(!Files.exists(fpath)) {
                    try {
                        Files.createFile(fpath);
                        Files.write(fpath, Base64.getDecoder().decode(content));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }catch (Exception e){

        }
    }
}
