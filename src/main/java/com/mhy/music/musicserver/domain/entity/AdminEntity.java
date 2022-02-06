package com.mhy.music.musicserver.domain.entity;


import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

/**
 * 管理员
 *
 * @author mhy
 * @date 2022-02-06
 */
@Data
@Table(name = "admin")
public class AdminEntity {

	/**
	 * 管理员id
	 */
	@Id
	@GeneratedValue(generator = "JDBC")
	private Integer id;

	/**
	 * 管理员姓名
	 */
	private String name;

	/**
	 * 管理员密码
	 */
	private String password;


}
