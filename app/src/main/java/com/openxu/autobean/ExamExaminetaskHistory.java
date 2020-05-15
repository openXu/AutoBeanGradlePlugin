package com.openxu.autobean;

import lombok.Data;

/**
* Author: openXu
* Time: 2020/05/15 16:51:35
* class: ExamExaminetaskHistory
* Description:
*/
@Data
public class  ExamExaminetaskHistory {

    private String TaskID;
    private String TaskCode;
    private String TaskName;
    private String Descript;
    private String ProjectID;
    private String ProjectName;
    private String PlanID;
    private String PlanName;
    private Integer EnableUploadAttach;
    private Integer IsRisk;
    private Integer RectifyTimeLimit;
    private Integer LimitMode;
    private Integer ExamineMode;
    private Integer RouteMode;
    private String TaskFrequency;
    private String TaskStartTime;
    private String TaskEndTime;
    private String TaskSetEndTime;
    private String TaskRemindTime;
    private Integer TaskStatus;
    private String CompanyID;
    private Integer IsTaskExamine;
    private String TaskExamineUserID;
    private String TaskExamineTime;
    private String TaskExamineExplain;
    private Integer TotalItemCount;
    private Integer NormalItemCount;
    private Integer ExamItemCount;
    private Integer AbnormalItemCount;
    private Integer TotalIndicatorCount;
    private Integer ExamIndicatorCount;
    private Integer NormalIndicatorCount;
    private Integer AbnormalIndicatorCount;
    private String CreatedBy;
    private String CreatedByName;
    private String CreatedDate;
    private String ModifiedBy;
    private String ModifiedByName;
    private String ModifiedDate;
}
