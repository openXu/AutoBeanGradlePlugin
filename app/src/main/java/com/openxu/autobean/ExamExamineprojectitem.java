package com.openxu.autobean;

import lombok.Data;

/**
* Author: openXu
* Time: 2020/05/15 16:51:35
* class: ExamExamineprojectitem
* Description:
*/
@Data
public class  ExamExamineprojectitem {

    private String ProjectItemID;
    private String ProjectObjectID;
    private String ProjectID;
    private String ProjectGroupID;
    private String IndicatorID;
    private String IndicatorCode;
    private String IndicatorName;
    private String DisplayName;
    private Integer IsCounter;
    private String CountUnit;
    private Float StandardScore;
    private Float MaxScore;
    private Float MinScore;
    private String IndicatorSign;
    private Float Scale;
    private String ExamineMode;
    private String IndicatorType;
    private String EnumStrs;
    private String DataType;
    private String DefaultValue;
    private Double UpperLimit;
    private Double LowerLimit;
    private Integer IndicatorPrecision;
    private Integer RiskLevel;
    private Integer HazardLevel;
    private Integer AccidentLevel;
    private String CreatedBy;
    private String CreatedByName;
    private String CreatedDate;
    private String ModifiedBy;
    private String ModifiedByName;
    private String ModifiedDate;
}
