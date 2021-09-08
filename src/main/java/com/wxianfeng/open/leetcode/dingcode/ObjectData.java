package com.wxianfeng.open.leetcode.dingcode;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/08/10 2:14 PM
 */

import lombok.Data;

@Data
public class ObjectData implements Comparable<ObjectData>{

    /**
     * 初始化值
     **/
    private final int data;

    /**
     * 是否为偶数
     */
    private boolean isEven;

    /**
     * 能够被3整除
     */
    private boolean isTrip;

    /**
     *
     * @return
     */
    public int getData(){
        return data;
    }

    /**
     *
     * @param initData
     */
    public ObjectData(int initData){
        data = initData;
        isEven = false;
        isTrip = false;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(ObjectData o) {
        if(this.data > o.data){
            return 1;
        }else if(this.data < o.data){
            return -1;
        }else{
            return 0;
        }

    }
}







