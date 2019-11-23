/**
 * 
 */
package org.kesina.angular.swe642;

/**
 * @author kesin
 *
 */
	
	

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.xml.bind.annotation.XmlRootElement;

	/**
	 * Person entity. @author MyEclipse Persistence Tools
	 */
	@XmlRootElement
	@Entity
	@Table(name = "STUDENT")
	public class Student  implements java.io.Serializable {
		private static final long SerialVersionUIDAdder = 1L;

		Student(){
			
		}
		// The StudentBean has attributes that matches most of the Student Survey Form fields, except the Data field
			@Id
			//@GeneratedValue(strategy = GenerationType.AUTO)
			@Column(name="STUDENTID",unique=true)
			private String studentId;

			//@Column(name="USERNAME")
			private String username;
			
		//	@Column(name="STREET_ADD")
			private String streetAdd;

			//@Column(name="ZIPCODE")
			private String zipcode;

			//@Column(name="CITY")
			private String city;

			//@Column(name="STATE")
			private String state;
			
			//@Column(name="EMAIL")
			private String email;
			
			//@Column(name="PHONE")
			private String phone;

			//@Column(name="URL")
			private String url;
			
			//@Column(name="DATE_OF_SURVEY")
			private String date_of_survey;
			
			//@Column(name="LIKES")
			private String likes;
			
			//@Column(name="INTEREST_SOURCE")
			private String interest_source;
			
			//@Column(name="ADDITIONAL_COMMENT")
			private String additional_comment;
			
			//@Column(name="YEAR")
			private String year;
			
			//@Column(name="GRADUATION_MONTH")
			private String graduation_month;
			
			//@Column(name="LIKELY_TO_RECOMMEND")
			private String likely_to_recommend;
			
			//@Column(name="DATA")
			private String data;
			
			private Double mean;
			
			private Double stdDev;
				/**
			 * @return the mean
			 */
			public Double getMean() {
				return mean;
			}
			/**
			 * @param mean the mean to set
			 */
			public void setMean(Double mean) {
				this.mean = mean;
			}
			/**
			 * @return the stdDev
			 */
			public Double getStdDev() {
				return stdDev;
			}
			/**
			 * @param stdDev the stdDev to set
			 */
			public void setStdDev(Double stdDev) {
				this.stdDev = stdDev;
			}
				/**
				 * @return the studentId
				 */
				public String getStudentId() {
					return studentId;
				}
				/**
				 * @param studentId the studentId to set
				 */
				public void setStudentId(String studentId) {
					this.studentId = studentId;
				}
				/**
				 * @return the username
				 */
				public String getUsername() {
					return username;
				}
				/**
				 * @param username the username to set
				 */
				public void setUsername(String username) {
					this.username = username;
				}
				/**
				 * @return the street_add
				 */
				public String getStreetAdd() {
					return streetAdd;
				}
				/**
				 * @param street_add the street_add to set
				 */
				public void setStreetAdd(String streetAdd) {
					this.streetAdd = streetAdd;
				}
				/**
				 * @return the zipcode
				 */
				public String getZipcode() {
					return zipcode;
				}
				/**
				 * @param zipcode the zipcode to set
				 */
				public void setZipcode(String zipcode) {
					this.zipcode = zipcode;
				}
				/**
				 * @return the city
				 */
				public String getCity() {
					return city;
				}
				/**
				 * @param city the city to set
				 */
				public void setCity(String city) {
					this.city = city;
				}
				/**
				 * @return the state
				 */
				public String getState() {
					return state;
				}
				/**
				 * @param state the state to set
				 */
				public void setState(String state) {
					this.state = state;
				}
				/**
				 * @return the email
				 */
				public String getEmail() {
					return email;
				}
				/**
				 * @param email the email to set
				 */
				public void setEmail(String email) {
					this.email = email;
				}
				/**
				 * @return the phone
				 */
				public String getPhone() {
					return phone;
				}
				/**
				 * @param phone the phone to set
				 */
				public void setPhone(String phone) {
					this.phone = phone;
				}
				/**
				 * @return the url
				 */
				public String getUrl() {
					return url;
				}
				/**
				 * @param url the url to set
				 */
				public void setUrl(String url) {
					this.url = url;
				}
				/**
				 * @return the date_of_survey
				 */
				public String getDate_of_survey() {
					return date_of_survey;
				}
				/**
				 * @param date_of_survey the date_of_survey to set
				 */
				public void setDate_of_survey(String date_of_survey) {
					this.date_of_survey = date_of_survey;
				}
				/**
				 * @return the likes
				 */
				public String getLikes() {
					return likes;
				}
				/**
				 * @param likes the likes to set
				 */
				public void setLikes(String likes) {
					this.likes = likes;
				}
				/**
				 * @return the interest_source
				 */
				public String getInterest_source() {
					return interest_source;
				}
				/**
				 * @param interest_source the interest_source to set
				 */
				public void setInterest_source(String interest_source) {
					this.interest_source = interest_source;
				}
				/**
				 * @return the additional_comment
				 */
				public String getAdditional_comment() {
					return additional_comment;
				}
				/**
				 * @param additional_comment the additional_comment to set
				 */
				public void setAdditional_comment(String additional_comment) {
					this.additional_comment = additional_comment;
				}
				/**
				 * @return the year
				 */
				public String getYear() {
					return year;
				}
				/**
				 * @param year the year to set
				 */
				public void setYear(String year) {
					this.year = year;
				}
				/**
				 * @return the graduation_month
				 */
				public String getGraduation_month() {
					return graduation_month;
				}
				/**
				 * @param graduation_month the graduation_month to set
				 */
				public void setGraduation_month(String graduation_month) {
					this.graduation_month = graduation_month;
				}
				/**
				 * @return the likely_to_recommend
				 */
				public String getLikely_to_recommend() {
					return likely_to_recommend;
				}
				/**
				 * @param likely_to_recommend the likely_to_recommend to set
				 */
				public void setLikely_to_recommend(String likely_to_recommend) {
					this.likely_to_recommend = likely_to_recommend;
				}
				
				public String getData() {
					return data;
				}
				
				public void setData(String data) {
					this.data=data;
				}
				
				
				/**
				 * @param studentId
				 * @param username
				 * @param street_add
				 * @param zipcode
				 * @param city
				 * @param state
				 * @param email
				 * @param phone
				 * @param url
				 * @param date_of_survey
				 * @param likes
				 * @param interest_source
				 * @param additional_comment
				 * @param year
				 * @param graduation_month
				 * @param likely_to_recommend
				 * @param data
				 */
				public Student(String studentId, String username, String streetAdd, String zipcode, String city, String state,
						String email, String phone, String url, String date_of_survey, String likes, String interest_source,
						String additional_comment, String year, String graduation_month, String likely_to_recommend, String data) {
					this.studentId = studentId;
					this.username = username;
					this.streetAdd = streetAdd;
					this.zipcode = zipcode;
					this.city = city;
					this.state = state;
					this.email = email;
					this.phone = phone;
					this.url = url;
					this.date_of_survey = date_of_survey;
					this.likes = likes;
					this.interest_source = interest_source;
					this.additional_comment = additional_comment;
					this.year = year;
					this.graduation_month = graduation_month;
					this.likely_to_recommend = likely_to_recommend;
					this.data = data;
				}
				
				
				
		

}
