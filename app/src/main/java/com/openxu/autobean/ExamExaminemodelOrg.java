package com.openxu.autobean;

import lombok.Data;

/**
* Author: openXu
* Time: 2020/05/15 16:51:34
* class: ExamExaminemodelOrg
* Description:
*/
@Data
public class  ExamExaminemodelOrg {

    private String ExamineModelOrgID;
    private String ExamineModelCode;
    private String ExamineModelName;
    private String Description;
    private String CompanyID;
    private String CompanyName;
    private Integer Source;
    private String SourceID;
    private Integer IsDelete;
    private String CreatedBy;
    private String CreatedByName;
    private String CreatedDate;
    private String ModifiedBy;
    private String ModifiedByName;
    private String ModifiedDate;
}
