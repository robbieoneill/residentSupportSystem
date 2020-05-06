/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residentsupportsystem;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.time.LocalDate;
/**
 *
 * @author robbieoneill
 */
public class WorkHours {
    
    
    public LocalDate startOfNextConsecutiveWeek(){
        LocalDate date = LocalDate.now(); //TODAY (INTERNATIONAL TIME ZONE, BASED ON LOGIC OF DEVICE CURRENT LOCATION)
        System.out.println("NEXT CONSECUTUVE WEEK START -- MONDAY -- "+ date.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
        System.out.println("PREVIOUS LOGICAL WEEK START -- MONDAY -- "+date.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)));
        return (date.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
    }
    
    public void setWorkingHoursTable(){
        
    }
    
    
    
    
}
