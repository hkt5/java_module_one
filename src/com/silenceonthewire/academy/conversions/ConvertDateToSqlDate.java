package com.silenceonthewire.academy.conversions;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class ConvertDateToSqlDate {
	
	public Date convertDateToSQL(SimpleDateFormat date){
	     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	     Date sqlDate = Date.valueOf(simpleDateFormat.format(date));
	     return sqlDate;
	}

}
