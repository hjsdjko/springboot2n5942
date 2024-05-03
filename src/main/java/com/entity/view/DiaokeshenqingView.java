package com.entity.view;

import com.entity.DiaokeshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 调课申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-07 08:15:46
 */
@TableName("diaokeshenqing")
public class DiaokeshenqingView  extends DiaokeshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiaokeshenqingView(){
	}
 
 	public DiaokeshenqingView(DiaokeshenqingEntity diaokeshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, diaokeshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}