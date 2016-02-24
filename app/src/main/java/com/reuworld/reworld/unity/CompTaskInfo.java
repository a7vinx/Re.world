package com.reuworld.reworld.unity;

/**
 * Created by Arvin.X on 16/2/6.
 * Data Unity V1.0
 */
public class CompTaskInfo extends BriefTaskInfo{
    //任务保证金
    int deposit;
    //任务最后编辑时间
    String lastEditTime;
    //任务接取者等待列表(根据isComfirmNeed为已接取人数)
    String waitMercenary;
    //任务接取者（们）
    String mercenary;
    //任务完成者（们）
    String compMercenary;
    //任务截止时间
    String endTime;
    //任务附图
    String attachPNG;
    //任务是否需要发布者确认
    boolean isComfirmNeed;
    //任务地域信息（为空则不包含地域信息）
    String areaDescription;
    //任务描述
    String taskDescription;
    //已结束任务评价信息
    String evaluateInfo;

    public CompTaskInfo(String taskTitle,int taskID,String promulgatorName,int bounty,int state,String promulgateTime,String labels,String waitTime,
                        int deposit,String lastEditTime,String waitMercenary,String mercenary,String compMercenary,String endTime,String attachPNG,
                        boolean isComfirmNeed, String areaDescription,String taskDescription,String evaluateInfo){
        super(taskTitle,taskID,promulgatorName,bounty,state,promulgateTime,labels,waitTime);
        this.deposit=deposit;
        this.lastEditTime=lastEditTime;
        this.waitMercenary=waitMercenary;
        this.mercenary=mercenary;
        this.compMercenary=compMercenary;
        this.endTime=endTime;
        this.attachPNG=attachPNG;
        this.isComfirmNeed=isComfirmNeed;
        this.areaDescription=areaDescription;
        this.taskDescription=taskDescription;
        this.evaluateInfo=evaluateInfo;
    }

    public boolean isComfirmNeed() {
        return isComfirmNeed;
    }


    public int getDeposit() {
        return deposit;
    }

    public String getAreaDescription() {
        return areaDescription;
    }

    public String getAttachPNG() {
        return attachPNG;
    }

    public String getCompMercenary() {
        return compMercenary;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getLastEditTime() {
        return lastEditTime;
    }

    public String getMercenary() {
        return mercenary;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getWaitMercenary() {
        return waitMercenary;
    }

    public String getEvaluateInfo() {
        return evaluateInfo;
    }

    public void setAreaDescription(String areaDescription) {
        this.areaDescription = areaDescription;
    }

    public void setAttachPNG(String attachPNG) {
        this.attachPNG = attachPNG;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setIsComfirmNeed(boolean isComfirmNeed) {
        this.isComfirmNeed = isComfirmNeed;
    }

    public void setLastEditTime(String lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}
