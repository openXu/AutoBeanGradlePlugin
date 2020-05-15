package com.openxu.autobean;

import lombok.Data;

/**
* Author: openXu
* Time: 2020/05/15 16:51:35
* class: ExamExamineplan
* Description:
*/
@Data
public class  ExamExamineplan {

    private String PlanID;
    private String PlanCode;
    private String PlanName;
    private Integer PlanType;
    private String Descript;
    private String ProjectID;
    private String ProjectName;
    private String PlanStartDate;
    private String PlanEndDate;
    private String TaskCycleType;
    private Integer TaskCycle;
    private Integer ExamCycleType;
    private Integer ExamStartTimeStamp;
    private Integer ExamEndTimeStamp;
    private String ExamStartTime;
    private String ExamEndTime;
    private String StartTime;
    private String PrevTaskStartTime;
    private String PrevTaskEndTime;
    private String ThisExamStartTime;
    private String ThisTaskEndTime;
    private String AssignStartTime;
    private String AssignEndTime;
    private Integer EnableUploadAttach;
    private Integer IsRisk;
    private Integer RectifyTimeLimit;
    private Integer LimitMode;
    private Integer ExamineMode;
    private Integer RouteMode;
    private Integer TaskCount;
    private String PlanUser;
    private String PlanUserName;
    private String PlanDate;
    private String AuditUser;
    private String AuditUserName;
    private String AuditDate;
    private Integer PlanStatus;
    private Integer IsWeekend;
    private Integer IsVacation;
    private String TaskFrequency;
    private String CompanyID;
    private String CompanyName;
    private Integer IsReminder;
    private String LeaderPost;
    private String LeaderPostName;
    private String LeaderUser;
    private String LeaderUserName;
    private Integer ReminderTime;
    private Integer ReminderTimeNumber;
    private String ReminderTimeNumberUnit;
    private Integer IsDelete;
    private String CreatedBy;
    private String CreatedByName;
    private String CreatedDate;
    private String ModifiedBy;
    private String ModifiedDate;
    private String ModifiedByName;
}
