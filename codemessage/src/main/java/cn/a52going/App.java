package cn.a52going;

import cn.a52going.inter0100125.GCustInfoRet;
import cn.a52going.sxsrvm.common.CommonFunction;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 *
 */
public class App {
    private Log log= LogFactory.getLog(this.getClass());
    public static void main( String[] args )
    {

        SxsrvmUtils.initSxsrvm();

        GCustInfoRet gc = null;
        try {//025869413258
            gc = CommonFunction.getGCustInfo("025869555170");
            System.out.println(gc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
