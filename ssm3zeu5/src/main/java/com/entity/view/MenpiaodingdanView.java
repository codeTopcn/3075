package com.entity.view;

import com.entity.MenpiaodingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 门票订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 09:39:23
 */
@TableName("menpiaodingdan")
public class MenpiaodingdanView  extends MenpiaodingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MenpiaodingdanView(){
	}
 
 	public MenpiaodingdanView(MenpiaodingdanEntity menpiaodingdanEntity){
 	try {
			BeanUtils.copyProperties(this, menpiaodingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
