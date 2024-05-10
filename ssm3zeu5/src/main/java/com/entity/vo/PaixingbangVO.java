package com.entity.vo;

import com.entity.PaixingbangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 排行榜
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-26 09:39:23
 */
public class PaixingbangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
