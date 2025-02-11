package Enum;

	public enum WeekDay{
		MONDAY(true),
		TUESDAY(true),
		WEDNESDAY(true),
		THURSDAY(true),
		FRIDAY(true),
		SATURDAY(false),
		SUNDAY(false);
		
		private boolean isWeekday;
		
		WeekDay(boolean isWeekday){
			this.isWeekday = isWeekday;
		}
		public String getType() {
			return isWeekday ?"Weekday":"Weekend";
		}
	}
