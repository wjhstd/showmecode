package cn.a52going.codejava.apache;

import org.apache.commons.digester.Digester;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

/**
 *@ClassName: DigesterTest
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/19 10:57
 **/


public class DigesterTest {
    public static void main(String args[]){
        final String fileName = "E:\\project\\showmecode\\code-apache\\src\\main\\resources\\WebConfig.xml" ;
        WebConfig config = new WebConfig() ;
        Digester digester = new Digester() ;
        ConfigRuleSet rule = new ConfigRuleSet();
        rule.addRuleInstances(digester) ;
        try {
            config = (WebConfig)digester.parse(new File(fileName)) ;
            System.out.println("roots size :" + config.getSize()) ;
            Root[] roots = config.getRoots() ;
            for (int i = 0; i < roots.length; i++) {
                System.out.println("root name:" + roots[i].getName()) ;
                System.out.println("map:"+roots[i].getMap().toString());
                Bar[] bars = roots[i].getBars() ;
                for (int j = 0; j < bars.length; j++) {
                    if(j>0) System.out.println("/t------------------");
                    System.out.println("/tbar id:" + bars[j].getId()) ;
                    System.out.println("/tbar title:" + bars[j].getTitle()) ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

    }

}
