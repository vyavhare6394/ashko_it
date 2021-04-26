package com.chegg.ank;

public class Student {

		private String firstName;

		public Student(String firstName) {
			super();
			this.firstName = firstName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		
		@Override
		public boolean equals(Object that){
		  if(this == that) return true;//if both of them points the same address in memory

		  if(!(that instanceof Student)) return false; // if "that" is not a People or a childclass

		  Student thatPeople = (Student)that; // than we can cast it to People safely

		  return this.firstName.equals(thatPeople.firstName) ;// if they have the same name  objects are equal unless they're pointing to different memory adresses
		}

	    @Override
	    public int hashCode() {
	        int result = firstName.hashCode();
	        return result;
	    }

		@Override
		public String toString() {
			return "Student [firstName=" + firstName + "]";
		}


		
		
		
	
}
