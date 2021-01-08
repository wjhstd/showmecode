package com.ityousee.model;

public class Config {
	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 键名
	 */
	private String configName;

	/**
	 * 配置项
	 */
	private String configValue;

	/**
	 * 配置描述
	 */
	private String description;

	public Config (String configName, String configValue) {
		this.configName = configName;
		this.configValue = configValue;
	}



	public Config () {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 *
	 * 主键
	 *
	 * @return the value of config.id
	 */
	public Long getId() {
		return id;
	}

	/**
	 *
	 * 主键
	 *
	 * @param id the value for config.id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 *
	 * 键名
	 *
	 * @return the value of config.config_name
	 */
	public String getConfigName() {
		return configName;
	}

	/**
	 *
	 * 键名
	 *
	 * @param configName the value for config.config_name
	 */
	public void setConfigName(String configName) {
		this.configName = configName == null ? null : configName.trim();
	}

	/**
	 *
	 * 配置项
	 *
	 * @return the value of config.config_value
	 */
	public String getConfigValue() {
		return configValue;
	}

	/**
	 *
	 * 配置项
	 *
	 * @param configValue the value for config.config_value
	 */
	public void setConfigValue(String configValue) {
		this.configValue = configValue == null ? null : configValue.trim();
	}

	/**
	 *
	 * 配置描述
	 *
	 * @return the value of config.description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 *
	 * 配置描述
	 *
	 * @param description the value for config.description
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}
}
