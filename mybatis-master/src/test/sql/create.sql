/*
Navicat MySQL Data Transfer

Source Server         : loc
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : mybatis_test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2021-01-11 10:41:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `config`
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `config_name` varchar(32) NOT NULL COMMENT '键名',
  `config_value` varchar(255) DEFAULT NULL COMMENT '配置项',
  `description` varchar(255) DEFAULT NULL COMMENT '配置描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8 COMMENT='配置表';
