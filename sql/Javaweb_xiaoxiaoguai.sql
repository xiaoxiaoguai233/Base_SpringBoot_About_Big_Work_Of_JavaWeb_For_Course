/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : Javaweb_xiaoxiaoguai

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 23/12/2020 20:08:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `listName` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `gender` int(2) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `typeid` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `fk_typeemp` (`typeid`) USING BTREE,
  CONSTRAINT `fk_typeemp` FOREIGN KEY (`typeid`) REFERENCES `typeemp` (`empId`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of emp
-- ----------------------------
BEGIN;
INSERT INTO `emp` VALUES (25, '刘备', '12121454545@qq.com', 0, '2020-05-29', 3);
INSERT INTO `emp` VALUES (27, '关羽', '501532090@qq.com', 0, '2020-05-28', 1);
INSERT INTO `emp` VALUES (28, '吴泽胜', '2571312654@qq.com', 1, '2020-12-18', 2);
INSERT INTO `emp` VALUES (29, '张三', '123456789@qq.com', 1, '2020-12-23', 3);
COMMIT;

-- ----------------------------
-- Table structure for typeemp
-- ----------------------------
DROP TABLE IF EXISTS `typeemp`;
CREATE TABLE `typeemp` (
  `empId` int(5) NOT NULL AUTO_INCREMENT,
  `empname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`empId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of typeemp
-- ----------------------------
BEGIN;
INSERT INTO `typeemp` VALUES (1, '教育部');
INSERT INTO `typeemp` VALUES (2, '三国部');
INSERT INTO `typeemp` VALUES (3, '科研部');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(10) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, 'admin', '123456');
INSERT INTO `user` VALUES (2, 'admin2', '123456');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
