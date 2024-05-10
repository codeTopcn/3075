package com.entity.vo;

import com.entity.RemenjingdianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 热门景点
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-26 09:39:23
 */
public class RemenjingdianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 等级
	 */
	
	private String dengji;
		
	/**
	 * 景点类型
	 */
	
	private String jingdianleixing;
		
	/**
	 * 开放时间
	 */
	
	private String kaifangshijian;
		
	/**
	 * 门票价格
	 */
	
	private Float menpiaojiage;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 景点位置
	 */
	
	private String jingdianweizhi;
		
	/**
	 * 景点评分
	 */
	
	private Integer jingdianpingfen;
		
	/**
	 * 景点详情
	 */
	
	private String jingdianxiangqing;
		
	/**
	 * 景点周边
	 */
	
	private String jingdianzhoubian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：等级
	 */
	 
	public void setDengji(String dengji) {
		this.dengji = dengji;
	}
	
	/**
	 * 获取：等级
	 */
	public String getDengji() {
		return dengji;
	}
				
	
	/**
	 * 设置：景点类型
	 */
	 
	public void setJingdianleixing(String jingdianleixing) {
		this.jingdianleixing = jingdianleixing;
	}
	
	/**
	 * 获取：景点类型
	 */
	public String getJingdianleixing() {
		return jingdianleixing;
	}
				
	
	/**
	 * 设置：开放时间
	 */
	 
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	
	/**
	 * 获取：开放时间
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
				
	
	/**
	 * 设置：门票价格
	 */
	 
	public void setMenpiaojiage(Float menpiaojiage) {
		this.menpiaojiage = menpiaojiage;
	}
	
	/**
	 * 获取：门票价格
	 */
	public Float getMenpiaojiage() {
		return menpiaojiage;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：景点位置
	 */
	 
	public void setJingdianweizhi(String jingdianweizhi) {
		this.jingdianweizhi = jingdianweizhi;
	}
	
	/**
	 * 获取：景点位置
	 */
	public String getJingdianweizhi() {
		return jingdianweizhi;
	}
				
	
	/**
	 * 设置：景点评分
	 */
	 
	public void setJingdianpingfen(Integer jingdianpingfen) {
		this.jingdianpingfen = jingdianpingfen;
	}
	
	/**
	 * 获取：景点评分
	 */
	public Integer getJingdianpingfen() {
		return jingdianpingfen;
	}
				
	
	/**
	 * 设置：景点详情
	 */
	 
	public void setJingdianxiangqing(String jingdianxiangqing) {
		this.jingdianxiangqing = jingdianxiangqing;
	}
	
	/**
	 * 获取：景点详情
	 */
	public String getJingdianxiangqing() {
		return jingdianxiangqing;
	}
				
	
	/**
	 * 设置：景点周边
	 */
	 
	public void setJingdianzhoubian(String jingdianzhoubian) {
		this.jingdianzhoubian = jingdianzhoubian;
	}
	
	/**
	 * 获取：景点周边
	 */
	public String getJingdianzhoubian() {
		return jingdianzhoubian;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
