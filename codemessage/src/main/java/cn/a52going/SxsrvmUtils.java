package cn.a52going;


import cn.a52going.sxsrvm.common.CommonFunction;
import com.huateng.config.BusParam;
import com.huateng.param.ParamServer;
import com.huateng.server.StartThread;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static cn.a52going.sxsrvm.common.TxncodeConst.Req_Id;
import static java.lang.Thread.sleep;

public class SxsrvmUtils {
    //public static String ip;
	private Log logger = LogFactory.getLog(this.getClass());
    public static boolean initConnect = false;
    public static String hbhpweb_IP = "";	//特定理赔IP
    public static String hbhpweb_Port = "";	//特定理赔端口
    public SxsrvmUtils(String ip, String port, String hbhpwebIp, String hbhpwebPort) {
    	//System.out.println("准备连接交易管理平台。。。。。。。。。。。。。。。");
        	//uat环境
        	//String IP = "10.182.227.73";
            String IP = ip;
            //ft环境
            //String IP = "10.182.159.135";
            //String PORT = "9312";
            //sit环境
            //String IP = "10.186.122.233";
            //String PORT = "9312";
            String PORT=port;
            hbhpweb_IP = hbhpwebIp;
            hbhpweb_Port = hbhpwebPort;
            
            logger.info(ip+"============"+port);
            logger.info(" =========特定理赔系统IP===========  "+hbhpweb_IP);
            logger.info(" =========特定理赔系统Port=========  "+hbhpweb_Port);
            
            BusParam.setBusParam("socket_ip", CommonFunction.pretreatString(IP));
            BusParam.setBusParam("socket_param_port", CommonFunction.pretreatString(PORT));
            // 设置请求方编号，每个系统唯一
            BusParam.setBusParam("reqIdentification", Req_Id);//GPS在交易管理系统的编号
            // 启动服务
            new ParamServer().start();
            StartThread.startServ();
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
       
      
    }
    public static void initSxsrvm() {
        if (!initConnect) {
//            String IP = BussFunction.getParDef("JYGLIP", null);//连接交易管理系统IP
//            String PORT = BussFunction.getParDef("JYGLPORT", null);//连接交易管理系统PORT
            //uat环境
            String IP = "10.182.227.73";
            //String IP = ip;
            //ft环境
            //String IP = "10.182.159.135";
            //String PORT = "9312";
            //sit环境
            //String IP = "10.186.122.233";
            String PORT = "9312";
            BusParam.setBusParam("socket_ip", CommonFunction.pretreatString(IP));
            BusParam.setBusParam("socket_param_port", CommonFunction.pretreatString(PORT));
            // 设置请求方编号，每个系统唯一
            BusParam.setBusParam("reqIdentification", Req_Id);//GPS在交易管理系统的编号
            // 启动服务
            new ParamServer().start();
            StartThread.startServ();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            initConnect = true;
        } else {
            // do nothing
        }
    }
    

   
}
