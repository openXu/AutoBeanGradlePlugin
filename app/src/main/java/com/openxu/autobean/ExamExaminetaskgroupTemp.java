package com.openxu.autobean;

import lombok.Data;

/**
* Author: openXu
* Time: 2020/05/15 16:51:35
* class: ExamExaminetaskgroupTemp
* Description:
*/
@Data
public class  ExamExaminetaskgroupTemp {

    private String TaskGroupID;
    private String TaskID;
    private String ExamPostID;
    private String ExamCompanyID;
    private String ClassID;
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
