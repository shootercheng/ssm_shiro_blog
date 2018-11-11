package com.luoxiao.constant;

public class CommonConstant {
	
	public enum ROLE {
		ADMIN(1),
		MANAGER(2),
		USER(3);
		private int i;
		private ROLE(int i){
			this.i = i;
		}
		public Integer getI(){
			return i;
		}
	}
}
