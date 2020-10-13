import com.google.gson.Gson;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.io.IOUtils;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.zip.GZIPOutputStream;

public class Test {
    Gson gson = new Gson();
    @org.junit.Test
    public void test(){
    
        ConcurrentHashMap<Long, Long> map = new ConcurrentHashMap();
        LongStream.range(1, 10).parallel().forEach(this::test2);
        System.out.println(LongStream.range(1,10).boxed().collect(Collectors.toList()));
        
    }
    public void test2(Long val){
        System.out.println(val);
    }
    
    @org.junit.Test
    public void test3(){
        
        String result = " 00:0c:29:64:9f:40 ens160 0000:03:00.0 192.168.113.130 fe80::aa39:c3ad:f897:5b1f";
        String[] info = result.split(" ");
        Map<String, String> resMap = new HashMap<>();
        resMap.put("Firmware", info[0]);
        resMap.put("MACAddr", info[1]);
        resMap.put("Name", info[2]);
        resMap.put("Businfo", info[3]);
        resMap.put("IPV4Addr", info[4]);
        resMap.put("IPV6Addr", info[5]);
        resMap.put("PortType", info[6]);
        System.out.println(gson.toJson(resMap));
    }
    
    @org.junit.Test
    public void test4(){
        String result = "sgsag 00:0c:29:64:9f:40 ens160 0000:03:00.0 192.168.113.130 fe80::aa39:c3ad:f897:5b1f sagsag";
        String[] info = result.split(" ");
        Map<String, String> resMap = new HashMap<>();
        resMap.put("Firmware", info[0]);
        resMap.put("MACAddr", info[1]);
        resMap.put("Name", info[2]);
        resMap.put("Businfo", info[3]);
        resMap.put("IPV4Addr", info[4]);
        resMap.put("IPV6Addr", info[5]);
        resMap.put("PortType", info[6]);
        System.out.println(gson.toJson(resMap));
        writeFile(gson.toJson(resMap), "F://wjhFile.json");
    }
    
    public boolean writeFile (String json, String FilePath) {
        
        boolean res = false;
        try {
            File file = new File(FilePath);
            if (!file.exists()) {
                File fileParent = file.getParentFile();
                if (!fileParent.exists()) {
                    fileParent.mkdirs();
                }
                file.createNewFile();
            } else {
                file.deleteOnExit();
                file.createNewFile();
            }
            
            FileWriter fileWritter = new FileWriter(file, false);
            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
            bufferWritter.write(json);
            bufferWritter.close();
            res = true;
            return res;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
    
    @org.junit.Test
    public void test5(){
        float aa = 3.2333f;
        System.out.println((long) aa);
    }
    
    @org.junit.Test
    public void test6(){
    
//        FileUtils.
       getNumberRes(1, (float)0/1);
        System.out.println((float)0/1);
    }
    
    public float getNumberRes (float f1, float f2) {
        if (f2 == 0){
            return 0;
        }
        float val = f1 / f2;
        BigDecimal big = new BigDecimal(val).multiply(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP);
        float v = big.floatValue();
        return v;
    }
    
    @org.junit.Test
    public void test7(){
        try {
    
            
            String inFileName = "F://wjh.json";
            System.out.println("Creating the GZIP output stream.");
            String outFileName = "F://wjh.gz";
            GZIPOutputStream out = null;
            try {
                out = new GZIPOutputStream(new FileOutputStream(outFileName));
            } catch(FileNotFoundException e) {
                System.err.println("Could not create file: " + outFileName);
                System.exit(1);
            }
        
        
            System.out.println("Opening the input file.");
            FileInputStream in = null;
            try {
                in = new FileInputStream(inFileName);
            } catch (FileNotFoundException e) {
                System.err.println("File not found. " + inFileName);
                System.exit(1);
            }
        
            System.out.println("Transfering bytes from input file to GZIP Format.");
            byte[] buf = new byte[1024];
            int len;
            while((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
        
            System.out.println("Completing the GZIP file");
            out.finish();
            out.close();
        
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    
    @org.junit.Test
    public void testGzip()  throws Exception{
        String [] sources = {"F://wjh.json"};
        String outPath = "F://wjh";
        // gz文件 名称  TAR GZ 就是 .tar.gz
        String gzPath = String.format("%s%s%s",outPath, ".tar", ".gz");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TarArchiveOutputStream tarArchiveOutputStream = null;
        GZIPOutputStream gzipOutputStream = null;
        try {
            tarArchiveOutputStream = new TarArchiveOutputStream(byteArrayOutputStream);
            // 将所有文件打包成 tar文件
            try {
                for (String source : sources) {
                    File file = new File(source);
                    tarArchiveOutputStream.putArchiveEntry(new TarArchiveEntry(file, file.getName()));
                    IOUtils.copy(new FileInputStream(file), tarArchiveOutputStream);
                    tarArchiveOutputStream.closeArchiveEntry();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(tarArchiveOutputStream != null) {
                    tarArchiveOutputStream.flush();
                    tarArchiveOutputStream.close();
                }
            }
            gzipOutputStream = new GZIPOutputStream(new FileOutputStream(gzPath));
            gzipOutputStream.write(byteArrayOutputStream.toByteArray());
        } finally {
            if(byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            if(gzipOutputStream != null) {
                gzipOutputStream.flush();
                gzipOutputStream.close();
            }
        }
    
    }
    
    
    @org.junit.Test
    public void testMapRemove() throws Exception{
//        Map<String, Map<String, String>> map = new HashMap<>();
        Map<String, String> map1 = new ConcurrentHashMap<>();
        map1.put("111", "111");
        map1.put("222", "222");
        map1.put("333", "333");
        map1.put("444", "444");
        try {
            Thread thread = new Thread(()->{
                for (String str : map1.keySet()){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(str + "---" + map1.get(str) + (map1.get(str)==null));
                }
            });
    
            Thread thread1 = new Thread(()->{
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (map1.get("222") != null){
                    map1.remove("222");
                }
            });
            thread.start();
            thread1.start();
            thread.join();
            thread1.join();
        }catch (Exception e){
            System.out.println("errrr");
        }
        System.out.println(map1);
        
        
//        map.put("aaa", map1);
//
//
//        Map<String, Map<String, String>> mapTmp = new HashMap<>();
//        BeanUtils.copyProperties(map, mapTmp);
//        System.out.println(map);
//        System.out.println(mapTmp);
//        System.out.println(map == mapTmp);
////
//
//        System.out.println(map);
//        System.out.println(mapTmp);
//        mapTmp.putAll(map);
//        System.out.println(map.get("aaa") == mapTmp.get("aaa"));5770753
        System.out.println(String.valueOf(1f));
        System.out.println(Test.this);
    }
    
    @org.junit.Test
    public void test11() throws Exception{
    
        String relativelyPath = System.getProperty("user.dir");//原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/java_nio/java-nio-channels.html#article-start
        System.out.println(relativelyPath);
    
    
    }
    
    
}
