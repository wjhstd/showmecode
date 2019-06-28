package com.ityousee.boot.security;

import com.alibaba.fastjson.JSONObject;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.jwt.codec.Codecs;
import org.springframework.security.jwt.crypto.sign.RsaSigner;
import org.springframework.security.jwt.crypto.sign.RsaVerifier;

import java.util.Map;

public class JwtTokenUtils {
    private static Object obj=new Object();

    /**
     * jzq.sso的私钥
     */
    private static String ssoAppPrivateKey="-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIICXAIBAAKBgQCNazgUsvUe+48Gvji+mrXauCHaFux4Dq/xrHbM0sjO+xaGkKUr+p1n4kr6i+XBJzyEib/Q7K2ZhagfT0IbfqIQ70AAAjbpStGU2imnc2VhZRL87KOHAjoeMElkOw0Ebl3APhaOV8P/3SNUnz/J1dcTwgFogl6mHr9UD/jOXPhQfQIDAQABAoGAfPPJf3CH6LI4s6qLlM459GFRd9NdaM8BYrYR2fQ8fbWZN5jCeFNdlRZ7TVkizkGO1USo+T7GPKm93Lw5GvYO1zf5UnGhR27OYKS6UW3tMbMMLMb4DhxoaxgDu99aYIkl64t+Gs788xypUVZjPMBpsiGAg5KAOxNOmQ06WGQPbzkCQQDboTTmSvTLoowfRH+/f5hNNDnFKRBedGZxZ3oQOHqeehu/G6JzxTs2IZEMXd+v4Q4aEr6QLv6jkyzFrFlJGydDAkEApNZoPk8jlGMx627ZfG3z4xWgj0CUWLYCBAyT1HzhS8w+aOvPLRMfL7yDmpKJJSnMRobhrBIUc3IyksLFz7PNPwJALU8Ear3r4laWMZ0f/ZGFCehMQrBGADZjK+H8/HuqUCdAshwxV1DI9lHWaoazLsVu81IKnhQT1Ar4oY78nGhNoQJAF54YxYS1RleIGYGCa8+dOBYrMRtBpgw98bKTo8hYx3F2J7ZRstWgjEhoWsdQGyEIAbrlrq/QelIMaPa7PO04JQJBANVQpUREGLgKzIOepM1yiulnWuc4Bnd2SvyLqxLZLkD3lOTLo0omZZPpgA8/VSNKb+HHxpaLXVDc6eGkpQxXf50="+
            "-----END RSA PRIVATE KEY-----\n";

    /**
     * jzq.sso的公钥
     */
    private static String ssoAppPublicKey="-----BEGIN PUBLIC KEY-----\n" +
            "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCNazgUsvUe+48Gvji+mrXauCHaFux4Dq/xrHbM0sjO+xaGkKUr+p1n4kr6i+XBJzyEib/Q7K2ZhagfT0IbfqIQ70AAAjbpStGU2imnc2VhZRL87KOHAjoeMElkOw0Ebl3APhaOV8P/3SNUnz/J1dcTwgFogl6mHr9UD/jOXPhQfQIDAQAB"+
            "-----END PUBLIC KEY-----\n";

    /**
     * 签名工具
     */
    private static RsaSigner signer;

    private static RsaVerifier verifier;

    static {
        signer=new RsaSigner(ssoAppPrivateKey);
        verifier=new RsaVerifier(ssoAppPublicKey);
    }

    public byte[] enSign(String data){
        byte[] content = Codecs.utf8Encode(data);
        byte[] signed = signer.sign(content);
        return signed;
    }


    /**
     * 加密token
     * @param json 要加密的json
     * @return
     */
    public static String encode(String json){
        Jwt jwt = JwtHelper.encode(json, signer);
        return jwt.getEncoded();
    }

    /**
     *
     * @param json 要加密的json
     * @param headers 共享数据，这个可以JwtHelper.headers取得map得取得：{headers.key=headers.val, alg=HS256, typ=JWT}
     * @return
     */
    public static String encode(JSONObject json, Map<String,String> headers){
        Jwt jwt = JwtHelper.encode(json.toJSONString(), signer, headers);
        return jwt.getEncoded();
    }

    /**
     * 解密token|token自带了解密串，使用了公私对串再进行一次校验
     * @return
     */
    public static String decode(String token){
        try{
            Jwt jwt = JwtHelper.decodeAndVerify(token,verifier);

            return jwt.getClaims();
        }catch (RuntimeException e){
            throw new RuntimeException("校验失败");
        }
    }

    public static void main(String[] args) {
        JSONObject json=new JSONObject();
        json.put("hehe","https://my.oschina.net/yifanxiang");
        String token=JwtTokenUtils.encode(json.toJSONString());
        System.out.println(token);
        //Map map=JwtHelper.headers(token);
        //System.out.println(map);
        String info=JwtTokenUtils.decode("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJoZWhlIjoiaHR0cHM6Ly9teS5vc2NoaW5hLm5ldC95aWZhbnhpYW5nIn0.BU-Uii5Ral7RMlJrUc5uHr7zMaRFTnsLiMhsIXWGctTkjhpNefN-sdgVXIyQiJ5Xu8_jVVNKndMQDvCfGZUlCsjcuIFRaU0v36yyLHNW3mzcFBKnYadYlnlSpaSZqwMN-xuyXS8DTqcu1Tc4SxRsCE0hn0rHsDb8AGFAyrOlJu4");
        System.out.println(info);
    }
}
