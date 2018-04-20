package cn.a52going.codespring.annotationUtils;

/**
 *@ClassName: TracelModel
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/19 16:24
 **/


public class TracelModel {
    @Required
    @Column(desc = "卡类型",allowedValues = {"0","1"},defaultValue = "0")
    private String cardType;
    @Required
    @Column(desc="卡号")
    private String acctCard;

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getAcctCard() {
        return acctCard;
    }

    public void setAcctCard(String acctCard) {
        this.acctCard = acctCard;
    }

    @Override
    public String toString() {
        return "TracelModel{" +
                "cardType='" + cardType + '\'' +
                ", acctCard='" + acctCard + '\'' +
                '}';
    }
}
