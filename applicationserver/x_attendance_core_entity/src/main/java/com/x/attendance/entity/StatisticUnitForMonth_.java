/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.attendance.entity.StatisticUnitForMonth.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sun Sep 02 18:43:14 CST 2018")
public class StatisticUnitForMonth_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<StatisticUnitForMonth,Long> abNormalDutyCount;
    public static volatile SingularAttribute<StatisticUnitForMonth,Double> absenceDayCount;
    public static volatile SingularAttribute<StatisticUnitForMonth,Double> employeeCount;
    public static volatile SingularAttribute<StatisticUnitForMonth,String> id;
    public static volatile SingularAttribute<StatisticUnitForMonth,Long> lackOfTimeCount;
    public static volatile SingularAttribute<StatisticUnitForMonth,Long> lateCount;
    public static volatile SingularAttribute<StatisticUnitForMonth,Long> leaveEarlyCount;
    public static volatile SingularAttribute<StatisticUnitForMonth,Long> offDutyCount;
    public static volatile SingularAttribute<StatisticUnitForMonth,Long> onDutyCount;
    public static volatile SingularAttribute<StatisticUnitForMonth,Double> onDutyEmployeeCount;
    public static volatile SingularAttribute<StatisticUnitForMonth,Double> onSelfHolidayCount;
    public static volatile SingularAttribute<StatisticUnitForMonth,String> statisticMonth;
    public static volatile SingularAttribute<StatisticUnitForMonth,String> statisticYear;
    public static volatile SingularAttribute<StatisticUnitForMonth,String> topUnitName;
    public static volatile SingularAttribute<StatisticUnitForMonth,String> unitName;
}
