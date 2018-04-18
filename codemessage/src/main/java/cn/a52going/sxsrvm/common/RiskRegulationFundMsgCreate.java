package cn.a52going.sxsrvm.common;


public class RiskRegulationFundMsgCreate {

	//报文头的 识别码
	private final static String code = "1222034";
	
	/**
	 * 根据bean制作报文
	 * 
	 * @param bean 包含报文需要字段的bean
	 * 
	 * @author 李芳
	 */
	public String createMsg(RiskRegulationFundBean bean)
	{
		int i = 0;
		StringBuilder result = new StringBuilder("");
		result.append(ZYXHeadMsgCreate.getHeadMsg(code));
		result.append(ZYXUtil.addSpace(bean.getTreatyNumber(), Integer.parseInt(Const.DBYB_RiskRegulationFund_treatyNumber_length)));
		result.append(ZYXUtil.addSpace(bean.getSettleNumber(), Integer.parseInt(Const.DBYB_RiskRegulationFund_settleNumber_length)));
		result.append(ZYXUtil.addSpace(bean.getPolicyInfo(), Integer.parseInt(Const.DBYB_RiskRegulationFund_policyNumber_length)));
		result.append(ZYXUtil.addSpace(bean.getRiskRegulationCost(), Integer.parseInt(Const.DBYB_RiskRegulationFund_riskRegulationCost_length)));
		result.append(ZYXUtil.addSpace(bean.getPaymentType(), Integer.parseInt(Const.DBYB_RiskRegulationFund_paymentType_length)));
		result.append(ZYXUtil.addSpace(bean.getRiskRegulationType(), Integer.parseInt(Const.DBYB_RiskRegulationFund_riskRegulationType_length)));
		result.append(ZYXUtil.addSpace(bean.getRiskRegulationYear(), Integer.parseInt(Const.DBYB_RiskRegulationFund_riskRegulationYear_length)));
		result.append(ZYXUtil.addSpace(bean.getFilialeCode(), Integer.parseInt(Const.DBYB_RiskRegulationFund_filialeCode_length)));
		result.append(ZYXUtil.addSpace(bean.getOperator(), Integer.parseInt(Const.DBYB_RiskRegulationFund_operator_length)));
		result.append(ZYXUtil.addSpace(bean.getGroupCode(), Integer.parseInt(Const.DBYB_RiskRegulationFund_groupCode_length)));
		result.append(ZYXUtil.addSpace(bean.getBackSettleNumber(), Integer.parseInt(Const.DBYB_RiskRegulationFund_backSettleNumber_length)));
		return result.toString();
	}
}
