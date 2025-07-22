package Entityclassassignment2;

public class product {
	private String watch;
	private String mobile;
	private String bottle;
	
	public product() {
		this.watch="Titan";
		this.mobile="iPhone";
		this.bottle="Steel";
	}
	public String getWatch() {
		return watch;
	}
	public void setWatch(String watch) {
		this.watch = watch;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getBottle() {
		return bottle;
	}
	public void setBottle(String bottle) {
		this.bottle = bottle;
	}
	@Override
	public String toString() {
		return "Product [watch is " + watch + ", mobile is " + mobile + ", bottle is " + bottle + "]";
	}
	
}
