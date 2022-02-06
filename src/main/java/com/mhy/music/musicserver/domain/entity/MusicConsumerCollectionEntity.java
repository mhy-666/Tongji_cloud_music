package com.mhy.music.musicserver.domain.entity;


import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;

/**
 *
 * @author mhy
 * @date 2022-02-06
 */
@Data
@Table(name = "music_consumer_collection")
public class MusicConsumerCollectionEntity {

	/**
	 * 收藏id
	 */
	@Id
	@GeneratedValue(generator = "JDBC")
	private Integer id;

	/**
	 * 用户id
	 */
	private Integer consumerId;

	/**
	 * 歌曲id
	 */
	private Integer songId;

	/**
	 * 歌单id
	 */
	private Integer musicListId;

	/**
	 * 收藏的类型（1是歌曲0是歌单）
	 */
	private String collectType;

	/**
	 * 收藏创建时间
	 */
	private LocalDateTime createTime;


}
