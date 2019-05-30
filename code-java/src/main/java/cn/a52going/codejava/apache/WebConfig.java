package cn.a52going.codeapache.digester;

import java.util.HashMap;

/**
 *@ClassName: WebConfig
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/19 10:51
 **/


public class WebConfig {
    private HashMap map = new HashMap();

    public HashMap getMap() {
        return map;
    }

    public void setMap(HashMap map) {
        this.map = map;
    }
    public void addRoot(Root root){
        map.put(root.getName(), root) ;
    }
    public Root findRoot (String name){
        return (Root)map.get(name) ;
    }
    public Root[] getRoots(){
        Object objs[] = map.values().toArray() ;
        Root[] results = new Root[objs.length];
        for (int i = 0; i < objs.length; i++) {
            results[i] = (Root) objs[i];
        }
        return results ;
    }
    public int getSize(){
        return map.size() ;
    }
}
