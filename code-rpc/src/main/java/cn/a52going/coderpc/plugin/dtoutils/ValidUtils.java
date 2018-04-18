package cn.a52going.coderpc.plugin.dtoutils;

import cn.a52going.coderpc.plugin.exception.ValidExcepiton;
import cn.a52going.coderpc.utils.ApiBaseReqDTO;
import cn.a52going.coderpc.utils.IdcardValidator;
import cn.a52going.coderpc.utils.SuperClassUtils;
import cn.a52going.coderpc.utils.ValidUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.*;
import java.util.logging.Logger;

public class ValidUtils {
    private static Log logger = LogFactory.getLog(ValidUtils.class);

    public ValidUtils() {
    }

    public static ValidResult valid(Object dto) {
        ValidResult vresult = new ValidResult();
        String propName = null;

        try {
            new ArrayList();
            List<Class> classes = SuperClassUtils.getSupperClasses(dto.getClass());
            classes.add(dto.getClass());
            Iterator var6 = classes.iterator();

            while(true) {
                Class cs;
                do {
                    if (!var6.hasNext()) {
                        return vresult;
                    }

                    cs = (Class)var6.next();
                } while(cs.equals(Object.class));

                Field[] var10;
                int var9 = (var10 = cs.getDeclaredFields()).length;

                for(int var8 = 0; var8 < var9; ++var8) {
                    Field fs = var10[var8];
                    fs.setAccessible(true);
                    if (fs.getAnnotations() != null && fs.getAnnotations().length >= 1) {
                        logger.debug("验证:" + fs.getName());
                        PropertyDescriptor pd = new PropertyDescriptor(fs.getName(), dto.getClass());
                        Method get = pd.getReadMethod();
                        Object getValue = get.invoke(dto);
                        Annotation[] var17;
                        int var16 = (var17 = fs.getAnnotations()).length;

                        for(int var15 = 0; var15 < var16; ++var15) {
                            Annotation ans = var17[var15];
                            if (ans instanceof InputValid) {
                                InputValid valid = (InputValid)ans;
                                Object value = getValue;
                                propName = fs.getName();
                                if (getValue != null && !getValue.equals("")) {
                                    if (!valid.constValue().isEmpty() && !getValue.equals(valid.constValue())) {
                                        return vresult.setErrorMsg(valid.label() + "  必须为 " + valid.constValue());
                                    }

                                    if (getValue instanceof String) {
                                        value = ((String)getValue).trim();
                                        if (value == null || value.equals("")) {
                                            if (valid.notEmpty()) {
                                                return vresult.setErrorMsg(valid.label() + valid.emptyErr());
                                            }
                                            continue;
                                        }

                                        if (valid.mustLength() > 0 && value.toString().length() != valid.mustLength()) {
                                            return vresult.setErrorMsg(valid.label() + " 必须是" + valid.mustLength() + "个字符");
                                        }

                                        if (valid.maxLength() > 0 && value.toString().length() > valid.maxLength()) {
                                            return vresult.setErrorMsg(valid.label() + " 不能超过" + valid.maxLength() + "个字符");
                                        }

                                        if (valid.minLength() > 0 && value.toString().length() < valid.minLength()) {
                                            return vresult.setErrorMsg(valid.label() + " 不能小于" + valid.minLength() + "个字符");
                                        }
                                    }

                                    BigDecimal newValue;
                                    if (value instanceof Number) {
                                        newValue = new BigDecimal("" + value);
                                        BigDecimal min;
                                        if (!valid.max().isEmpty()) {
                                            min = new BigDecimal(valid.max());
                                            if (newValue.compareTo(min) == 1) {
                                                return vresult.setErrorMsg(valid.label() + " 必须小于  " + valid.max());
                                            }
                                        }

                                        if (!valid.min().isEmpty()) {
                                            min = new BigDecimal(valid.min());
                                            if (newValue.compareTo(min) == -1) {
                                                return vresult.setErrorMsg(valid.label() + " 必须大于  " + valid.min());
                                            }
                                        }
                                    }

                                    if (!valid.validType().equals(ValidType.none)) {
                                        String valueStr = value.toString();
                                        if (valid.validType().equals(ValidType.number) && !ValidUtil.get().isDigit(valueStr)) {
                                            return vresult.setErrorMsg(valid.label() + "必须是数字");
                                        }

                                        if (valid.validType().equals(ValidType.decimal) && valid.decimalLen() >= 1 && !ValidUtil.get().isNumber(valueStr, valid.decimalLen())) {
                                            return vresult.setErrorMsg(valid.label() + "小数位最多只能是" + valid.decimalLen() + "位，当前值为" + value);
                                        }

                                        if (valid.validType().equals(ValidType.mobile) && !ValidUtil.get().isMobile(valueStr)) {
                                            return vresult.setErrorMsg(valid.label() + "格式必须是手机格式");
                                        }

                                        if (valid.validType().equals(ValidType.email) && !ValidUtil.get().isEmail(valueStr)) {
                                            return vresult.setErrorMsg(valid.label() + "格式必须是Email格式");
                                        }

                                        if (valid.validType().equals(ValidType.date) && !ValidUtil.get().isDate(valueStr)) {
                                            return vresult.setErrorMsg(valid.label() + "格式必须是日期格式（yyyy-MM-dd）");
                                        }

                                        if (valid.validType().equals(ValidType.datetime) && !ValidUtil.get().isDate(valueStr, "yyyy-MM-dd HH:mm:ss")) {
                                            return vresult.setErrorMsg(valid.label() + "格式必须是日期格式（yyyy-MM-dd HH:mm:ss）");
                                        }

                                        if (valid.validType().equals(ValidType.idcard)) {
                                            if (valueStr.length() != 18) {
                                                return vresult.setErrorMsg(valid.label() + " 长度不合法");
                                            }

                                            if (!IdcardValidator.isValidatedAllIdcard(valueStr)) {
                                                return vresult.setErrorMsg(valid.label() + " 不合法");
                                            }
                                        }

                                        if (valid.validType().equals(ValidType.chinese_chars) && !ValidUtil.isChinese(valueStr)) {
                                            return vresult.setErrorMsg(valid.label() + "所有字符必须是中文");
                                        }
                                    }

                                    if (value != null && valid.inputValues() != null && valid.inputValues().length >= 1) {
                                        String[] inputValues = valid.inputValues();
                                        boolean valusIsContain = false;
                                        String[] var25 = inputValues;
                                        int var24 = inputValues.length;

                                        for(int var23 = 0; var23 < var24; ++var23) {
                                            String vs = var25[var23];
                                            String[] vsarray = vs.split(":");
                                            if (vsarray[0].equals(value.toString())) {
                                                valusIsContain = true;
                                                break;
                                            }
                                        }

                                        if (!valusIsContain) {
                                            return vresult.setErrorMsg(valid.label() + " 的值" + value + " 不合法," + " 值对照表：" + Arrays.toString(valid.inputValues()));
                                        }
                                    }

                                    if (valid.scale() != -1 && value instanceof BigDecimal) {
                                        newValue = ((BigDecimal)value).setScale(valid.scale(), 1);
                                        if (newValue.compareTo((BigDecimal)value) != 0) {
                                            return vresult.setErrorMsg(valid.label() + " 的值" + value + "超过精度[" + valid.scale() + "]");
                                        }
                                    }
                                } else if (valid.notEmpty()) {
                                    if (valid.emptyErr() != null && !valid.emptyErr().isEmpty()) {
                                        return vresult.setErrorMsg(valid.emptyErr());
                                    }

                                    return vresult.setErrorMsg(valid.label() + " 不能为空");
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception var27) {
            var27.printStackTrace();
            String msg = "验证字段 " + propName + "出现异常";
            ValidExcepiton ve = new ValidExcepiton(msg);
            ve.setCause(var27);
            ve.setClazz(dto.getClass());
            vresult.setErrorMsg(msg);
            vresult.setException(ve);
            return vresult;
        }
    }

    public static List<InputValid> validList(Class cls) {
        List<InputValid> vds = new ArrayList();
        List<Class> classes = SuperClassUtils.getSupperClasses(cls);
        classes.add(cls);
        Iterator var4 = classes.iterator();

        while(true) {
            Class cs;
            do {
                if (!var4.hasNext()) {
                    return vds;
                }

                cs = (Class)var4.next();
            } while(cs.equals(ApiBaseReqDTO.class));

            Field[] var8;
            int var7 = (var8 = cls.getDeclaredFields()).length;

            for(int var6 = 0; var6 < var7; ++var6) {
                Field fs = var8[var6];
                if (fs.getAnnotations() != null && fs.getAnnotations().length >= 1) {
                    Annotation[] var12;
                    int var11 = (var12 = fs.getAnnotations()).length;

                    for(int var10 = 0; var10 < var11; ++var10) {
                        Annotation ans = var12[var10];
                        if (ans instanceof InputValid) {
                            InputValid valid = (InputValid)ans;
                            vds.add(valid);
                        }
                    }
                }
            }
        }
    }

    public static Map<String, InputValid> getValidListMap(Class cls) {
        Map<String, InputValid> linkedMap = new LinkedHashMap();
        List<Class> classes = SuperClassUtils.getSupperClasses(cls);
        classes.add(cls);
        Iterator var4 = classes.iterator();

        while(true) {
            Class cs;
            do {
                if (!var4.hasNext()) {
                    return linkedMap;
                }

                cs = (Class)var4.next();
            } while(cs.equals(ApiBaseReqDTO.class));

            Field[] var8;
            int var7 = (var8 = cs.getDeclaredFields()).length;

            for(int var6 = 0; var6 < var7; ++var6) {
                Field fs = var8[var6];
                fs.setAccessible(true);
                if (fs.getAnnotations() != null && fs.getAnnotations().length >= 1) {
                    Annotation[] var12;
                    int var11 = (var12 = fs.getAnnotations()).length;

                    for(int var10 = 0; var10 < var11; ++var10) {
                        Annotation ans = var12[var10];
                        if (ans instanceof InputValid) {
                            InputValid valid = (InputValid)ans;
                            linkedMap.put(fs.getName(), valid);
                        }
                    }
                }
            }
        }
    }
}
