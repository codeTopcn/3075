package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 排行榜
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-26 09:39:23
 */
@TableName("paixingbang")
public class PaixingbangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PaixingbangEntity() {
		
	}
	
	public PaixingbangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 榜单名称
	 */
					
	private String bangdanmingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 标签
	 */
					
	private String biaoqian;
	
	/**
	 * 数据来源
	 */
					
	private String shujulaiyuan;
	
	/**
	 * 排行榜内容
	 */
					
	private String paixingbangneirong;
	
	/**
	 * 更新日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：榜单名称
	 */
	public void setBangdanmingcheng(String bangdanmingcheng) {
		this.bangdanmingcheng = bangdanmingcheng;
	}
	/**
	 * 获取：榜单名称
	 */
	public String getBangdanmingcheng() {
		return bangdanmingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：标签
	 */
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	/**
	 * 获取：标签
	 */
	public String getBiaoqian() {
		return biaoqian;
	}
	/**
	 * 设置：数据来源
	 */
	public void setShujulaiyuan(String shujulaiyuan) {
		this.shujulaiyuan = shujulaiyuan;
	}
	/**
	 * 获取：数据来源
	 */
	public String getShujulaiyuan() {
		return shujulaiyuan;
	}
	/**
	 * 设置：排行榜内容
	 */
	public void setPaixingbangneirong(String paixingbangneirong) {
		this.paixingbangneirong = paixingbangneirong;
	}
	/**
	 * 获取：排行榜内容
	 */
	public String getPaixingbangneirong() {
		return paixingbangneirong;
	}
	/**
	 * 设置：更新日期
	 */
	public void setGengxinriqi(Date gengxinriqi) {
		this.gengxinriqi = gengxinriqi;
	}
	/**
	 * 获取：更新日期
	 */
	public Date getGengxinriqi() {
		return gengxinriqi;
	}

}
