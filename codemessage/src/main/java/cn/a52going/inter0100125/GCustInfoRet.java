package cn.a52going.inter0100125;


import cn.a52going.common.ReturnDataBean;

public class GCustInfoRet extends ReturnDataBean {

	private static final long serialVersionUID = -8301172739490012724L;

	@Override
	public void setVal() {
		this.retNameList = new String[]{"name","address","phone","bank_code","accnt_nmbr",
				                         "comp_addr","zipcode","reg_date","range","taxregid",
				                         "credentialtype","credentialid","cmpny_code","contact_person",
				                         "contact_phone","staff_count","is_corporation",
				                         "customer_type","corpbegdate","corpenddate","corp_regist_id","corp_tax_start","corp_tax_end",
				                         "taxptype","taxreg_addr","soccredit","soccredbegdate","soccredenddate"};
		this.retLenList = new int[]{60,60,14,12,30,60,6,10,100,20,2,50,20,60,30,12,2,2,10,10,30,10,10,2,120,18,10,10};
	}
	
	private String name;      //单位名称
	private String address;	    //单位地址
	private String phone;  	  	//电话号码
	private String bank_code; 	//划账行代码
	private String accnt_nmbr;  	//开户帐号
	private String comp_addr;  	//收费地址
	private String zipcode;  	   //邮政编码
	private String reg_date;  	   //等级日期
	private String range;  	//经营范围
	private String taxregid;  	//经营范围
	private String credentialtype;  	//经办人证件类型
	private String credentialid;			//经办人证件号码
	private String cmpny_code;  	//组织机构代码
	private String contact_person;		//联系人
	private String contact_phone;	//联系电话
	private String staff_count;		//员工总数
	private String is_corporation;	//是否法人
	/**** REQFRZG-151112-20 start ***/
	private String taxptype;	//纳税人类型
	private String taxreg_addr;		//税务登记地址
	private String soccredit;		//社会信用代码
	private String soccredbegdate;//社会信用代码有效起期
	private String soccredenddate;//社会信用代码有效终期 
	private String customer_type;
	private String corpbegdate;
	private String corpenddate;
	private String corp_regist_id;
	private String corp_tax_start;
	private String corp_tax_end;

	public String getCustomer_type() {
		return customer_type;
	}
	public void setCustomer_type(String customerType) {
		customer_type = customerType;
	}
	public String getCorpbegdate() {
		return corpbegdate;
	}
	public void setCorpbegdate(String corpbegdate) {
		this.corpbegdate = corpbegdate;
	}
	public String getCorpenddate() {
		return corpenddate;
	}
	public void setCorpenddate(String corpenddate) {
		this.corpenddate = corpenddate;
	}
	public String getCorp_regist_id() {
		return corp_regist_id;
	}
	public void setCorp_regist_id(String corpRegistId) {
		corp_regist_id = corpRegistId;
	}
	public String getCorp_tax_start() {
		return corp_tax_start;
	}
	public void setCorp_tax_start(String corpTaxStart) {
		corp_tax_start = corpTaxStart;
	}
	public String getCorp_tax_end() {
		return corp_tax_end;
	}
	public void setCorp_tax_end(String corpTaxEnd) {
		corp_tax_end = corpTaxEnd;
	}
	public String getSoccredbegdate() {
		return soccredbegdate;
	}
	public void setSoccredbegdate(String soccredbegdate) {
		this.soccredbegdate = soccredbegdate;
	}
	public String getSoccredenddate() {
		return soccredenddate;
	}
	public void setSoccredenddate(String soccredenddate) {
		this.soccredenddate = soccredenddate;
	}
	/**** REQFRZG-151112-20 end ***/
	public String getTaxptype() {
		return taxptype;
	}
	public void setTaxptype(String taxptype) {
		this.taxptype = taxptype;
	}
	public String getTaxreg_addr() {
		return taxreg_addr;
	}
	public void setTaxreg_addr(String taxreg_addr) {
		this.taxreg_addr = taxreg_addr;
	}
	public String getSoccredit() {
		return soccredit;
	}
	public void setSoccredit(String soccredit) {
		this.soccredit = soccredit;
	}
	public String getContact_phone() {
		return contact_phone;
	}
	public void setContact_phone(String contactPhone) {
		contact_phone = contactPhone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBank_code() {
		return bank_code;
	}
	public void setBank_code(String bankCode) {
		bank_code = bankCode;
	}
	public String getAccnt_nmbr() {
		return accnt_nmbr;
	}
	public void setAccnt_nmbr(String accntNmbr) {
		accnt_nmbr = accntNmbr;
	}
	public String getComp_addr() {
		return comp_addr;
	}
	public void setComp_addr(String compAddr) {
		comp_addr = compAddr;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String regDate) {
		reg_date = regDate;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getTaxregid() {
		return taxregid;
	}
	public void setTaxregid(String taxregid) {
		this.taxregid = taxregid;
	}
	public String getCredentialtype() {
		return credentialtype;
	}
	public void setCredentialtype(String credentialtype) {
		this.credentialtype = credentialtype;
	}
	public String getCredentialid() {
		return credentialid;
	}
	public void setCredentialid(String credentialid) {
		this.credentialid = credentialid;
	}
	public String getCmpny_code() {
		return cmpny_code;
	}
	public void setCmpny_code(String cmpnyCode) {
		cmpny_code = cmpnyCode;
	}
	public String getContact_person() {
		return contact_person;
	}
	public void setContact_person(String contactPerson) {
		contact_person = contactPerson;
	}
	public String getStaff_count() {
		return staff_count;
	}
	public void setStaff_count(String staffCount) {
		staff_count = staffCount;
	}
	public String getIs_corporation() {
		return is_corporation;
	}
	public void setIs_corporation(String isCorporation) {
		is_corporation = isCorporation;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "GCustInfoRet{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				", phone='" + phone + '\'' +
				", bank_code='" + bank_code + '\'' +
				", accnt_nmbr='" + accnt_nmbr + '\'' +
				", comp_addr='" + comp_addr + '\'' +
				", zipcode='" + zipcode + '\'' +
				", reg_date='" + reg_date + '\'' +
				", range='" + range + '\'' +
				", taxregid='" + taxregid + '\'' +
				", credentialtype='" + credentialtype + '\'' +
				", credentialid='" + credentialid + '\'' +
				", cmpny_code='" + cmpny_code + '\'' +
				", contact_person='" + contact_person + '\'' +
				", contact_phone='" + contact_phone + '\'' +
				", staff_count='" + staff_count + '\'' +
				", is_corporation='" + is_corporation + '\'' +
				", taxptype='" + taxptype + '\'' +
				", taxreg_addr='" + taxreg_addr + '\'' +
				", soccredit='" + soccredit + '\'' +
				", soccredbegdate='" + soccredbegdate + '\'' +
				", soccredenddate='" + soccredenddate + '\'' +
				", customer_type='" + customer_type + '\'' +
				", corpbegdate='" + corpbegdate + '\'' +
				", corpenddate='" + corpenddate + '\'' +
				", corp_regist_id='" + corp_regist_id + '\'' +
				", corp_tax_start='" + corp_tax_start + '\'' +
				", corp_tax_end='" + corp_tax_end + '\'' +
				'}';
	}
}
