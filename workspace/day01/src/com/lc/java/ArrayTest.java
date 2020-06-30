package com.lc.java;
/**
 * 
 * @Description 数组的学习
 * @author lcstart Email:18518571399@163.com
 * @version 
 * @date 2020年6月23日下午4:28:45
 *
 */
 /*
  * 一、数组的概述
  * 1、数组的理解：数组(Array)，是多个相同数据类型按照
  * 一定的顺序排列的集合，并使用一个名字命名，
  * 并通过编号的方式对这些数据进行统一管理
  * 
  * 2、数组相关的概念：
  * >数组名
  * >元素
  * >角标、下标、索引
  * >数组的长度：元素的个数
  * 
  * 3、数组的特点：
  * ① 数组是有序排列的
  * ② 数组属于引用数据类型，数组的元素即可以是基本数据类型，也可以是引用数据类型
  * ③ 创建数组对象会在内存中开辟一整块连续的空间
  * ④ 数组的长度一旦确定，就不能更改
  * 
  * 4、数组的分类：
  * ① 按照维数：一维数组、二维数组、。。。
  * ② 按照数组元素的类型：基本数据类型的数组，引用数据类型元素的数组
  * 
  */
public class ArrayTest {
	public static void main (String[] args){
		int [][] arr = new int[4][];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr);
	}

}
