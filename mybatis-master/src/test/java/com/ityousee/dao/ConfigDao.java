package com.ityousee.dao;


import com.ityousee.model.Config;

import java.util.List;

public interface ConfigDao {
	/**
	 *
	 */
	int deleteById (Long id);

	/**
	 *
	 */
	int insert (Config record);

	/**
	 *
	 */
	int insertSelective (Config record);

	/**
	 *
	 */
	Config selectById (Long id);

	/**
	 *
	 */
	int updateByIdSelective (Config record);

	/**
	 *
	 */
	int updateById (Config record);

	/**
	 * 根据配置文件名称查找配置文件
	 *
	 * @param string
	 * @return
	 */
	Config findConfigByName (String string);

	/**
	 * 查找所有的配置文件
	 *
	 * @return
	 */
	List<Config> findAllConfig ();


	/** 根据configName更新configValue */
	void updateByConfigName (String configName, String configValue);
}
