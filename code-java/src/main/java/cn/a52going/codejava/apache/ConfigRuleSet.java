package cn.a52going.codejava.apache;

import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.RuleSetBase;

/**
 *@ClassName: ConfigRuleSet
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/19 10:53
 **/


public class ConfigRuleSet extends RuleSetBase {
    @Override
    public void addRuleInstances(Digester digester) {
        digester.setValidating( false );
        digester.addObjectCreate("web", WebConfig.class) ;
        digester.addSetProperties("web");

        digester.addObjectCreate( "web/root", Root.class );
        digester.addSetProperties("web/root");
        digester.addSetNext( "web/root", "addRoot" );

        digester.addObjectCreate( "web/root/bar", Bar.class );
        digester.addSetProperties("web/root/bar");
        digester.addSetNext( "web/root/bar", "addBar" );


    }
}
