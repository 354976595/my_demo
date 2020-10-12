drop table if exists  action ;
CREATE TABLE `action` (
  `id` bigint(22) NOT NULL AUTO_INCREMENT,
  `action_name` varchar(255) DEFAULT NULL COMMENT '动作名称',
  `cate_name` varchar(255) DEFAULT NULL,
  `cate` bigint(22) DEFAULT NULL COMMENT '动作分类',
  `image` varchar(255) DEFAULT NULL COMMENT 'url',
  `video` varchar(255) DEFAULT NULL COMMENT '动作视频',
  `cover_image` varchar(255) DEFAULT NULL COMMENT '动作封面',
  `voice` varchar(255) DEFAULT NULL COMMENT '语音',
  `level` tinyint(2) DEFAULT NULL COMMENT '难度',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `del_flag` tinyint(2) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1303927886080245762 DEFAULT CHARSET=utf8mb4 COMMENT='动作库表';