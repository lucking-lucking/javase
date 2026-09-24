package com.shanshui.demo1;

/**
 * 集合用于存储一批元素，功能和数组相似，当然集合和数组也有不同的地方
 *   相同：都是容器，都能够存储一批数据
 *   不同：
 *        数组的大小是固定的，一旦声明长度就不能再次更改，但是集合的大小不是固定的，长度可变
 *        数组可以存储基本数据类型，但是集合只能存储对象
 *        数组存放的数据类型只有一种，但是集合可以存储不同种类的元素
 *
 * 集合的体系结构（单列集合）：
 *    根接口：Collection
 *           List 子接口 间接的继承类Collection  有序可重复
 *                ArrayList 实现类
 *                LinkedList 实现类
 *           Set 子接口  直接继承了Collection  无序不重复
 *               HashSet  实现类
 *               TreeSet  实现类
 */
public class Demo1 {
}
