package program;

public class Student {

	private String name = "Default";
	private Byte age;
	private String gender;
	private double[] scores = new double[3];
	private double media;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Byte getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Byte age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the scores
	 */
	public double[] getScores() {
		return scores;
	}
	/**
	 * @param scores the scores to set
	 */
	public void setScores(double[] scores) {
		this.scores = scores;
	}
	/**
	 * @return the media
	 */
	public double getMedia() {
		return media;
	}
	/**
	 * @param media the media to set
	 */
	public void setMedia(double media) {
		this.media = media;
	}
	

}
